package autenticacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Administrador;
import entidades.Cargo;
import entidades.PessoaFuncionario;

public class GerenteAutenticacao {
	List<PessoaFuncionario> funcionarios = new ArrayList<>();

	public GerenteAutenticacao() {
		// colocar aqui o usuário e senha do admin
		funcionarios.add(new Administrador("admin", "admin", "admin", null, Cargo.ADMIN));
	}

	public void addFuncionario(PessoaFuncionario pf) {
		this.funcionarios.add(pf);
	}

	public void delFuncionario(PessoaFuncionario pf) {
		this.funcionarios.remove(pf);
	}

	public String login(String login, String senha) {
		if (verSeUsuarioExiste(login, senha)) {
			if (verSeUsuarioIsAdmin(login, senha)) {
				return "ADM";
			}
			else {
				return "FUN";
			}
		}
		return "INEXISTENTE";
	};

	private boolean verSeUsuarioIsAdmin(String login, String senha) {
		for (PessoaFuncionario f : funcionarios) {
			if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
				if (f.getCargo() == Cargo.ADMIN) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean verSeUsuarioExiste(String login, String senha) {
		for (PessoaFuncionario f : funcionarios) {
			if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
}
