public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void diagnose() {
        System.out.println(name + " проводить діагностику пацієнта.");
    }
}