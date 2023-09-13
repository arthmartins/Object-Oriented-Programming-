import java.math.BigDecimal;

public class Professor extends Funcionario {

	@Override
	public BigDecimal getSalarioPrimeiraParcela()
	{
		return this.salario;
		
	}
	@Override
	public BigDecimal getSalarioSegundaParcela()
	{
		return BigDecimal.ZERO;
		
	}
}
