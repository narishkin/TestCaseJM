class Decimal extends Var {
    private  int value;

    Decimal(String strScalar) {
        this.value = Integer.parseInt(strScalar);
    }

    Decimal(int value) {
        this.value = value;
    }

    @Override
    public Var add(Var other){
            int sum = this.value + ((Decimal) other).value;
            return new Decimal(sum);
    }

    @Override
    public Var sub(Var other){
            int sub = this.value - ((Decimal) other).value;
            return new Decimal(sub);
    }

    @Override
    public Var mul(Var other) {
            int mul = this.value * ((Decimal) other).value;
            return new Decimal(mul);
    }

    @Override
    public Var div(Var other){
            int div = this.value / ((Decimal) other).value;
            return new Decimal(div);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
