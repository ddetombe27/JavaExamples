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
    public String toString() {
        return "Title: " + getTitle();
    }
}

