
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

public class CallGraph {
    /** A graph model of the output. Tracks call from one function to
     *  another by mapping function to list of called functions. E.g.,
     *  f -> [g, h]
     *  Can dump DOT two ways (StringBuilder and ST). Sample output:
     digraph G {
     ... setup ...
     f -> g;
     g -> f;
     g -> h;
     h -> h;
     }
     */
    static class Graph {
        // I'm using org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
        Set<String> nodes = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edges = new MultiMap<String,String>();

        public String toString() {
            return "edges: "+edges.toString()+", functions: "+ nodes;
        }

        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public ST toST() {
           /* ST st = new ST(
                    "digraph G {\n" +
                            "  ranksep=.25; \n" +
                            "  edge [arrowsize=.5]\n" +
                            "  node [shape=circle, fontname=\"ArialNarrow\",\n" +
                            "        fontsize=12, fixedsize=true, height=.45];\n" +
                            "  <funcs:{f | <f>; }>\n" +
                            "  <edgePairs:{edge| <edge.a> -> <edge.b>;}; separator=\"\\n\">\n" +
                            "}\n"
            );*/
            STGroup templates = new STGroupFile(".\\src\\main\\java\\Graph.stg");
            ST st = templates.getInstanceOf("graph");
            st.add("edgePairs", edges.getPairs());
            st.add("funcs", nodes);
            return st;
        }
    }




}