import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		ArrayList<ContaCorrente> cc = new ArrayList<ContaCorrente>();
		ArrayList<ContaPoupanca> cp = new ArrayList<ContaPoupanca>();
		Scanner input = new Scanner(System.in);
		int auxInput;
		
		do{
			printMenu();
			switch(auxInput= input.nextInt())
			{
			case 1:
				input.nextLine();
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
					ContaCorrente c1 = new ContaCorrente(nome,nConta,limite);
					cc.add(c1);
					
				}else if(conta == 2)
				{
					System.out.println("Insira o Rendimento por dia");
					int rendimento = input.nextInt();
					ContaPoupanca c2 = new ContaPoupanca(nome, nConta, rendimento);
					cp.add(c2);
				}
				break;
		
			case 2:
				System.out.println("Qual o numero da conta do saque");
				String contaIndx = input.next();
				int pos = cc.indexOf(contaIndx);
				
				if(pos>-1)
				{
					System.out.printf("ACHOOO");
				}
				break;
			case 3:
				
				break;
			case 4:
				
			case 5:
				
				break;
			
			}
		}while(auxInput!= 6);

	}

	public static void printMenu()
	{
		System.out.println("Escolha uma opção");
		System.out.println("(1) Cadrastrar uma conta");
		System.out.println("(2) Sacar um valor da sua conta");
		System.out.println("(3) Depositar um determindao valor na conta");
		System.out.println("(4) Atualizar uma conta poupnça com seu rendimento");
		System.out.println("(5) Mostrar o saldo da conta");
		System.out.println("(6) Sair do programa");
		
	}
}
