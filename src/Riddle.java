public class Riddle {
    private String question;
    private String answer;
    private int level;

    public Riddle(String q, String a, int l) {
        question = q;
        answer = a;
        level = l;
    }

    public void askQuestion() {
        System.out.println(question);
    }

    public void giveAnswer() {
        System.out.println(answer);
    }
}

class Test {
    public static void main(String args[]) {
        Riddle r1 = new Riddle("How do you put a giraffe into a refrigerator?", "Open the door, put in the giraffe, close the door.", 1);
        Riddle r2 = new Riddle("How do you put an elephant into a refrigerator?", "Open the door, take out the giraffe, put in the elephant, close the door", 2);
        r1.askQuestion();
    }
}
