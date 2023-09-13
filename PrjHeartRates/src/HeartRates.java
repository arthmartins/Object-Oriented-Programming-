
public class HeartRates {
	private String name;
	private int diaNascimetno;
	private int mesNascimento;
	private int anoNascimento;
	
	public HeartRates(String nome,int dia,int mes,int ano)
	{
		this.name = nome;
		this.diaNascimetno = dia;
		this.mesNascimento = mes;
		this.anoNascimento = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String pname) {
		this.name = pname;
	}

	public int getDiaNascimetno() {
		return diaNascimetno;
	}

	public void setDiaNascimetno(int pdiaNascimetno) {
		this.diaNascimetno = pdiaNascimetno;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int pmesNascimento) {
		this.mesNascimento = pmesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int panoNascimento) {
		this.anoNascimento = panoNascimento;
	}
	
	public int calcularIdade(int diaAtual,int mesAtual, int anoAtual)
	{
		if(mesAtual > this.mesNascimento)
		{
			return anoAtual - this.anoNascimento;
		}else if(mesAtual == mesNascimento) 
		{
			if(diaAtual >= this.diaNascimetno) 
			{
				return anoAtual - this.anoNascimento;
			}else 
			{
				return anoAtual - this.anoNascimento -1;
			}
		}else 
		{
			return anoAtual - this.anoNascimento -1;
		}
	}
	
	public int calcularFreqCardiacaMax(int idade)
	{
		return 220 - idade;
	}
	public double calcularMenorIntervaloFreqAlvo(int FreqMax)
	{
		return FreqMax * 0.50;
	}
	public double calcularMaiorIntervaloFreqAlvo(int FreqMax)
	{
		return FreqMax * 0.85;
	}
	
}
