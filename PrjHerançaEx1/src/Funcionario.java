import java.math.BigDecimal;

public class Funcionario extends Pessoa {
	public String matricula;
	public BigDecimal salario;
	
	public BigDecimal getSalarioPrimeiraParcela()
	{
		return salario.multiply(BigDecimal.valueOf(0.6));
		
	}
	public BigDecimal getSalarioSegundaParcela()
	{
		return salario.multiply(BigDecimal.valueOf(0.4));
		
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		if(salario.compareTo(BigDecimal.ZERO)>= 0) {
		this.salario = salario;
		}else {
			System.out.println("Salário invalido");
		}
	}
	

	
}
