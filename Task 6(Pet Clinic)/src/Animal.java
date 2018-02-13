public class Animal implements Pet {

    private String name;

    public Animal(String name) {
        this.name = name;
    }


    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public String getType() {
        return "Це тваринка";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String makeSound() {
        return String.format("%s say : %s",this.name,"beep");
    }
    @Override
    public String toString() {
        return this.name;
    }
}
