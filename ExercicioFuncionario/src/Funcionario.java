
public class Funcionario {
	public String nome;
	public double salario;
	private static double valeRefeicao = 200;
	
	public static void ajustarVale(int Valor)
	{
		valeRefeicao += (valeRefeicao * Valor)/100;
		System.out.printf("O valor de seu vale Refeição agora é: %.2f", valeRefeicao);
	}
	
}
