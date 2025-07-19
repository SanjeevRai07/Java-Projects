import java.util.Scanner;

public class taking2number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println(" it is equal");

        }else if(a>b){
            System.out.println(" a os greater");
        }
        else{
            System.out.println(" a is smaleer");
        }
    }
}
