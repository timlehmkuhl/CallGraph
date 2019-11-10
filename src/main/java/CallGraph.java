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

        Set<String> nodesEnd = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edgesEnd = new MultiMap<String,String>();

        Set<String> nodesNotEnd = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edgesNotEnd = new MultiMap<String,String>();


        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public void edgeEnd(String source, String target) {
            edgesEnd.map(source, target);
        }

        public void edgeNotEnd(String source, String target) {
            edgesNotEnd.map(source, target);
        }

        public ST toST() {
            STGroup templates = new STGroupFile(".\\src\\main\\java\\Graph.stg");
            ST st = templates.getInstanceOf("graph");
            st.add("nodesEnd", nodesEnd);
            st.add("edgesEnd",edgesEnd);
            st.add("nodesNotEnd",nodesNotEnd);
            st.add("edgesNotEnd",edgesNotEnd);
            st.add("edges", edges);
            st.add("nodes", nodes);
            return st;
        }

}



}