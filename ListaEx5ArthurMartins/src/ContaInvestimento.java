import java.math.BigDecimal;

public class ContaInvestimento extends Tributavel{

	public ContaInvestimento(String nome,String cliente)
	{
		super(nome,cliente);
	}
	
	public BigDecimal sacar(BigDecimal valor) {
		
		if(saldo.compareTo(BigDecimal.ZERO)>=0 && saldo.compareTo(valor)>=0)
		{
				saldo = this.saldo.subtract(valor);
				return valor;
			}else {
				System.out.println("Saldo insuficiente");
				return BigDecimal.ZERO;
			}
	}
	
	public void calcularNovoSaldo(int rendimento) {
		BigDecimal rendimentoperc = BigDecimal.valueOf(rendimento).divide(BigDecimal.valueOf(100));
		this.saldo = saldo.multiply(BigDecimal.valueOf(1).add(rendimentoperc));
	}
	
	public BigDecimal calcularTaxaAdministracao(BigDecimal rendimento) {
		
		rendimento = rendimento.divide(BigDecimal.valueOf(100));
		BigDecimal lucro = this.saldo.multiply(rendimento);
		return lucro.multiply(BigDecimal.valueOf(0.01));
		
	}
}
