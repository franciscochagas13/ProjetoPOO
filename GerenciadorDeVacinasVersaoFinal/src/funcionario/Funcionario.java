package funcionario;

import java.util.Date;

import entidades.Pessoa;

public class Funcionario extends Pessoa{

	private String login;
	private String senha;
	private Integer codigo;
	private Cargo cargo;
	
	public Funcionario(String login, String senha, String nome, 
			Date dataDeNascimento, Cargo cargo, Integer codigo) {
		super(nome, dataDeNascimento);
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
		this.codigo = codigo;
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
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() +"\n"
				+ "Cargo: " + this.getCargo().name() +"\n"
				+ "Código: " + this.getCodigo() +"\n"
				+ "Login: " + this.getLogin()+"\n";
	}
	
	
}
