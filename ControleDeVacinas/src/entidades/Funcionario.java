package entidades;

import java.util.Date;

public class Funcionario extends PessoaFuncionario {

	private int codigo;

	public Funcionario(String login, String senha, String nome, Date dataDeNascimento, Cargo cargo, int codigo) {
		super(login, senha, nome, dataDeNascimento, cargo);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nome:\n" + "Código" + "Data de Nascimento";
	}

}
