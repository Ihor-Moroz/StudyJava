public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say : %s",this.getName(),"Myyaa Myaa"));
    }
}
