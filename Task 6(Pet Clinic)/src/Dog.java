public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say : %s",this.getName(),"Gavv Gavv"));
    }
}
