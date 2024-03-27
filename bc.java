import java.util.Scanner;

public class bc {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Scanner choice=new Scanner(System.in);
        System.out.println("enter choice: 1-addition\n2-subtraction\n3-multiplication\n4-division:");
        
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        
        double c = a + b; // Perform addition after getting the values
        System.out.println("Sum is: " + c);
        double d= a-b;
        System.out.println("differnce is: " + d);
        double e= a*b;
        System.out.println("multiplication is: " + e);

    }
}
