public class EnrichmentAssigner {
    public static void main(String[] args) {
        System.out.println("Initialising...");
    }
}

class Student {
    private String nameLast;
    private String nameFirst;
    private int grade;
    private Enrichment choice1;
    private Enrichment choice2;
    private Enrichment choice3;
    private String note;

    public Student(String initNameLast, String initNameFirst; int initGrade, Enrichment initChoice1,
                   Enrichment initChoice2, Enrichment initChoice3, String initNote) {
        nameLast = initNameLast;
        nameFirst = initNameFirst;
        grade = initGrade;
        choice1 = initChoice1;
        choice2 = initChoice2;
        choice3 = initChoice3;
        note = initNote;
    }
}

class Enrichment {
    private String name;
    private int capacity;

    public Enrichment(String initName, int initCapacity) {
        name = initName;
        capacity = initCapacity;
    }


}
