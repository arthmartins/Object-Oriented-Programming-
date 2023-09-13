import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
		
	 Pessoa pessoa1 = new Pessoa("Mario","Lopes");
	 Funcionario pessoa2 = new Funcionario();
	 pessoa2.setNome("Lucas");
	 pessoa2.setSobrenome("Mendes");
	 pessoa2.setSalario(BigDecimal.valueOf(2000.00));
	 Professor pessoa3 = new Professor();
	 pessoa3.setNome("Rafael");
	 pessoa3.setSobrenome("Lira");
	 pessoa3.setSalario(BigDecimal.valueOf(500.00));
	 System.out.println("Pessoa1 " + pessoa1.getNomeCompleto());
	 System.out.println("Pessoa2 " + pessoa2.getNomeCompleto());
	 System.out.println("Pessoa3 " + pessoa3.getNomeCompleto());
	 System.out.printf("Primeira parcela pessoa2 = %.2f%nSegunda parcela pessoa2 = %.2f%n",pessoa2.getSalarioPrimeiraParcela(),pessoa2.getSalarioSegundaParcela());
	 System.out.printf("Primeira parcela pessoa2 = %.2f%nSegunda parcela pessoa2 = %.2f",pessoa3.getSalarioPrimeiraParcela(),pessoa3.getSalarioSegundaParcela());
	}

}
