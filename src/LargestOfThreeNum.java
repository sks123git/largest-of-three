import java.util.Scanner;
//Program to find largest of three numbers
public class LargestOfThreeNum {
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("Enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
                if(num1>=num2 && num1>=num3){
                    System.out.println(num1 + " is Largest");
                } else if (num2>=num1 && num2>=num3) {
                    System.out.println(num2 + " is Largest");

                }else {
                    System.out.println(num3 + " is Largest");
                }
    }
}