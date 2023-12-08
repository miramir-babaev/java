package toys;

public class doll extends toy  {
    public doll(int id, int weight, String name) {
        super(id, weight, name);
    }

    @Override
    public String getToyType() {
        return "Кукла";
    }
}