package daily;

import java.util.Scanner;

class calc
    {
        public static void main(String[] args)
        {
            int a,b,ch;
            double c;
            System.out.print("enter any two number");
            Scanner s=new Scanner(System.in);
            a=s.nextInt();
            b=s.nextInt();
            System.out.print("enter your choice");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:c=a+b;
                    System.out.println("addition" +c);
                    break;
                case 2:c=a-b;
                    System.out.println("subtraction" +c);
                    break;
                case 3:c=a*b;
                    System.out.println("multiplication" +c);
                    break;
                case 4:c= (double) a /b;
                    System.out.println("division" +c);
                    break;
                case 5:c=a%b;
                    System.out.println("remainder" +c);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
