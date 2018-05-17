package beans;

public class item {
    int id;
    String name;
    int price;
    int totalno;
    String origin;
    String description;

    public item() {
    }

    public item(int id, String name, int price, int totalno, String origin, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.totalno = totalno;
        this.origin = origin;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalno() {
        return totalno;
    }

    public void setTotalno(int totalno) {
        this.totalno = totalno;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
