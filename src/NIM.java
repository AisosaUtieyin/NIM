import java.util.Scanner;
public class NIM{
	public static void main (String [] args)
	{
		Scanner in= new Scanner(System.in);
	int pileA=3;
	int pileB=4;
	int pileC=5;
	int removal=0;
	String actualPlayer= "";
	String player1;
	String player2;
	int turn=0;
	System.out.print("Player 1 enter your name:");
	player1=in.nextLine();
	System.out.print("Player 2 enter your name:");
	player2=in.nextLine();
	while (pileA>0 || pileB>0 || pileC>0)
	{
		if(turn%2==0){
			actualPlayer= player1;
		}
		else if(turn%2>0)
		{
			actualPlayer=player2;
		}
		System.out.println("A: " + pileA + " B: " + pileB + " C: " + pileC);
		System.out.println(actualPlayer+ " choose a pile");
		String choice=in.nextLine();
		choice=choice.toUpperCase();
		while(pileA<=0 && choice.equals("A"))
		{
			System.out.print("Sorry but this pile is empty");
			choice=in.nextLine();
			choice=choice.toUpperCase();
		}
		while(pileB<=0 && choice.equals("B"))
		{
			System.out.print("Sorry but this pile is empty");
			choice=in.nextLine();
			choice=choice.toUpperCase();
		}
		while(pileC<=0 && choice.equals("C"))
		{
			System.out.print("Sorry but this pile is empty");
			choice=in.nextLine();
			choice=choice.toUpperCase();
		}
		System.out.println("How mamy to remove from the pile you have choosen?");
		removal=in.nextInt();
		if(choice.equals("A"))
		{
			while(removal>pileA)
			{
				System.out.println("Sorry but there are not enough piles");
				removal=in.nextInt();
			}
			pileA=pileA-removal;
		}
		if(choice.equals("B"))
		{
			while(removal>pileB)
			{
				System.out.println("Sorry but there are not enough piles");
				removal=in.nextInt();
			}
			pileB=pileB-removal;
		}
		if(choice.equals("C"))
		{
			while(removal>pileC)
			{
				System.out.println("Sorry but there are not enough piles");
				removal=in.nextInt();
			}
			pileC=pileC-removal;
		}
		turn++;
	}
	}
}