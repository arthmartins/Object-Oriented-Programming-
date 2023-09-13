import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	List<Mp3> musicas = new ArrayList<Mp3>();
	musicas.add(new Mp3("Dias atras", "Cpm22"));
	musicas.add(new Mp3("Ceu Azul","Charlie Brown Jr"));
	musicas.add(new Mp3("Bohemian Rhapsody","Queen"));
	musicas.add(new Mp3("Wish you're here","Pink Floyd"));
	musicas.add(new Mp3("Mr. Brightside","The Killers"));
	musicas.add(new Mp3("Still love you","Scorpions"));
	
	
	
	Mp3.ordenarMusicas(musicas, 1);
	
	for(Mp3 c: musicas)
	{	
		System.out.printf("Artista = %s\n",c.getArtista());
		System.out.printf("Musica = %s\n\n",c.getTitulo());
	}
	
	Mp3.embaralharMusicas(musicas);
	
	System.out.println("------------------------------");
	
	for(Mp3 c: musicas)
	{	
		System.out.printf("Artista = %s\n",c.getArtista());
		System.out.printf("Musica = %s\n\n",c.getTitulo());
	}
	
	scan.close();
	
	}

}
