public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getType() {
        return "Це собака";
    }

    @Override
    public String makeSound() {
        return String.format("%s say : %s",this.getName(),"Гав Гав");
    }
}
