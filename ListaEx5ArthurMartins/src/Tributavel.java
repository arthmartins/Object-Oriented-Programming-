import java.math.BigDecimal;

public abstract class Tributavel extends ContaBancaria {

	public Tributavel(String nome,String cliente)
	{
		super(nome,cliente);
	}
	
	public BigDecimal calcularTributo(BigDecimal taxaRendimento) {
		
		taxaRendimento = taxaRendimento.divide(BigDecimal.valueOf(100));
		BigDecimal lucro = this.saldo.multiply(taxaRendimento);
		return lucro.multiply(BigDecimal.valueOf(0.005));
		
	}
	

}
