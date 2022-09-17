import java.util.Scanner;

public class Cornet {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("What is your cornet size : ");
        int n = num.nextInt();

        for (int i=n;i>=1;i--){
            for (int j=(n-i);j>=1;j--){
                System.out.print(" ");
            }
            for (int k=(2*i-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Your cornet is ready :D ");
    }
}
