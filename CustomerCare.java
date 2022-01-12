import java.util.Scanner;

public class CustomerCare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj= new Scanner(System.in);
System.out.println("Enter your choice \n 1.Tamil \n 2. English \n 3. Hindi \n");
int choice= obj.nextInt();
switch(choice)
{
case 1:
	System.out.println("Ungal thervai pathividungal \n  1. Check Balance \n 2.Send Statement \n 3.Deposit Amount Balance \n ");
	int m1= obj.nextInt();
	switch(m1)
	{
	case 1:
		System.out.println("Enter last four digit of your atm card");
		break;
	case 2:
		System.out.println("Check your registered mail- id");
		break;
	case 3:
		System.out.println("Deposit Amount");
	}
case 2:
	System.out.println("Enter your choices \n  1. Check Balance \n 2.Send Statement \n 3.Deposit Amount Balance \n ");
	int m2= obj.nextInt();
	switch(m2)
	{
	case 1:
		System.out.println("Enter last four digit of your atm card");
		break;
	case 2:
		System.out.println("Check your registered mail- id");
		break;
	case 3:
		System.out.println("Deposit Amount");
	}

	}

}
