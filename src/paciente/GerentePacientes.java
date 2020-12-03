package paciente;

import java.util.ArrayList;
import java.util.List;

import exceptions.UsuarioNaoExisteException;

public class GerentePacientes {

	List<Paciente> pacientes = new ArrayList<>();

	public void addPaciente(Paciente p) {
		this.pacientes.add(p);
	}
	
	public void deletarPaciente(Integer rg) throws UsuarioNaoExisteException {
		this.pacientes.remove(pesquisarPaciente(rg));
	}

	public String listarPacientes() {
		int contador = 0;
		for (Paciente p : pacientes) {
			contador++;
			System.out.println(String.format("%d - " + p, contador));
		}
		return null;
	}

	public String listarPacientesSemPrioDefi() {
		int contador = 0;
		for (Paciente p : pacientes) {
			if(p.getGrauDePrio() == null) {
				contador++;
				System.out.println(String.format("%d - " + p, contador));
			}
		}
		return null;
	}
	
	public String listarPacientesComPrioDefi() {
		int contador = 0;
		for (Paciente p : pacientes) {
			if(p.getGrauDePrio() != null) {
				contador++;
				System.out.println(String.format("%d - " + p + " Prioridade: " + p.getGrauDePrio(), contador));
			}
		}
		return null;
	}
	
	public void alterarPrioridade(String prioridade, Integer rg) throws UsuarioNaoExisteException {
		Paciente paciente = pesquisarPaciente(rg);
		paciente.setGrauDePrio(GrauDePrioridade.valueOf(prioridade.toUpperCase()));
	}
	
//	public String pesquisarPaciente(Integer rg) {
//		if (pacienteExiste(rg)) {
//			for (Paciente p : pacientes) {
//				if (p.getRg().equals(rg)) {
//					return p;
//				}
//		};
//	}

	public String listarPerguntas(Integer rg) {
		for (Paciente p : pacientes) {
			if (p.getRg().equals(rg)) {
				return "- Dados - \n\n" + p + "\n\n" + p.getPerguntas() + "\n";
			}
		}
		return null;
	}

	public boolean pacienteExiste(Integer rg) {
		for (Paciente p : pacientes) {
			if (p.getRg().equals(rg)) {
				return true;
			}
		}
		return false;
	}
	
	private Paciente pesquisarPaciente(Integer rg) throws UsuarioNaoExisteException {
		for (Paciente p : pacientes) {
			if (p.getRg() != null) {
				if (p.getRg().equals(rg)) {
					return p;
				}
			}
		}
		throw new UsuarioNaoExisteException("NÃO EXISTE PACIENTE REGISTRADO COM ESTE RG!");
	}
}
