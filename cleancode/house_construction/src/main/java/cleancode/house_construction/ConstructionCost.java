package cleancode.house_construction;

public class ConstructionCost
{
	public float construction_cost(int n ,int automatecost,float sqfeet)
	{
		return (n+automatecost)*sqfeet;
	}
	public int automated(int flag1)
	{
		
		int cost;
		if(flag1>0)
		{
			 cost=700;
		}
		else
			cost=1;
		return cost;	
	}
}
