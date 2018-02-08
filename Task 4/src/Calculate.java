public class Calculate {

    private double result;

    public double getResult(){
        return this.result;
    }


    public void add(double ... params){
        for(int i=0;i<params.length;i++){
            result+=params[i];
        }
    }

    public void subtract(double ... params){
        result=params[0];
        for(int i=1;i<params.length;i++){
            result-=params[i];
        }
    }

    public void multiply(double ... params){
        result=params[0];
        for(int i=1;i<params.length;i++){
            result*=params[i];
        }
    }

    public void separate(double ... params){
        result=params[0];
        for(int i=1;i<params.length;i++){
            result/=params[i];
        }
    }


    public void clearResult(){
        this.result=0;
    }
}