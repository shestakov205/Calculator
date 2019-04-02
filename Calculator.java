import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Calculator calc = new Calculator();

        if (calc.isNumber(s) == true) {
            int x = Integer.parseInt(s);
            String symbol = scanner.next();
            int y = scanner.nextInt();
            CalculatorArabicDigit arabCalc = new CalculatorArabicDigit();
            if (symbol.equals("+")) {
                System.out.println(" = " + arabCalc.add(x, y));
            } else if (symbol.equals("-")) {
                System.out.println(" = " + arabCalc.minus(x, y));
            } else if (symbol.equals("*")) {
                System.out.println(" = " + arabCalc.multiplication(x, y));
            } else if (symbol.equals("/")) {
                System.out.println(" = " + arabCalc.division(x, y));
            } else System.out.println("Непреемлимый знак");

        }
        if (calc.isNumber(s) == false) {
            ConvertRomeDigit romeDigit = new ConvertRomeDigit();
            CalculatorArabicDigit arabCalc = new CalculatorArabicDigit();
            int x = romeDigit.ten(s);
            String symbol = scanner.next();
            String num2 = scanner.next();
            if(calc.isNumber(num2) == true){
                System.exit(0);
            }
            int y = romeDigit.ten(num2);

            if (symbol.equals("+")) {
                System.out.println(" = " + arabCalc.add(x, y));
            } else if (symbol.equals("-")) {
                System.out.println(" = " + arabCalc.minus(x, y));
            } else if (symbol.equals("*")) {
                System.out.println(" = " + arabCalc.multiplication(x, y));
            } else if (symbol.equals("/")) {
                System.out.println(" = " + arabCalc.division(x, y));
            } else System.out.println("Неприемлимый знак");
        }
    }

    boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false) {
                return false;
            }
        return true;
    }
}

