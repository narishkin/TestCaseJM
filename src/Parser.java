import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    Var calc(String expression) throws CalcException{

        String[] operand = expression.split(Patterns.OPERATION, 2);
        if (operand[0].equals("") && operand.length==1 ){
            throw new CalcException("Empty String");
        }
        Var op1 = Var.createVar(operand[0]);
        Var op2 = Var.createVar(operand[1]);
        if (!op1.getClass().equals(op2.getClass())){
            throw new CalcException("Different types");
        }

        Pattern p1 = Pattern.compile(Patterns.OPERATION);
        Matcher m1 = p1.matcher(expression);
        if (m1.find()) {
            String operationType = m1.group();
            switch (operationType) {
                case "+":
                    return op1.add(op2);
                case "-":
                    return op1.sub(op2);
                case "*":
                    return op1.mul(op2);
                case "/":
                    return op1.div(op2);
            }
        }
        return null;
    }
}
