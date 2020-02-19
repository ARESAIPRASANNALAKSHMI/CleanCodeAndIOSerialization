package cleancode.interestcalculation;
import java.util.Scanner;
public class interestCalculations extends interest{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of operations you want to be perform");
		interest Interest=new interest();
		int operations=sc.nextInt();
		while(operations>0)
		{
			System.out.println("Enter the principle amount");
			int principle=sc.nextInt();
			System.out.println("Enter the rate of interest");
			float rate=sc.nextInt();
			System.out.println("Enter the time");
			int time=sc.nextInt();
			System.out.println("You want to be simple interest or compound interest");
			System.out.println("1.Simple Interest \n2.Compound Interest \n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:float simple=Interest.simpleInterest(principle,rate,time);
						System.out.println(simple);
						break;
				case 2:System.out.println("Enter number of times per year");
						int n=sc.nextInt();
						double compound=Interest.compoundInterest(principle,rate,time,n);
						System.out.println(compound);
						break;
				default:
						System.out.println("Please Enter the correct option");
						return;
			}
			operations-=1;
		}
		sc.close();
		
		

	}

}
