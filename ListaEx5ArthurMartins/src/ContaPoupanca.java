import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	
	public ContaPoupanca(String nome, String conta,int rendimento)
	{
		super(nome,conta);
		this.diaRendimento = rendimento;
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

	public int getDiaRendimento() {
		return diaRendimento;
	}
	
	public void calcularNovoSaldo(int i) {
		BigDecimal rendimentoperc = BigDecimal.valueOf(i).divide(BigDecimal.valueOf(100));
		this.saldo = saldo.multiply(BigDecimal.valueOf(1).add(rendimentoperc));
	}
}


