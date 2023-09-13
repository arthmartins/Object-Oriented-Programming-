
public class Gerente {
	public String Nome;
	private double Salario;
	
	public Gerente(double salario) {
		this.Salario = salario;
	}
	public double getSalario() {
		return this.Salario;
	}
	public void aumentarSalario() 
	{
		Salario = Salario*1.1;
	}
	
	public void aumentarSalario(int taxa)
	{
		Salario += (Salario*taxa)/100;
	}
	
}
