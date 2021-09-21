import java.util.*;

public class Catcher
	{
	public static void main(String[] args)
		{
	
			ArrayList names = new ArrayList();
			names.add("Johnny");
			names.add("Sarah");
			names.add("Susan");
			
			Scanner userInput = new Scanner(System.in);
			int choice = userInput.nextInt();
			
			try
				{
					System.out.println(names.get(choice));
				}
			catch (IndexOutOfBoundsException fred)
				{
					System.out.println("I'm sorry, that doesn't exist.");
				}
			finally
			{
				System.out.println("Thanks! Bye now!");
			}

			}

	}
