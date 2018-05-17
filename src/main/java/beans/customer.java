package beans;

public class customer extends people {
    public customer() {
    }

    public customer(int id, String user, String pass, String name, int age, String address) {
        super(id, user, pass, name, age, address);
    }
}
