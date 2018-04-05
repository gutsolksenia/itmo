import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

/**
 * Created by ksenia on 29.05.17.
 */
public class Converter {

    private static final String TAB = "    ";
    private String currentTab = TAB;
    private final PascalParser.ProgrammContext programm;
    private final StringBuilder sb = new StringBuilder();

    public Converter(String code) {
        PascalLexer lexer = new PascalLexer(new ANTLRInputStream(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        programm = new PascalParser(tokens).programm();
    }


    public String convert() {
        convertVar();
        sb.append("\nint main() {\n");
        convertMain();
        sb.append(TAB + "return 0;\n}");
        return sb.toString();
    }

    private void convertMain() {
        List<PascalParser.OperationContext> operations;
        operations = programm.main().operation();
        operations.stream().forEach(op -> convertOp(op));
    }

    private void convertOp(PascalParser.OperationContext op) {
        sb.append(currentTab);
        convertRead(op.read());
        convertWrite(op.write());
        convertAssignment(op.assignment());
        convertVariableDecl(op.variableDeclaration());
        convertIf(op.ifOp());
        convertElse(op.elseCase());
        convertWhile(op.whileCase());
        sb.append("\n");
    }

    private void convertWhile(PascalParser.WhileCaseContext whileCase) {
        if (whileCase == null) {
            return;
        }
        sb.append("while (");
        convertLogic(whileCase.logic());
        sb.append(")\n");
        convertBlock(whileCase.codeBlock());
    }

    private void convertElse(PascalParser.ElseCaseContext elseCase) {
        if (elseCase == null) {
            return;
        }
        sb.append(" else\n");
        convertBlock(elseCase.codeBlock());
    }

    private void convertIf(PascalParser.IfOpContext ifOp) {
        if (ifOp == null) {
            return;
        }
        sb.append("if (");
        convertLogic(ifOp.ifCase().logic());
        sb.append(")\n");
        convertBlock(ifOp.codeBlock());
    }

    private void convertBlock(PascalParser.CodeBlockContext block) {
        sb.append(currentTab + "{\n");
        currentTab += TAB;
        if (block.main() != null) {
            block.main().operation().stream().forEach(op -> convertOp(op));
        }
        if (block.operation() != null) {
            convertOp(block.operation());
        }
        currentTab = currentTab.substring(4);
        sb.append(currentTab + "}");
    }

    private void convertWrite(PascalParser.WriteContext write) {
        if (write == null) {
            return;
        }
        if (write.WRITELN() != null) {
            sb.append("printf(\"\\n\")");
            return;
        }
        sb.append("printf(");
        PascalParser.WriteArgumentListContext args;
        args = write.writeArgumentList();
        StringBuilder typeInfo = new StringBuilder();
        List<PascalParser.WriteArgumentContext> argsList;
        argsList = args.writeArgument();
        typeInfo.append(writeArgTypeInfo(argsList.get(0)));
        for (int i = 1; i < argsList.size(); i++) {
            typeInfo.append(" " + writeArgTypeInfo(argsList.get(i)));
        }

        if (write.WRITE().getText().equals("writeln")) {
            typeInfo.append("\\n");
        }
        sb.append("\"");
        sb.append(typeInfo);
        sb.append("\"");
        sb.append(", ");
        convertWriteArgs(argsList);
        sb.append(");");
    }

    private void convertAssignment(PascalParser.AssignmentContext assignment) {
        if (assignment == null) {
            return;
        }
        sb.append(assignment.WORD());
        sb.append(" = ");
        sb.append(assignment.math().getText());
        sb.append(";");
    }

    private void convertRead(PascalParser.ReadContext read) {
        if (read == null) {
            return;
        }
        sb.append("scanf(");

        PascalParser.ReadArgumentListContext args;
        args = read.readArgumentList();
        if (args != null) {
            int argsCount = args.WORD().size();
            StringBuilder typeInfo = new StringBuilder();
            typeInfo.append("%d");
            for (int i = 1; i < argsCount; i++) {
                typeInfo.append(" %d");
            }
            sb.append("\"");
            sb.append(typeInfo);
            sb.append("\", ");
            sb.append(args.getText());
        }
        sb.append(");");
    }

    private void convertVar() {
        List<PascalParser.VariableDeclarationContext> declarations;
        declarations = programm.variables().variableDeclaration();
        declarations.stream().forEach(varDecl -> {
            convertVariableDecl(varDecl);
            sb.append("\n");
        });
    }

    private void convertVariableDecl(PascalParser.VariableDeclarationContext varDecl) {
        if (varDecl == null) {
            return;
        }
        String type = convertType(varDecl.TYPE().toString());
        sb.append(type);
        sb.append(' ');
        sb.append(varDecl.variablesList().getText());
        sb.append(';');
    }

    private static String convertType(String pascalType) {
        if (pascalType.equals("integer")) {
            return "int";
        }
        return pascalType;
    }

    private static String writeArgTypeInfo(PascalParser.WriteArgumentContext arg) {
        if (arg.math() != null) {
            return "%d";
        }
        return "%s";
    }

    private void convertWriteArgs(List<PascalParser.WriteArgumentContext> args) {
        sb.append(writeArg(args.get(0)));
        for (int i = 1; i < args.size(); i++) {
            sb.append(", " + writeArg(args.get(i)));
        }
    }

    private String writeArg(PascalParser.WriteArgumentContext arg) {
        if (arg.math() != null) {
            return arg.math().getText();
        }
        String string = arg.STRING_LITERAL().getText();
        return "\"" + string.substring(1, string.length() - 1) + "\"";
    }

    private void convertLogic(PascalParser.LogicContext logic) {
        sb.append(logic.math(0).getText());
        String op = logic.LOGIC_OPERATION().getText();
        if (op.equals("=")) {
            op = "==";
        }
        sb.append(" " + op + " ");
        sb.append(logic.math(1).getText());
    }
}
