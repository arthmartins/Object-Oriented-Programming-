import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{
	private BigDecimal limite;
	
	public ContaCorrente(String nome, String conta,BigDecimal lim)
	{
		super(nome,conta);
		this.limite = lim;
	}
	public BigDecimal sacar(BigDecimal valor) {
		
		if(saldo.add(limite).compareTo(valor)>= 0 )
		{
			saldo = this.saldo.subtract(valor);
			return valor;
			
		}else {
			System.out.println("Valor do limite ultrapassado");
			return BigDecimal.ZERO;
		}
	}

	
}
