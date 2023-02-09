import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions functions=new Functions();
        int num,a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        num=in.nextInt();
        switch (num){
            case 1:
                System.out.print("Input first number: ");
                a=in.nextInt();
                System.out.print("Input second number: ");
                b=in.nextInt();
                System.out.println(functions.Addition(a,b));
            case 2 :
                System.out.print("Input first number: ");
                a=in.nextInt();
                System.out.print("Input second number: ");
                b=in.nextInt();
                System.out.println(functions.Subtraction(a,b));
            case 3 :
                System.out.print("Input first number: ");
                a=in.nextInt();
                System.out.print("Input second number: ");
                b=in.nextInt();
                System.out.println(functions.Multiplication(a,b));
            case 4:
                System.out.print("Input first number: ");
                a=in.nextInt();
                System.out.print("Input second number: ");
                b=in.nextInt();
                System.out.println(functions.Division(a,b));
        }
    }
}