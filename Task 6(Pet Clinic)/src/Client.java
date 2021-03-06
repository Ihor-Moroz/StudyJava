public class Client {
    private String id;
    private Pet pet;

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

    public void setId(String id) {
        this.id = id;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Ім'я клієнта - " + this.id + " Ім'я тварини - " + this.pet.getName();
    }
}
