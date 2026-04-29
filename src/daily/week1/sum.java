package daily.week1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();
        if (num % 2 ==0) {
            System.out.println("the number is even");
        }
        else{
                System.out.println("the number is odd");
            }
        }
}
