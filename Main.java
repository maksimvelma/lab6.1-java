public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Доктор Сміт");
        Surgeon surgeon = new Surgeon("Доктор Джонс");
        Neurosurgeon neurosurgeon = new Neurosurgeon("Доктор Парк");

        doctor.diagnose();
        surgeon.diagnose();
        surgeon.performSurgery();
        neurosurgeon.diagnose();
        neurosurgeon.performSurgery();
        neurosurgeon.performBrainSurgery();
    }
}
