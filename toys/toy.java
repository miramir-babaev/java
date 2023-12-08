package toys;

public abstract class toy {
    private int id;
    private int weight;
    private String name;

    public toy(int id, int weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public abstract String getToyType();
}
