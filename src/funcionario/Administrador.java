package funcionario;

import java.util.Date;

public class Administrador extends Funcionario{

	public Administrador(String login, String senha, String nome, Date dataDeNascimento, Cargo cargo, Integer codigo) {
		super(login, senha, nome, dataDeNascimento, cargo, codigo);
	}
	
//	@Override
//	public String toString() {
//		return "Nome: " + this.getNome() +"\n"
//				+ "Cargo: " + this.getCargo().name() +"\n"
//				+ "Código: " + this.getCodigo() +"\n"
//				+ "Login: " + this.getLogin()+"\n";
//	}
}
