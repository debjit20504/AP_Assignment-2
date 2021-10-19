import java.util.*;
public class a2
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to BackPack");
		System.out.println("1. Enter as instructor");
		System.out.println("2. Enter as student");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
		int inp = scn.nextInt();
		if( inp == 1 )
		{
			System.out.println("Instructors:");
			System.out.print("0 - i0");
			System.out.print("1 - i1");
			System.out.print("Choose id: ");

		}

		else if( inp == 2 )
		{
			
		}

		else
		{
			System.exit(0);
		}
	}
}

interface instructor
{

}

interface student extends instructor
{
	
}





