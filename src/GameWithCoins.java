import java.util.*;

public class GameWithCoins {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);		
		
		int trials = scan.nextInt();
	
		Solver solver = new Solver();
		
		for( int i = 0; i < trials; i++)
		{
			
			System.out.println(solver.findWinner(scan.nextInt(), scan.nextInt()));
			
		}
		
	}
	
}

class Solver {
	
	public Solver()
	{
		
	}
	
	
	public String findWinner(int a, int b)
	{
		if(a == 0 || b == 0 || ((a+b+1)%2==0)) return "First";
		
		return "Second";
	}
	
}	
