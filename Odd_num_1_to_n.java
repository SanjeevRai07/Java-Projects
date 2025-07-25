import java.util.Scanner;
public class Odd_num_1_to_n {
    public static void printsum(int n){
    int sum = 0;
    

    for (int i = 0;i<=n;i++){
        if(i % 2 != 0){
            sum = sum + i;
        }
    }
    System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printsum(n);
    }
        
     
    }
    

