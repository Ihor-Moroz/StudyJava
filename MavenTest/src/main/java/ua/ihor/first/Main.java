package ua.ihor.first;
import java.util.Scanner;

public class Main {

    public static int select;
    private static double saveResult;

    public static void main(String[] args) {
        double[] argsDouble;
        Scanner reader=new Scanner(System.in);
        String exit="no";
        while(!exit.equals("yes")) {
            if (args.length != 0) {
                ArgRunner ar1 = new ArgRunner();
                ar1.readArguments(args);
                argsDouble = ar1.getArguments();
            } else {
                InteractRunner ir1 = new InteractRunner();
                ir1.writeArguments();
                argsDouble = ir1.getArguments();
            }
            Calculate calculator1 = new Calculate();
            System.out.println('\n' + "1-Додати,2-Відняти,3-Помножити,4-Поділити");
            select = Integer.valueOf(reader.next());
            switch (select) {
                case 1:
                    calculator1.add(argsDouble);
                    break;
                case 2:
                    calculator1.subtract(argsDouble);
                    break;
                case 3:
                    calculator1.multiply(argsDouble);
                    break;
                case 4:
                    calculator1.separate(argsDouble);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            System.out.println('\n' + "Result = " + calculator1.getResult());
            System.out.println("Exit yes/no ?");
            System.out.println(argsDouble.length);
            exit=reader.next();
        }
    }
}

