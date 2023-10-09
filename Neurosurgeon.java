public class Neurosurgeon extends Surgeon {
    public Neurosurgeon(String name) {
        super(name);
    }

    public void performBrainSurgery() {
        System.out.println(getName() + " виконує нейрохірургічну операцію.");
    }
}
