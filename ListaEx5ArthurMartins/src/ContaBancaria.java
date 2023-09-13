import java.math.BigDecimal;

public abstract class ContaBancaria {
		
		private String cliente;
		private String numeroConta;
		protected BigDecimal saldo;
		
		public ContaBancaria(String nome, String conta)
		{
			this.cliente=nome;
			this.numeroConta=conta;
			this.saldo = BigDecimal.ZERO;
		}
		
		public abstract BigDecimal sacar(BigDecimal valor);
	
		void depositar(BigDecimal valor)
		{
			this.saldo = saldo.add(valor);	
		}
		
		public String getCliente() 
		{
			return this.cliente;
		}
		String getNumeroConta() {
			return this.numeroConta;
		}
		BigDecimal getSaldo() {
			return this.saldo;
		}
		
	

}
