import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {
	BigDecimal limite;
	public ContaCorrente(String nome, String conta,BigDecimal limite)
	{
		super(nome,conta);
		this.limite = limite;
	}
	
	@Override
	public BigDecimal sacar(BigDecimal quantidade)
	{
		BigDecimal newSaldo = this.saldo.subtract(quantidade);
		newSaldo = newSaldo.multiply(BigDecimal.valueOf(-1));
		if(newSaldo.compareTo(limite)<=0)
		{
			this.saldo = this.saldo.subtract(quantidade);
			return quantidade;
		}
		else {
			System.out.println("Saldo indisponivel e ultrapassa o valor limite");
			return BigDecimal.valueOf(0);
		}
	}
}
