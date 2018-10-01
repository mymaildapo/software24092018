
public class Team
{
	private Counter games_Played;
	private Counter point;
	private String team_name;
	
	public Team( String n, int gp, int pt) // constructor
	{
		this.team_name= n;
		this.games_Played= new Counter(gp);
		this.point = new Counter(pt);
	}
	
	
	
	
	public void win() // method
	{
		games_Played.increment();
		point.increment();
		point.increment();
		point.increment();
	}
	
	public void draw() 
	{
		point.increment();
	}
	
	public void loss()
	{
		point.decrement();
	}
	
	public void print_details()
	{
		System.out.println(team_name +" " +"/%");
				System.out.println( games_Played +" " +"/%");
				System.out.println(  team_name +" " +"/%");
	}
	
	
	public String readName()
	{
			return team_name;
	}
	
	public int readPlayed()
	{
				return games_Played.read_value();
	}
	
	public int readPoints()
	{
		return point.read_value();
				
	}
	
	
	

}
