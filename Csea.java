import java.util.Scanner;

class Csea {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your name,age,salary:");
        String Username = obj.nextLine();
        int age=obj.nextInt();
        double sal=obj.nextDouble();
        System.out.println("Username is:" + Username);
        System.out.println("age is:" + age);
        System.out.println("salary:" + sal);
    }
}