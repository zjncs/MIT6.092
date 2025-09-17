import java.util.Scanner;
public class FooCorporation {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double basePay=in.nextDouble();
        
        double hoursWorked=in.nextDouble();
        
        double totalPay=result(basePay,hoursWorked);
        System.out.println(totalPay);
        in.close();
        
    }
    public static double result(double basePay,double hoursWorked){
        if (basePay<8.0){
            System.out.println("error");
            return 0;
        }
        if (hoursWorked>60){
            System.out.println("error");
            return 0;
        }
            double totalPay;
        if(hoursWorked<=40){
            totalPay=basePay*hoursWorked;
            return totalPay;
        }
        else{
            totalPay=basePay*40+basePay*1.5*(hoursWorked-40);
            return totalPay;
        }

    }
    
}
