public class PessoaMeu {
	private String nome;
	private String telefone;
	private String nascimento;
	private String cadastro;
	private String ultimaAlteracao;
	
	public PessoaMeu(String nome, String telefone, String nascimento, String cadastro, String ultimaAlteracao) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.cadastro = cadastro;
		this.ultimaAlteracao = ultimaAlteracao;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}

	public String getNascimento() 
	{
		return nascimento;
	}

	public void setNascimento(String nascimento) 
	{
		this.nascimento = nascimento;
	}

	public String getCadastro() 
	{
		return cadastro;
	}

	public String getUltimaAlteracao() 
	{
		return ultimaAlteracao;
	}
	
	public void setUltimaAlteracao(String ultimaAlteracao) 
	{
		this.ultimaAlteracao = ultimaAlteracao;
	}

	public String toString() 
	{
		return "Pessoa { " + "Nome: " + getNome() + ", " + "Telefone: " + getTelefone() + ", " 
		+ "Data de Nascimento: " + getNascimento() + ", " + "Data de Cadastro: " + getCadastro() + ", " 
		+ "Data da Ultima alteracao: " + getUltimaAlteracao() + " }";
    }
}