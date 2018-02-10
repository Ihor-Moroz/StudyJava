public class Main {

    public static void main(String[] args) {
        Animal d1=new Dog("ridik");
        Client cl1=new Client("Ihor",d1);
        System.out.println(cl1);
        cl1.getPet().makeSound();
    }
}
