package entidades;

import java.util.Date;

public class PessoaFuncionario extends Pessoa{

	private String login;
	private String senha;
	private Cargo cargo;
	
	public PessoaFuncionario(String login, String senha, String nome, 
			Date dataDeNascimento, Cargo cargo) {
		super(nome, dataDeNascimento);
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
