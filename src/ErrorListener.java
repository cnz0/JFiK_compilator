package src;

import org.antlr.v4.runtime.*;

public class ErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        System.err.println("Blad skladniowy: linia " + line + ", kolumna " + charPositionInLine);
        System.err.println("    " + msg);
        System.exit(1);
    }
}