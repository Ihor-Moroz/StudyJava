public class Animal implements Pet {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say : %s",this.name,"beep"));
    }

    @Override
    public String toString() {
        return this.name;
    }
}
