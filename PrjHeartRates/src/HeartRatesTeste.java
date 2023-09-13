import java.util.Scanner;
public class HeartRatesTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o nome da pessoa");
		String nome = scan.nextLine();
		
		System.out.println("Insira o dia de nascimento");
		int dia = scan.nextInt();
		
		System.out.println("Insira o mês de nascimento");
		int mes = scan.nextInt();
		
		System.out.println("Insira o ano de nascimento");
		int ano = scan.nextInt();
		
		HeartRates frequencia = new HeartRates(nome,dia,mes,ano);
		
		int idade = frequencia.calcularIdade(26,9,2022);
		int freqMax = frequencia.calcularFreqCardiacaMax(idade);
		
		System.out.println("---------------------------");
		System.out.printf("Nome: %s\n",frequencia.getName());
		System.out.printf("Idade: %d anos\n",idade);
		System.out.printf("Frequência cardíaca Maxima: %d batimentos por minuto\n",freqMax);
		System.out.printf("Sua frequência cardíaca alvo está entre %.2f e %.2f batimentos por minuto\n",frequencia.calcularMenorIntervaloFreqAlvo(freqMax),frequencia.calcularMaiorIntervaloFreqAlvo(freqMax));
		
			
		scan.close();

	}

}
