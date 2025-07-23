import java.util.Scanner;

public class Function_divide{
    public static int Calculate_Product(int a ,int b){
        return a/b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of two number is:" + Calculate_Product(a,b));
    }

}
    
