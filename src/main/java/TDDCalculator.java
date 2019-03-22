public class TDDCalculator {
    public int add(int a, int b) {
        if(a<0){
            throw new Calculator.NegativeNumberException();
        }
        if(b<0){
            throw new Calculator.NegativeNumberException();
        }
        return a+b;
    }

    public int doubleValue(int a, int b) {
        if(a<0){
            throw new Calculator.NegativeNumberException();
        }
        if(b<0){
            throw new Calculator.NegativeNumberException();
        }
        return a*b;
    }
}
