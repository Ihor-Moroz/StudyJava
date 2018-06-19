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
                    try {
                        calculator1.add(argsDouble);
                    } catch (UserException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        calculator1.subtract(argsDouble);
                    } catch (UserException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        calculator1.multiply(argsDouble);
                    } catch (UserException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        calculator1.separate(argsDouble);
                    } catch (UserException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            System.out.println('\n' + "Result = " + calculator1.getResult());
            System.out.println("Exit yes/no ?");
            exit=reader.next();
        }
    }
}

