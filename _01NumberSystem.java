import java.util.Scanner;

class _01NumberSystem{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number :");
    int num=sc.nextInt();

    System.out.println("Given Number :"+num);
    System.out.println("Binary Equivalent :"+Integer.toBinaryString(num));
    System.out.println("Octal Equivalent :"+Integer.toOctalString(num));
    System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(num));
 }
}