import java.util.Scanner;

public class Avergae {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enetr the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number");
        int c = sc.nextInt();

        int Average = (a+b+c)/2;

        System.out.println("the Average of three number is" +Average);

    }
    
}
