import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<ContaBancaria> cb = new ArrayList<ContaBancaria>();
		Scanner input = new Scanner(System.in);
		int auxInput;
		int tipoConta;
		BigDecimal rendimento;
		String numConta;
		ContaBancaria c;
		
		do{
			printMenu();
			switch(auxInput= input.nextInt())
			{
				
			case 1: //Cadastrar conta
				System.out.println("Insira o nome do cliente");
				input.nextLine();
				String nome = input.nextLine();
				
				System.out.println("Qual o tipo da conta:");
				System.out.println("(1) Conta Poupanca  (2) Conta Corrente  (3) Conta Investimento");
				
				tipoConta = input.nextInt();
				
				System.out.println("Insira o numero da conta");
				numConta = input.next();
				
				switch(tipoConta) {
				
				case 1:	
					System.out.println("Insira o Rendimento em % dessa conta:");
					int diaRend = input.nextInt();
					ContaPoupanca c1 = new ContaPoupanca(nome,numConta,diaRend);
					cb.add(c1);
					break;
				case 2:
					System.out.println("Insira o Limite");
					int limite = input.nextInt();
					ContaCorrente c2 = new ContaCorrente(nome,numConta,BigDecimal.valueOf(limite));
					cb.add(c2);
					break;
				case 3:
					ContaInvestimento c3 = new ContaInvestimento(nome,numConta);
					cb.add(c3);
					break;
					
				}
				System.out.println("Conta cadastrada com sucesso");
				break;
				
		
			case 2: //Saque deu uma conta
				System.out.println("Insira o valor a ser sacado:");
				BigDecimal valor = input.nextBigDecimal();
				
				System.out.println("Insira o numero da conta que deseja sacar:");
				numConta = input.next();
				
				c = getObject(cb,numConta);
				if(c!=null) {
					if(c instanceof ContaPoupanca){
					
						System.out.printf("\nValor sacado: %.2f\n",((ContaPoupanca)c).sacar(valor));
					
					}else if(c instanceof ContaCorrente) {
						System.out.printf("\nValor sacado: %.2f\n",((ContaCorrente)c).sacar(valor));
					}else {
						System.out.printf("\nValor sacado: %.2f\n",((ContaInvestimento)c).sacar(valor));
					}
					System.out.printf("%nSaldo = %.2f%n", c.getSaldo());
				}
				else
					System.out.println("Conta não encontrada");
				break;
				
			case 3: //Atualizar o saldo de uma conta poupança ou investimento
				System.out.println("Numero da conta que deseja atualizar o"
						+ " valor do saldo:");
				input.nextLine();
				numConta = input.nextLine();
				
				c = getObject(cb,numConta);
				if(c!=null) {
					if(c instanceof ContaPoupanca) {
						((ContaPoupanca)c).calcularNovoSaldo(((ContaPoupanca)c).getDiaRendimento());
						System.out.printf("Saldo atualizado! Novo Saldo = %.2f", 
								((ContaPoupanca)c).getSaldo());
					}
					else if(c instanceof ContaInvestimento) {
						System.out.println("Insira o rendimento da conta investimento:");
						int rend = input.nextInt();
						((ContaInvestimento)c).calcularNovoSaldo(rend);
						System.out.printf("Saldo atualizado! Novo Saldo = %.2f", 
								c.getSaldo());
					}
					else
						System.out.println("Numero de conta inválido/Não é uma conta poupança"
								+ " nem investimento!!");
				}
				else
					System.out.println("Conta não encontrada");
				
				break;
			case 4: //Depositar um valor em uma conta
				
				System.out.println("Insira o valor a ser depositado");
				BigDecimal deposito = input.nextBigDecimal();
				
				System.out.println("Insira o numero da conta que deseja depositar:");
				numConta = input.next();
				
				c = getObject(cb,numConta);
				
				if(c!=null) {
					c.depositar(deposito);
					System.out.printf("Deposito feito! Novo Saldo = %.2f%n", c.getSaldo());
				}
				else
					System.out.println("Conta não encontrada");
				break;
				
			case 5: //Ver o saldo de uma conta
				System.out.println("Insira o numero da conta que deseja ver o saldo:");
				numConta = input.next();
				
				c = getObject(cb,numConta);
				if(c!=null) 
					System.out.printf("%nSaldo = %.2f%n", c.getSaldo());
				else
					System.out.println("Conta não encontrada");
				
				break;
				
			
			case 6: //Calcular tributos da conta investimento
				
				System.out.println("Insira o numero da conta que deseja "
						+ "calcular os tributos:");
				numConta = input.next();
				System.out.println("Insira o rendimento dessa conta:");
				rendimento = input.nextBigDecimal();
				
				c = getObject(cb,numConta);
				if(c!=null) {
					if(c instanceof ContaInvestimento)		
						System.out.printf("\nTributos dessa conta = %.2f\n",
								((ContaInvestimento)c).calcularTributo(rendimento));
					else
						System.out.println("Numero de conta inválido/Não é uma conta investimento!!");
				}
				else
					System.out.println("Conta não encontrada");
				
				break;
				
			case 7: //Calcular taxa de administração de uma conta investimento
				System.out.println("Insira o numero da conta que deseja "
						+ "calcular os tributos:");
				numConta = input.next();
				System.out.println("Insira o rendimento dessa conta:");
				rendimento = input.nextBigDecimal();
				
				c = getObject(cb,numConta);
				if(c!=null) {
					if(c instanceof ContaInvestimento)				
						System.out.printf("\nTaxa de administração dessa conta = %.2f\n",
								((ContaInvestimento)c).calcularTaxaAdministracao(rendimento));
					else
						System.out.println("Numero de conta inválido/Não é uma conta investimento!!");
				}
				else
					System.out.println("Conta não encontrada");
				break;	
			
			}
		}while(auxInput!= 8);
		
		input.close();
		
	}
	
	public static void printMenu()
	{
		System.out.println("\nEscolha uma opção");
		System.out.println("(1) Cadastrar uma conta");
		System.out.println("(2) Sacar um valor da sua conta");
		System.out.println("(3) Atualizar uma conta poupança com seu rendimento");
		System.out.println("(4) Depositar um determindao valor na conta");
		System.out.println("(5) Mostrar o saldo da conta");
		System.out.println("(6) Calcular os tributos de uma conta");
		System.out.println("(7) Calcula a taxa de administração de uma conta investimento");
		System.out.println("(8) Sair do programa");
	}
	
	public static int conferirNumeroContaBancaria(ArrayList<ContaBancaria> c1,String NumeroConta)
	{
		for(ContaBancaria c2: c1)
		{
			if(c2.getNumeroConta().equals(NumeroConta))
			{
				int posic = c1.indexOf(c2);
				return posic;
			}
		}
		return -1;
	}
	
	public static ContaBancaria getObject(ArrayList<ContaBancaria> cb, String conta)
	{
		
		int index = conferirNumeroContaBancaria(cb,conta);
		if(index >= 0)
		{
			return cb.get(index);
		}else
			return null;
		
	}
}
