public class Book {

    private String title;

    public Book() {
        title = "None Specified";
    }

    public Book(String myTitle) {
        title = myTitle;
    }

    //Accessor Method (getter)
    public String getTitle() {
        return title;
    }

    //Mutator Method (setter)
    public void setTitle(String newTitle) {
        title = newTitle;
    }


}

class TestClass {
    public static void main(String[] args) {
        Book b1 = new Book("The Lord of the Rings");
        Book b2 = new Book("The Hobbit");
        Book b3 = b2;
        b2.setTitle("The Silmarillion");
        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.title);
    }
}