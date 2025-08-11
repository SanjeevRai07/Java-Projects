public class Remove_spaces {
    public static void main(String[] args) {
        String str = "Java is   fun  to learn";
        String noSpaces = str.replaceAll("\\s+", "");
        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + noSpaces);
    }
}
