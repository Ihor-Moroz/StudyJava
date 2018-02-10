public class Client {
    private final String id;
    private final Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Ім'я клієнта - " + this.id + " Ім'я тварини - " + this.pet.getName();
    }
}
