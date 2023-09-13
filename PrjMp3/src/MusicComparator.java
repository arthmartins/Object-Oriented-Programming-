import java.util.Comparator;

public class MusicComparator implements Comparator<Mp3> {

	@Override
	public int compare(Mp3 o1, Mp3 o2) {
		
		if(o1.getFlag()==1)
		{
			return o1.getArtista().compareTo(o2.getArtista());
		}
		else
		{
			return o1.getTitulo().compareTo(o2.getTitulo());
		}

	}

		
}
