import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Dog 
{
	private String name;
	private int registered;


	public Dog()
	{

	}

	public Dog(String name, int count)
	{
		this.name = name;
		registered = count;
	}

	public static void main(String[] args) throws FileNotFoundException
	{

		File name = new File("Dog_Names.csv");
		Scanner reader = new Scanner(name);
		reader.nextLine();

		ArrayList<Dog> list = new ArrayList<>();

		while(reader.hasNext())
		{
			String line = reader.nextLine();
			String[] values = line.split(",");

			String dogName = values[0];
			int  count = Integer.valueOf(values[1]);

			list.add(new Dog(dogName, count));
		}

		reader.close();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a Dog name");
		String input = in.next();
		
		for(Dog value : list)
		{
			if(value.name.equals(input))
			{
				//System.out.println(input + " is registered " + value.registered + " times.");
			}
		}
				

	}

}
