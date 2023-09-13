import java.math.BigDecimal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int auxInput;
		
		System.out.println("Cadastre uma conta(poupança ou corrente)");
		System.out.println("Insira o nome do cliente");
		String nome = input.nextLine();
		
		System.out.println("Insira o numero da conta");
		String nConta = input.nextLine();
	
		System.out.println("Conta: (1) corrente ou (2)poupanca");
		int conta = input.nextInt();
		
		if(conta == 1)
		{
			System.out.println("Insira o Limite");
			BigDecimal limite = BigDecimal.valueOf(input.nextInt());
			ContaCorrente cc = new ContaCorrente(nome,nConta,limite);
			do{
				printMenuCc();
				switch(auxInput= input.nextInt())
				{
				case 1:
					System.out.println("Insira o valor do Saque");
					BigDecimal quantia = BigDecimal.valueOf(input.nextInt());
					System.out.printf("Valor do saque: %.2f\n", cc.sacar(quantia));
					break;
			
				case 2:
					System.out.println("Insira o valor do Depósito");
					BigDecimal deposit = BigDecimal.valueOf(input.nextInt());
					cc.depositar(deposit);
					break;
				case 3:
					System.out.printf("Valor do saldo: %.2f\n", cc.getSaldo());
					break;
				case 4:
					
					break;
				}
			}while(auxInput!= 4);
			
		}else if(conta == 2)
		{
			System.out.println("Insira o Rendimento por dia");
			int rendimento = input.nextInt();
			ContaPoupanca cp = new ContaPoupanca(nome, nConta, rendimento);
			do{
				switch(auxInput= input.nextInt())
				{
				case 1:
					System.out.println("Insira o valor do Saque");
					BigDecimal quantia = BigDecimal.valueOf(input.nextInt());
					System.out.printf("Valor do saque: %.2f\n", cp.sacar(quantia));
					break;
			
				case 2:
					System.out.println("Insira o valor do Depósito");
					BigDecimal deposit = BigDecimal.valueOf(input.nextInt());
					cp.depositar(deposit);
					break;
				case 3:
					System.out.println("Insira a taxa de rendimento");
					int taxa = input.nextInt();
					cp.calcularNovoSaldo(taxa);
					break;
				case 4:
					System.out.printf("Valor do saldo: %.2f\n", cp.getSaldo());
					break;
				case 5:
					
					break;
				
				}
			}while(auxInput!= 5);		
		}else {
			System.out.println("Opção Inválida");
		}
				
		input.close();
	
	}
	public static void printMenuCc()
	{
		System.out.println("Escolha uma opção");
		System.out.println("(1) Sacar um valor da sua conta)");
		System.out.println("(2) Depositar um determindao valor na conta");
		System.out.println("(3) Mostrar o saldo da conta");
		System.out.println("(4) Sair do programa");
	}
	public static void printMenuCp()
	{
		System.out.println("Escolha uma opção");
		System.out.println("(1) Sacar um valor da sua conta)");
		System.out.println("(2) Depositar um determindao valor na conta");
		System.out.println("(3) Atualizar uma conta poupnça com seu rendimento");
		System.out.println("(4) Mostrar o saldo da conta");
		System.out.println("(5) Sair do programa");
		
	}

}
