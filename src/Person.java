public class Person {
    private String name;
    private String email;
    private String phone;

    public Person(String sname, String semail, String sphone) {
        name = sname;
        email = semail;
        phone = sphone;
    }

    public void print() {
        System.out.println("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
    }

    public static void main (String[] args) {
        Person p1 = new Person("David deTombe", "david.detombe@gmail.com", "3141592653");
        Person p2 = new Person("Billy Joe Bob", "billy.joe.bob@gmail.com", "1123581321");
        p1.print();
        p2.print();
    }

}
