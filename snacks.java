import java.util.*;
import java.lang.*;
import java.io.*;

class snacks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int totalCostIndividual = 2 * X + 3 * Y;
        int totalCostCombo = 2 * Z + Y;
        int minCost = Math.min(totalCostIndividual, totalCostCombo);
        System.out.println(minCost);

	}
}
