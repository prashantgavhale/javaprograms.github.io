import java.util.Scanner;

public class Program2
{
	public static void main(String[] args) 
	{
		Program p=new Program();
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter value for number1 and number2");	
	    double num1=scan.nextDouble();
	    double num2=scan.nextDouble();
	    while(true)
	    {
	    System.out.println("1.add");
	    System.out.println("2.sub");
	    System.out.println("3.mul");
	    System.out.println("4.div");
	    System.out.println("Enter your choice");
	    int n=scan.nextInt();
	    System.out.println();
	    switch(n)
	    {
	    case 1:p.add(num1,num2);
	           	break;
	    case 2:p.sub(num1,num2);
        		break;
	    case 3:p.mul(num1,num2);
        		break;
	    case 4:p.div(num1,num2);
        		break;
        		
        		default:System.exit(0);
	    }	    
	}
	}
}
class Program 
{
	Scanner s=new Scanner(System.in);
      public void add(double num1,double num2)
	{
		System.out.println(num1+num2);
	}
	public void sub(double num1,double num2)
	{
		System.out.println(num1-num2);
	}
	public void mul(double num1,double num2)
	{
		System.out.println(num1*num2);
	}
	public void div(double num1,double num2)
	{
		System.out.println(num1/num2);
	}
}
