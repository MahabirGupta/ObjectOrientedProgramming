public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    private double firstNumber;
    private double secondNumber;

//    public SimpleCalculator(double firstNumber, double secondNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double sum = getFirstNumber() + getSecondNumber();
        return sum;
    }

    public double getSubtractionResult(){
        double difference = getFirstNumber() - getSecondNumber();
        return difference;
    }

    public double getMultiplicationResult(){
        double product = getFirstNumber() * getSecondNumber();
        return product;
    }

    public double getDivisionResult(){
        if (getSecondNumber() == 0){
            return 0;
        }
        double product = getFirstNumber() / getSecondNumber();
        return product;
    }
}
