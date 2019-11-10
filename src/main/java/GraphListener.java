public class GraphListener extends CymbolBaseListener {
    CallGraph.Graph graph = new CallGraph.Graph();
    String currentFunctionName = null;

    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
        graph.nodes.add(currentFunctionName);
    }

    public void exitCall(CymbolParser.CallContext ctx) {

        String name = ctx.ID().getText();
        if (currentFunctionName.equals(name)) {
            if (ctx.getParent() instanceof CymbolParser.ReturnContext) {
                graph.edgeEnd(currentFunctionName, name);
                graph.nodesEnd.add(currentFunctionName);
            } else {
                graph.edgeNotEnd(currentFunctionName, name);
                graph.nodesNotEnd.add(currentFunctionName);
            }
        }
        else {
            graph.edge(currentFunctionName,name);
            graph.nodes.add(currentFunctionName);
        }
    }
}

