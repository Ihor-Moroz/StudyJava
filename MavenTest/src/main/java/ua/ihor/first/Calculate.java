package ua.ihor.first;
public class Calculate {

    private double result;

    public double getResult(){
        return this.result;
    }


    public void add(double ... params)throws UserException{
        if(params.length>=2) {
            this.result=params[0];
            for (int i = 1; i < params.length; i++) {
                this.result += params[i];
            }
        }
        else{
            throw new UserException("You slould enter 2 args");
        }
    }

    public void subtract(double ... params)throws UserException{
        if(params.length>=2) {
            this.result=params[0];
            for (int i = 1; i < params.length; i++) {
                this.result -= params[i];
            }
        }
        else{
            throw new UserException("You slould enter 2 args");
        }
    }

    public void multiply(double ... params)throws UserException{
        if(params.length>=2) {
            this.result=params[0];
            for (int i = 1; i < params.length; i++) {
                this.result *= params[i];
            }
        }
        else{
            throw new UserException("You slould enter 2 args");
        }
    }

    public void separate(double ... params)throws UserException{
        if(params.length>=2) {
            this.result=params[0];
           for (int i = 1; i < params.length; i++) {
               if(params[i]==0){
                   throw new IllegalArgumentException("You try to separate by o");
               }
               this.result /= params[i];
           }
        }
        else{
            throw new UserException("You slould enter 2 args");
        }
    }


    public void clearResult(){
        this.result=0;
    }
}