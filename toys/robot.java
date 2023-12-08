package toys;

public class robot  extends toy {
    public robot(int id, int weight, String name) {
        super(id, weight, name);
    }

    @Override
    public String getToyType() {
        return "Робот";
    }
}