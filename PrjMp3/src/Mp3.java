import java.util.Collections;
import java.util.List;
public class Mp3 {
	public String titulo;
	public String artista;
	private static int flag;
	
	public Mp3(String tit, String art)
	{
		titulo = tit;
		artista = art;
	}
	
	public static void ordenarMusicas(List<Mp3> music, int typeOrdenacao)
	{
		flag = typeOrdenacao;
		Collections.sort(music, new MusicComparator());
	}
	
	public static int buscarMusica(List<Mp3> music, int typeOrdenacao, String busca)
	{
		Mp3 m = new Mp3(null,"Cpm22");
		flag = typeOrdenacao;
		int i = Collections.binarySearch(music, m, new MusicComparator());
		return i;
		
		
	}
	
	public static void embaralharMusicas(List<Mp3> music)
	{
		Collections.shuffle(music);
	}
	
	public int getFlag()
	{
		return flag;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

}
