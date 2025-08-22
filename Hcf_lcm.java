public class Hcf_lcm {
    static int hcf(int a, int b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("HCF = " + hcf(a, b));
        System.out.println("LCM = " + lcm(a, b));
    }
}
