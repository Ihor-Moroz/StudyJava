public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return "Це кіт";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String makeSound() {
        return String.format("%s say : %s",this.getName(),"Мяв Мяв");
    }
}
