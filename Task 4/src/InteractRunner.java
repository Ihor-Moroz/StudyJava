import java.util.Scanner;

public class InteractRunner {

    private double[] argsDouble;

    public void writeArguments(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Введіть параметри(Через пробіл): ");
        String[] temp=reader.nextLine().split(" ");
        argsDouble=new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            argsDouble[i] = Double.parseDouble(temp[i]);
        }
    }

    public double[] getArguments() {
        return argsDouble;
    }
}
