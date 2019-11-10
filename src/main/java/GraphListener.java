public class GraphListener extends CymbolBaseListener {
    CallGraph.Graph graph = new CallGraph.Graph();
    String currentFunctionName = null;

    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
        graph.nodes.add(currentFunctionName);
    }

    public void exitCall(CymbolParser.CallContext ctx) {
        String funcName = ctx.ID().getText();
        // map current function to the callee
        graph.edge(currentFunctionName, funcName);
    }
}

