public class ArgRunner {

    private double[] argsDouble;

    public void readArguments(String[] args){
            argsDouble = new double[args.length];
            for (int i = 0; i < args.length; i++) {
                argsDouble[i] = Double.parseDouble(args[i]);
            }
    }

    public double[] getArguments(){
        return argsDouble;
    }
}
