import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.engine.GraphvizV8Engine;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(".\\src\\main\\resources\\rec.cymbol");
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();
        // show tree in text form
//        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        GraphListener collector = new GraphListener();
        walker.walk(collector, tree);


        String output = collector.graph.toST().render();
      //  System.out.println(output);
        System.out.println(output);
        createFile(output);
        graphviz(output);

    }

    public static void createFile(String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/resources/output.dot"));
        writer.write(str);
        writer.close();
    }

    public static void graphviz(String str) throws IOException {
        File targetFile = new File(".\\src\\main\\resources\\Graph.png");
        Graphviz.useEngine(new GraphvizV8Engine());
        Graphviz.fromString(str).render(Format.PNG).toFile(targetFile);
        Desktop.getDesktop().open(targetFile);
    }



}
