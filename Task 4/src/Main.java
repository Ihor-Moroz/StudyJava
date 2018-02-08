import java.util.Scanner;

public class Main {

    public static int select;

    public static void main(String[] args) {
        double[] argsDouble=new double[args.length];
        for(int i=0;i<args.length;i++)
        {
            argsDouble[i]=Double.parseDouble(args[i]);
            System.out.print(" "+argsDouble[i]);
        }
        Scanner reader=new Scanner(System.in);
        select=Integer.valueOf(reader.next());
        switch(select){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Error!");
                break;
        }
        Calculate calculator1=new Calculate();
        calculator1.add(argsDouble);

        System.out.println('\n' + "Sum of arguments = "+calculator1.getResult());

    }
}
