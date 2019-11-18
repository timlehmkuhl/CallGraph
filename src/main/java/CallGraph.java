import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.Set;

public class CallGraph {

    static class Graph {
        // I'm using org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap

        Set<String> nodes = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edges = new MultiMap<String,String>();

        Set<String> nodesEndrekursiv = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edgesEndrekursiv = new MultiMap<String,String>();

        Set<String> nodesRekursiv = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edgesRekursiv = new MultiMap<String,String>();

        public String toString() {
            return "edges: "+edges.toString()+", functions: "+ nodes;
        }

        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public void edgeEndrekursiv(String source, String target) {
            edgesEndrekursiv.map(source, target);
        }

        public void edgeRekursiv(String source, String target) {
            edgesRekursiv.map(source, target);
        }

        public ST toST() {
            STGroup templates = new STGroupFile(".\\src\\main\\java\\Graph.stg");
            ST st = templates.getInstanceOf("graph");
            st.add("nodesEndrekursiv", nodesEndrekursiv);
            st.add("edgesEndrekursiv", edgesEndrekursiv.getPairs());
            st.add("nodesRekursiv", nodesRekursiv);
            st.add("edgesRekursiv", edgesRekursiv.getPairs());
            st.add("edges", edges.getPairs());
            st.add("nodes", nodes);
            return st;
        }

}



}