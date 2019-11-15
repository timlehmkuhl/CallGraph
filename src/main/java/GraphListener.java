public class GraphListener extends CymbolBaseListener {
    CallGraph.Graph graph = new CallGraph.Graph();
    String currentFunctionName = null;


    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
    }


    @Override
    public void exitCallExpr(CymbolParser.CallExprContext ctx) {
        String funcName = ctx.ID().getText();


        if (funcName.equals(currentFunctionName)) {     //Eine Art von Rekursiv?
            if (ctx.getParent() instanceof CymbolParser.ReturnContext) {    //Endrekursiv
                graph.edgeEndrekursiv(currentFunctionName, funcName);
                graph.nodesEndrekursiv.add(currentFunctionName);


            } else {       //Rekursiv
                graph.edgeRekursiv(currentFunctionName, funcName);
                graph.nodesRekursiv.add(currentFunctionName);
            }
        } else {        //nicht Rekursiv
            graph.edge(currentFunctionName, funcName);
            if ((!(ctx.getParent() instanceof CymbolParser.ReturnContext)))
                graph.nodes.add(currentFunctionName);

        }

    }
}




