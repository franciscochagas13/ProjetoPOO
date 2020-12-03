package funcionario;

import java.util.ArrayList;
import java.util.List;

import exceptions.LoginErrorException;
import exceptions.UsuarioNaoExisteException;

public class GerenteFuncionarios {
	List<Funcionario> funcionarios = new ArrayList<>();

	public GerenteFuncionarios() {
		// colocar aqui o usu�rio e senha do admin
		funcionarios.add(new Administrador("admin", "admin", "admin", null, Cargo.ADMIN, null));
	}

	public void addFuncionario(Funcionario pf) {
		this.funcionarios.add(pf);
	}

	public String delFuncionario(int cod) {
		for (Funcionario f: funcionarios) {
			if(f.getCargo() == Cargo.MÉDICO) {
				if(f.getCodigo() == cod) {
					this.funcionarios.remove(f);
					return "FUNCIONARIO REMOVIDO\n";
				}	
			}
		}
		return null;
	}

	public String login(String login, String senha) throws LoginErrorException{
		if (verSeUsuarioExiste(login, senha)) {
			if (verSeUsuarioIsAdmin(login, senha)) {
				return "ADM";
			}
			else {
				return "FUN";
			}
		} 
		throw new LoginErrorException("USU�RIO OU/E SENHA INCORRETOS!");
	};

	private boolean verSeUsuarioIsAdmin(String login, String senha) {
		for (Funcionario f : funcionarios) {
			if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
				if (f.getCargo() == Cargo.ADMIN) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean verSeUsuarioExiste(String login, String senha) {
		for (Funcionario f : funcionarios) {
			if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
	
	public void listarFuncionarios() {
		for (Funcionario f: funcionarios) {
			if (!(f.getCargo().name().equals("ADMIN"))) {
				System.out.println(f.toString());
			}
		}
	}
	
	public boolean funcionarioExiste(Integer codigo) throws UsuarioNaoExisteException {
		for (Funcionario f : funcionarios) {
			if (f.getCodigo() != null) {
				if (f.getCodigo().equals(codigo)) {
					return true;
				}
			}
		}
		throw new UsuarioNaoExisteException("N�O EXISTE FUNCIONARIO REGISTRADO COM ESTE C�DIGO!");
	}
}
