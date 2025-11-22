public class VirtualPet {
    private String name;
    private int health;
    private String mood;

    public VirtualPet(String n, int h, String m) {
        name = n;
        health = h;
        mood = m;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mood: " + mood);
    }

    public int getHealth()
    {
        return health;
    }


    public void feed() {
        health++;
    }

    public static void main(String[] args) {
        VirtualPet p = new VirtualPet("Fluffy", 5, "happy");
        VirtualPet n = new VirtualPet("Bob", 5, "sad");
        n.print();
        n.feed();
        n.print();
    }
}
