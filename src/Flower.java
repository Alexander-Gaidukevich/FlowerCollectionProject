
public class Flower {
    private String name;
    private String collor;
    private int age;
    private int size;
    private double cost;

    public Flower(String name, String collor, int age, int size, double cost) {
        this.name = name;
        this.collor = collor;
        this.age = age;
        this.size = size;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (age != flower.age) return false;
        if (size != flower.size) return false;
        if (Double.compare(flower.cost, cost) != 0) return false;
        if (!name.equals(flower.name)) return false;
        return collor.equals(flower.collor);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + collor.hashCode();
        result = 31 * result + age;
        result = 31 * result + size;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", collor='" + collor + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }
}
