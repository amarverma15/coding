package daily.week2;

import java.util.Scanner;

public class dowhile_loop {
    public static void main(String[] args){
        int num;
        System.out.println("enter any number");
        Scanner s = new Scanner(System.in);

        num=s.nextInt();
        do{
            System.out.println(num +" ");
            ++num;
        }

                while (num<=10);

            }
        }
