import java.math.BigDecimal;

public class ContaBancaria {
	private String cliente;
	public String NumeroConta;
	BigDecimal saldo;
	
	public ContaBancaria(String nome, String conta)
	{
		this.cliente = nome;
		this.NumeroConta = conta;
		this.saldo = BigDecimal.valueOf(0);
	}
	public ContaBancaria()
	{
	
	}
	
	public BigDecimal sacar(BigDecimal quantidade)
	{
		if(saldo.compareTo(quantidade)>=0) {
			saldo = saldo.subtract(quantidade);
			return quantidade;
		}
		else {
			System.out.println("Saldo insuficiente:");
			return BigDecimal.valueOf(0);
		}
	}
	public void depositar(BigDecimal valor)
	{
		saldo = saldo.add(valor);
	}

	public String getCliente() {
		return cliente;
	}

	public String getNumeroConta() {
		return NumeroConta;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
}
	
