import java.util.Comparator;
import bridges.data_src_dependent.ActorMovieIMDB;
//import bridges.data_src_dependent.DataSource;

public class ActorComparator implements Comparator<ActorMovieIMDB>
{

	
	public int compare(ActorMovieIMDB firstActor, ActorMovieIMDB secondActor) 
	{	
		return firstActor.getActor().compareTo(secondActor.getActor());
	}

}
