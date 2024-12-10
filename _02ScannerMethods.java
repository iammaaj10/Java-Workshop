import java.util.Scanner;

public class _02ScannerMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d1,d2;
        System.out.print("Enter the first value :");
        if(sc.hasNextDouble()){
         d1=sc.nextDouble();
        }
        else{
            System.err.println("Error : Input is not a double value");
            return;
        }
        
        System.out.print("Enter the Second value :");
        if(sc.hasNextDouble()){
         d2=sc.nextDouble();
        }
        else{
            System.err.println("Error : Input is not a double value");
            return;
        }
        
        System.out.println("Average : "+(d1+d2)/2);
    }
}
