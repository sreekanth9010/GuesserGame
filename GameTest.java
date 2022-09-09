package guesserGame;

import java.util.Scanner;

class Guesser
{
	int guessNum;
	Scanner sc = new Scanner(System.in);
	public int guessNumber() {
		System.out.println("Guesser please guess the number.!");
		guessNum=sc.nextInt();
		
		
		return guessNum;
	}
}

class Player
{
	int pguessNum;
	Scanner sc = new Scanner(System.in);
	public int pguessNumber()
	{
		System.out.println("Player please guess the number.!");
		pguessNum=sc.nextInt();
		return pguessNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectFromGuesser()
	{
		Guesser g = new Guesser();
		int k=g.guessNumber();
		if(k>0 &&k<10)
		{
			numFromGuesser=k;
		}
		else
		{
			System.out.println("Guesser ..! you have guessed the number out of range..!");
			collectFromGuesser();
		}
		
	}
	public void collectFromPlayer1()
	{
		Player p1 = new Player();
		
		
		int a=p1.pguessNumber();
		
		
		if(a>0 &&a<10)
		{
			numFromPlayer1=a;
		}
		else
		{
			System.out.println("Player1 ..! you have guessed the number out of range..!");
			collectFromPlayer1();
		}
		
	}
	public void collectFromPlayer2()
	{
		Player p2 = new Player();
		
		
		int b=p2.pguessNumber();
		
		
		if(b>0 &&b<10)
		{
			numFromPlayer2=b;
		}
		else
		{
			System.out.println("Player2 ..! you have guessed the number out of range..!");
			collectFromPlayer2();
		}
		
	}
	public void collectFromPlayer3()
	{
		Player p3 = new Player();
		
		
		int c=p3.pguessNumber();
		
		
		if(c>0 &&c<10)
		{
			numFromPlayer3=c;
		}
		else
		{
			System.out.println("Player3 ..! you have guessed the number out of range..!");
			collectFromPlayer3();
		}
	}
	
	public void compare()
	{
		if(numFromGuesser == numFromPlayer1 )
		{
			if(numFromGuesser == numFromPlayer2 )
			{
				if(numFromGuesser == numFromPlayer3 )
				{
					System.out.println("game tied..!");
				}
				else if(numFromGuesser == numFromPlayer3 )
				{
					System.out.println("player 1 and player3 won the game .!");
				}
				else
				{
					System.out.println("player1 has won the game..!");
				}
			}
		}
		else if(numFromGuesser == numFromPlayer2 )
		{
			
			{
				if(numFromGuesser == numFromPlayer3 )
				{
					System.out.println("player2 and player3 have won the game ..!");
				}
				else 
				{
					System.out.println("player 2 has won the game ..");
				}
			}
		}
		else
		{
			if(numFromGuesser == numFromPlayer3 )
			{
				System.out.println("player 3 has won the game..!");
			}
			else
			{
				System.out.println("game lost try again");
			}
		}
	}
	
}

public class GameTest {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectFromGuesser();
		u.collectFromPlayer1();
		u.collectFromPlayer2();
		u.collectFromPlayer3();
		u.compare();

	}

}
