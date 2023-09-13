package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		int totalSimulations = in.nextInt();
		for(int i = 0; i < totalSimulations; i++)
		{
			double start = startAmount;
			int plays = 0;
			String result;
			while(start > 0 && start < winLimit)
		{
			double chance = Math.random();
			if(chance<=winChance)
			{start = start + 1;}
			else
			{start = start - 1;}
			plays++;
		}
			if(start==0.0)
			{result = "Loss";}
			else
			{result = "Win";}
			System.out.println("Day " + i + " Plays: " + plays + "  " + result);
		}
		



	}

}
