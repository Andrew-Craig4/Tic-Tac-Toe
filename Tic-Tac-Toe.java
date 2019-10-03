
package games;
import java.util.Scanner;
public class TicTacToe 
{
boolean wincond = false;

	public static void main(String[] args)
	{
		String turn = "";
		String s1 = " ";
		String s2 = " ";
		String s3 = " ";
		String s4 = " ";
		String s5 = " ";
		String s6 = " ";
		String s7 = " ";
		String s8 = " ";
		String s9 = " ";
		System.out.println("Rules: the player specified will input a number between 1 and 9. The number will specify which space to put their letter.");
		System.out.println("1 2 3\n4 5 6\n7 8 9");
		for(int i = 1;i<=10;i++)
		{
			view(s1,s2,s3,s4,s5,s6,s7,s8,s9);
			if(i==10)
				return;
			if(i%2==1)
			{
				System.out.println("\"X\"'s turn");
				turn = "X";
				Scanner input = new Scanner(System.in);
				if(input.hasNextInt())
				{
					int l = input.nextInt();//l stands for location
					if(l>0 && l<10)
					{
						switch(l)
						{
						case 1:
							if(s1==" ")
							s1 = turn;
							break;
						case 2:
							if(s2==" ")
							s2 = turn;
							break;
						case 3:
							if(s3==" ")
							s3 = turn;
							break;
						case 4:
							if(s4==" ")
							s4 = turn;
							break;
						case 5:
							if(s5==" ")
							s5 = turn;
							break;
						case 6:
							if(s6==" ")
							s6 = turn;
							break;
						case 7:
							if(s7==" ")
							s7 = turn;
							break;
						case 8:
							if(s8==" ")
							s8 = turn;
							break;
						case 9:
							if(s9==" ")
							s9 = turn;
							break;
						}
						i = winCond(s1,s2,s3,s4,s5,s6,s7,s8,s9,"X",i);
						if(i==9)
							input.close();
					}
					
				}
			}
				else
				{
					Scanner input = new Scanner(System.in);
					System.out.println("\"O\"'s turn");
					turn = "O";
					int l = input.nextInt();//l stands for location
					if(l>0 && l<10)
					{
						switch(l)
						{
						case 1:
							if(s1==" ")
							s1 = turn;
							break;
						case 2:
							if(s2==" ")
							s2 = turn;
							break;
						case 3:
							if(s3==" ")
							s3 = turn;
							break;
						case 4:
							if(s4==" ")
							s4 = turn;
							break;
						case 5:
							if(s5==" ")
							s5 = turn;
							break;
						case 6:
							if(s6==" ")
							s6 = turn;
							break;
						case 7:
							if(s7==" ")
							s7 = turn;
							break;
						case 8:
							if(s8==" ")
							s8 = turn;
							break;
						case 9:
							if(s9==" ")
							s9 = turn;
							break;
						}
						
						i = winCond(s1,s2,s3,s4,s5,s6,s7,s8,s9,"O",i);
				}
				}
			

			
		}
		view(s1,s2,s3,s4,s5,s6,s7,s8,s9);
	}
public static void view(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9)
{
	System.out.println("|" + s1 + " " + s2 + " " + s3 + "|" + "\n" + "|" + s4 + " " + s5 + " " + s6 + "|" + "\n" + "|" + s7 + " " + s8 + " " + s9 + "|" );
}
public static int winCond(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String t,int tnum)
{
	if(s1==s2&&s1==s3&&s1==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s4==s5&&s4==s6&&s4==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s7==s8&&s7==s9&&s7==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s1==s4&&s1==s7&&s1==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s2==s5&&s2==s8&&s2==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s3==s6&&s3==s9&&s3==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s1==s5&&s1==s9&&s1==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	else if(s3==s5&&s3==s7&&s3==t)
	{
		System.out.println("\"" + t + "\" wins!");
		return 11;
	}
	return tnum;
		
}
}

