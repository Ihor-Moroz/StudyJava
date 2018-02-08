public class Calculate {

    private double result;

    public void add(double ... params){
        for(int i=0;i<params.length;i++){
            result+=params[i];
        }
    }

    public double getResult(){
        return this.result;
    }

    public void clearResult(){
        this.result=0;
    }
}