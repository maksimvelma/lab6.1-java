public class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
    }

    public void performSurgery() {
        System.out.println(getName() + " виконує операцію.");
    }
}
