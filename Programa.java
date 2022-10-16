
import java.io.UTFDataFormatException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Programa {

	static void ShowMenu() {
		System.out.println("========MENU=======");
		System.out.println("1- Novo Cadastro");
		System.out.println("2- Lista de Cadastros");
		System.out.println("3- Atualizar Cadastro");
		System.out.println("4- Deletar Cadastro");
		System.out.println("--------------------");
		System.out.println("Qualquer outro numero para encerrar");
	}

	public static void main(String[] args) throws ParseException {

		String nome;
		String telefone;
		String nascimento;
		String ultimaAlteracao;
		String notaFinal;
		String dataCadastro;
		int input;

		List<PessoaMeu> PessoasCadastradas = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		boolean finalizar = false;

		while (!finalizar) {
			ShowMenu();

			input = scan.nextInt();

			if (input == 1)
			{
				System.out.println("");
				System.out.println("----Novo Cadastro");
				System.out.println("Nome: ");
				nome = scan.next();
				System.out.println("Telefone: ");
				telefone = scan.next();
				System.out.println("Data de Nascimento: ");
				nascimento = scan.next();

				dataCadastro = java.time.LocalDate.now().toString();
				String resposta;

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
   				dtf.format(now);
				ultimaAlteracao = dtf.format(now).toString();

				scan.nextLine();

				System.out.println("-Voce esta cadastrando um aluno?");
				System.out.println("-Responda com Sim(S) ou Nao(N)");
				resposta = scan.nextLine();
				
				if(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim"))
				{
					System.out.print("Qual e a nota final do aluno?");
					notaFinal = scan.next();

					AlunoMeu Aln = new AlunoMeu(nome, telefone, nascimento, dataCadastro, ultimaAlteracao, notaFinal);
					PessoasCadastradas.add(Aln);
				}
				else
				{
					PessoaMeu Pss = new PessoaMeu(nome, telefone, nascimento, dataCadastro, ultimaAlteracao);
					PessoasCadastradas.add(Pss);
				}
			}
			else if(input == 2)
			{
				for (PessoaMeu pessoa : PessoasCadastradas) {System.out.println(pessoa);}
			}
			else if(input == 3)
			{
				scan.nextLine();
				int i = 0;
				System.out.print("Nome do cadastro que deseja set: ");
				nome = scan.nextLine();

				for (PessoaMeu pessoa : PessoasCadastradas) {
					if (pessoa.getNome().equals(nome)) {
						System.out.println("Atualize os dados! ");
						i = PessoasCadastradas.indexOf(pessoa);
					}
				}

				System.out.print("Novo Nome: ");
				nome = scan.nextLine();
				System.out.print("Novo Telefone: ");
				telefone = scan.next();
				System.out.println("Nova Data de Nascimento: ");
				nascimento = scan.next();

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				dtf.format(now);
				ultimaAlteracao = dtf.format(now).toString();

				PessoasCadastradas.get(i).setNome(nome);
				PessoasCadastradas.get(i).setNascimento(nascimento);
				PessoasCadastradas.get(i).setTelefone(telefone);
				PessoasCadastradas.get(i).setUltimaAlteracao(ultimaAlteracao);
			}
			else if(input == 4)
			{
				scan.nextLine();
				int i = 0;
				System.out.print("Nome: ");
				nome = scan.nextLine();

				for (PessoaMeu pessoa : PessoasCadastradas) {
					if (pessoa.getNome().equals(nome)) {
						i = PessoasCadastradas.indexOf(pessoa);
					}
				}
				PessoasCadastradas.remove(i);
			}
			else
			{
				finalizar = true;
			}
		}
	}
}