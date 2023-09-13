
public class GerenteTeste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(10000);
		
		gerente.Nome = "Guda";
		
		System.out.println(gerente.Nome);
		System.out.printf("O salario era %.2f",gerente.getSalario());
		
		gerente.aumentarSalario();
		System.out.printf("%nO salario agora é de %.2f%n",gerente.getSalario());
		
		System.out.println(gerente.Nome);
		System.out.printf("O salario era %.2f",gerente.getSalario());
		
		gerente.aumentarSalario(20);
		
		System.out.printf("%nO salario agora é de %.2f",gerente.getSalario());
		
		
		

	}

}
