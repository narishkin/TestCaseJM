abstract class Var implements Operation {

    static Var createVar(String operand) throws CalcException {

        operand = operand.replaceAll("\\s+", "");
        if (operand.matches(Patterns.DECIMAL) && Integer.parseInt(operand) <= 10 && Integer.parseInt(operand) >= 1) {
            return new Decimal(operand);
        } else if (operand.matches(Patterns.ROMAN) && RomanHelper.convertToDec(operand)<=10 && RomanHelper.convertToDec(operand)>=1) {
            return new Roman(operand);
        } else {
            throw new CalcException("Unable to parse " + operand + " or number > 10(X) or < 1(I)");
        }
    }

}
