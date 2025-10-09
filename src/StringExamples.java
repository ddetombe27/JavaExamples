//public class StringExamples {
//    public static void thirdWord(String str) {
//        System.out.println(str.substring(7,10));
//    }
//    public static void first4(String str){
//        System.out.println(str.substring(0,1));
//        System.out.println(str.substring(1,2));
//        System.out.println(str.substring(2,3));
//        System.out.println(str.substring(3,4));
//    }
//    public static void last3(String str) {
//        int len = str.length();
//        for (int i = 1; i <= 3; i++) {
//            System.out.println(str.substring(len - i, len - i + 1));
//        }
//    }
//
//    public static void lastWord(String str) {
//        System.out.println(str.substring(13, 18));
//    }
//
//    public static void lastWord2(String str) {
//        System.out.println(str.substring(13));
//    }
//
//    public static void main(String[] args) {
//        String str = "calculus for lunch";
//        System.out.println("The first word is " + str.substring(0, str.indexOf(" ")));
//        System.out.println("The second word is " + (str.substring(str.indexOf(" ") + 1)).substring(0, (str.substring(str.indexOf(" ") + 1)).indexOf(" ")));
//        System.out.println("The third word is " + (str.substring(str.indexOf(" ") + 1)).substring((str.substring(str.indexOf(" ") + 1)).indexOf(" ") + 1));
//
//    }
//}
//
//
//
