import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		funcionario.nome = scanner.next();
		
		System.out.println("Digite seu salário:");
		funcionario.salario = scanner.nextDouble();
		
		System.out.println("Digite o valor de reajuste do vale refeição:");
		Funcionario.ajustarVale(scanner.nextInt());
		
		

	}

}
