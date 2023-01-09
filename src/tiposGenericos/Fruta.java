package tiposGenericos;

public class Fruta {

	private String nome;
	
	public Fruta(String nome) {
		super();
		this.nome = nome;
	}
	
	@Override
	public String toString()
	{
		return "Fruta [nome:" + this.nome + "]";
	}
}
