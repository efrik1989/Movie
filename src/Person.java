public abstract class Person {
    int id;
    static int count;
    String name;

    {
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

