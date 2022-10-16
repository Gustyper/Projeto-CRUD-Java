public class AlunoMeu extends PessoaMeu{
	private String notaFinal;

	public AlunoMeu(String nome, String telefone, String nascimento, String cadastro, String ultimaAlteracao, String notaFinal) 
	{
		super(nome, telefone, nascimento, cadastro, ultimaAlteracao);
		this.notaFinal = notaFinal;
	}

	public String getNotaFinal() 
	{
		return notaFinal;
	}

	public void setNotaFinal(String notaFinal) 
	{
		this.notaFinal = notaFinal;
	}
	
	@Override
	public String toString() 
	{
		return "Aluno { " + "Nome: " + getNome() + ", " + "Telefone: " + getTelefone() + ", "
	+ "Data de Nascimento: " + getNascimento() + ", " + "Data de Cadastro: " + getCadastro() + ", "
	+ "Data da Ultima alteracao: " + getUltimaAlteracao() + ", " + "Nota Final: " + getNotaFinal() + " }";
    }
	
}