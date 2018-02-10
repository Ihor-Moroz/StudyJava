import java.util.Arrays;

public class Clinic {

    private final Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client){
        this.clients[position]=client;
    }

    public Client[] findClientsByPetName(final String name){
        return new Client[]{};
    }

}
