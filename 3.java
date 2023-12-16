import java.util.*;
import java.lang.Math;
public class SavingsAccountTest{
public static void main(String[] args){
System.out.print("balance for saver1: $");
Scanner sc=new Scanner(System.in);
int balance1=sc.nextInt();
 System.out.print("balance for saver2: $");
 int balance2=sc.nextInt();
 System.out.println("After 1 month (4% interest rate):");
 double intrest1=(balance1*0.04)/12+balance1;
 System.out.printf("Saver 1 Balance: $%.4f\n",intrest1);
 double intrest2=(balance2*0.04)/12+balance2;
 System.out.printf("Saver 2 Balance: $%.4f\n",intrest2);

 System.out.println("After 2 months (5% interest rate):");
 double intrest3=(intrest1*0.05)/12+intrest1;
 System.out.printf("Saver 1 Balance: $%.4f\n",intrest3);
 double intrest4=(intrest2*0.05)/12+intrest2;
 System.out.printf("Saver 2 Balance: $%.4f\n",intrest4);

}
}
