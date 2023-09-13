import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {
	public int diaRendimento;
	
	public ContaPoupanca(String nome, String conta,int rendimento)
	{
		super(nome,conta);
		this.diaRendimento = rendimento;
	}
	
	public void calcularNovoSaldo(int rendimento)
	{
		saldo = saldo.multiply(BigDecimal.valueOf(100).add(BigDecimal.valueOf(rendimento)));
	}
}
