
public class Pessoa {
	public String nome;
	public String sobrenome;
	
	public Pessoa(String pnome,String psobrenome) {
		this.nome = pnome;
		this.sobrenome = psobrenome;
	}
	public Pessoa()
	{
		
	}
	
	public String getNomeCompleto()
	{
		return this.nome + " " + this.sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

}
