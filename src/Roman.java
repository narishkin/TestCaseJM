public class Roman extends Var{
    private int value;
    private String romanValue;

    public Roman(String value) {
        this.value = RomanHelper.convertToDec(value);
        this.romanValue = value;
    }

    @Override
    public Var add(Var other) {
        int sum = this.value + ((Roman) other).value;
        return new Roman(RomanHelper.decToRoman(sum));
    }

    @Override
    public Var sub(Var other){
        int sub = this.value - ((Roman) other).value;
        if (sub>0) {
            return new Roman(RomanHelper.decToRoman(sub));
        }
        else {
            return new Roman("-"+RomanHelper.decToRoman(sub));
        }
    }

    @Override
    public Var mul(Var other) {
        int mul = this.value * ((Roman)other).value;
        return new Roman(RomanHelper.decToRoman(mul));
    }

    @Override
    public Var div(Var other) {
        int div = this.value / ((Roman)other).value;
        return new Roman(RomanHelper.decToRoman(div));
    }

    @Override
    public String toString() {
        return String.valueOf(romanValue);
    }
}
