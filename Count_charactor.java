public class Count_charactor {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' occurs " + count + " times");
    }
}
