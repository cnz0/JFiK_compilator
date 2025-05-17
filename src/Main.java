package src;

import gen.meincraftLexer;
import gen.meincraftParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import src.IRVisitor;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Start Main.java");

        CharStream input = CharStreams.fromStream(new FileInputStream("example.mc"));
        meincraftLexer lexer = new meincraftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        meincraftParser parser = new meincraftParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());

        ParseTree tree = parser.prog();

        IRVisitor visitor = new IRVisitor();
        visitor.visitProg((meincraftParser.ProgContext) tree);

        //System.out.println("Zakonczono generacje IR");
    }
}