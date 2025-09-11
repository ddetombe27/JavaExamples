public class Main {
    public static void main (String[] args) {
        //Microwave m = new Microwave("Samsung", 500);
        //m.cook30();
        LanguageHelper.greet();
        LanguageHelper.salutation();
        System.out.println(LanguageHelper.salutation() + "David.");
        System.out.println("The fact that I am happy is " + LanguageHelper.happy() + ".");
        System.out.println(LanguageHelper.german("Hamburger"));
    }
}