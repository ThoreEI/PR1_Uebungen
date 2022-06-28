package freiwilligeUebungen;

public class uebung1 {

    public static void main(String[] args) {

        double epsilon = 0.00001;
        double number = 5;
        double result = 1.0;
        double oldResult;
        double sum = 1.0;
        int count = 1;

        do {
            sum *= (number/count);
            oldResult = result;
            result += sum;
            count++;
        } while ((Math.abs(result-oldResult) / oldResult) > epsilon);
        System.out.println(Math.exp(result));
        System.out.println(count);
    }
}
