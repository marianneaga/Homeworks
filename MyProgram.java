package homeworks;


public class MyProgram {
    public static void main(String[] args) {
        double value1;
        double value2;
        value1 = Double.parseDouble(args[0]);
        value2 = Double.parseDouble(args[1]);
        switch (args[2]) {
            case "+" -> System.out.println(value1 + value2);
            case "-" -> System.out.println(value1 - value2);
            case "*" -> System.out.println(value1 * value2);
            case "/" -> System.out.println(value1 / value2);
            default -> System.out.println("Invalid operation");
        }
    }
}
