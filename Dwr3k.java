import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import bridges.connect.Bridges;
import bridges.connect.DataFormatter;
import bridges.data_src_dependent.ActorMovieIMDB;

public class Dwr3k 
{
	public static void main(String[] args)
	{
		LinkedList<ActorMovieIMDB> movieData = null;
		
		try 
		{
			movieData = new LinkedList<ActorMovieIMDB>(DataFormatter.getActorMovieIMDBData(5000000));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		for(ActorMovieIMDB value : movieData)
//		{
//			if(value.getMovie().equals("Being_John_Malkovich_(1999)"))
//			{
//				System.out.println(value.getActor());
//			}
//		}
		
		ActorComparator sorter = new ActorComparator();
		
		Collections.sort(movieData, sorter);
		
		for(ActorMovieIMDB value : movieData)
		{
			if(value.getMovie().equals("Being_John_Malkovich_(1999)"))
			{
				System.out.println(value.getActor());
			}
		}
		
		
	}
}
