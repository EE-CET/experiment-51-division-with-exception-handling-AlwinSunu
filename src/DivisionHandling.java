import java.util.Scanner;

public class DivisionHandling {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero error");
        }

    }
}
