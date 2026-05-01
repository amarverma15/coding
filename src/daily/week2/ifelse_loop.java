package daily.week2;

import java.util.Scanner;

public class ifelse_loop {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks;
        marks = sc.nextInt();
        if (marks >= 60 && marks <= 100) {
            System.out.println("you got first division");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("you got second division");
        } else if (marks >= 33 && marks < 50) {
            System.out.println("you got third div");
        } else if (marks < 0 || marks > 100) {
            System.out.println("incorrect credential");
        } else {
            System.out.println("you failed");
        }

    }
}
