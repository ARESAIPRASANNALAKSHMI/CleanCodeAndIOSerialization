package cleancode.house_construction;
import java.util.Scanner;
public class Main extends ConstructionCost
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		ConstructionCost constructor=new ConstructionCost();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the standards of materials\n1.standard\n2.above standards \n3.high standards \n4.high standards and fully automated house");
		int s=sc.nextInt();
		System.out.println("Enter the area for house");
		float area=sc.nextInt();
		int cost;
		float housecost;
		int flag1;
		switch(s)
		{
			case 1: System.out.println("Enter you want fully automated house");
					flag1=sc.nextInt();
					cost=constructor.automated(flag1);
					housecost=constructor.construction_cost(1200,cost,area);
					System.out.println("Construction cost of house is "+housecost);
					break;
			case 2:System.out.println("Enter you want fully automated house");
					flag1=sc.nextInt();
					cost=constructor.automated(flag1);
					housecost=constructor.construction_cost(1500,cost,area);
					System.out.println("Construction cost of house is "+housecost);
					break;
			case 3:System.out.println("Enter you want fully automated house");
				   flag1=sc.nextInt();
				   cost=constructor.automated(flag1);
				   housecost=constructor.construction_cost(1800,cost,area);
				   System.out.println("Construction cost of house is "+housecost);
				   break;
			case 4:
				   housecost=2500*area;
				   System.out.println("Construction cost of house is "+housecost);
				   break;
			default:return;
					
				   
		}
	}
}
