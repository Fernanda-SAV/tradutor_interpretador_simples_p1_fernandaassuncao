import java.util.List;
import java.util.ArrayList;


public class Parser {
    private Scanner scan;
    private Token currentToken;

    private List<String> output = new ArrayList<>();

    public Parser(byte[] input) {
        scan = new Scanner(input);
        currentToken = scan.nextToken();
    }

    private void nextToken () {
        currentToken = scan.nextToken();
    }

    private void emit(String cmd) {
        output.add(cmd);
        System.out.println(cmd); // ainda mostra no console (opcional)
    }

    void number() {
        emit("push " + currentToken.lexeme);
        match(TokenType.NUMBER);
    }

    void oper() {
        if (currentToken.type == TokenType.PLUS) {
            match(TokenType.PLUS);
            term();
            emit("add");
            oper();
        } else if (currentToken.type == TokenType.MINUS) {
            match(TokenType.MINUS);
            term();
            emit("sub");
            oper();
        }
    }


    void expr() {
        term ();
        oper();
    }

    void term() {
        if (currentToken.type == TokenType.NUMBER)
            number();
        else if (currentToken.type == TokenType.IDENT) {
            emit("push " + currentToken.lexeme);
            match(TokenType.IDENT);
        } else
            throw new Error("syntax error");
    }

    void printStatement() {
        match(TokenType.PRINT);
        expr();
        emit("print");
        match(TokenType.SEMICOLON);
    }

    void statements () {

        while (currentToken.type != TokenType.EOF) {
            statement();
        }
    }

    void statement () {
        if (currentToken.type == TokenType.PRINT) {
            printStatement();
        } else if (currentToken.type == TokenType.LET) {
            letStatement();
        } else {
            throw new Error("syntax error");
        }
    }


    void letStatement() {
        match(TokenType.LET);
        var id = currentToken.lexeme;
        match(TokenType.IDENT);
        match(TokenType.EQ);
        expr();
        emit("pop " + id);
        match(TokenType.SEMICOLON);
    }

    public void parse() {
        statements();
    }

    public String output() {
        return String.join("\n", output);
    }

    private void match(TokenType t) {
        if (currentToken.type == t) {
            nextToken();
        } else {
            throw new Error("syntax error");
        }
    }
}