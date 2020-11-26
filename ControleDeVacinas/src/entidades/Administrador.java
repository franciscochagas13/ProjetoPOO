package entidades;

import java.util.Date;

public class Administrador extends PessoaFuncionario{

	public Administrador(String login, String senha, String nome, Date dataDeNascimento, Cargo cargo) {
		super(login, senha, nome, dataDeNascimento, cargo);
	}

	
}
