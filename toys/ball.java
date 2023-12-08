package toys;

public class ball extends toy  {
    public ball(int id, int weight, String name) {
        super(id, weight, name);
    }

    @Override
    public String getToyType() {
        return "Мяч";
    }
}

