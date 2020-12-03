import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

import exceptions.LoginErrorException;
import exceptions.UsuarioNaoExisteException;
import funcionario.Cargo;
import funcionario.Funcionario;
import funcionario.GerenteFuncionarios;
import paciente.Endereco;
import paciente.GerentePacientes;
import paciente.Paciente;
import paciente.Perguntas;

public class Main {

	public static void main(String[] args) throws ParseException, UsuarioNaoExisteException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		GerenteFuncionarios ga = new GerenteFuncionarios();
		GerentePacientes gp = new GerentePacientes();

		/// TESTE
		gp.addPaciente(new Paciente("PacienteTeste", sdf.parse("03/03/2000"), "M", "PB",
				new Endereco("Rio Tinto", "Rua Lu�s", "PB", 58246000), 234234,
				new Perguntas("S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S"), 234));
		ga.addFuncionario(new Funcionario("a", "a", "a", sdf.parse("03/03/2000"), Cargo.valueOf("M�DICO"), 000));
		///

		boolean sair = false;

		while (!sair) {

			int opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Login\n" + "2 - Sair do Sistema"));

			switch (opc) {
			case 1: {
				String email = JOptionPane.showInputDialog("Digite o login: ");
				String senha = JOptionPane.showInputDialog("Digite a senha: ");
				try {
					String usuario = ga.login(email, senha);
					if (usuario.equals("ADM")) {
						System.out.println("ADMINISTRADOR LOGADO\n");
						int opc1 = 0;
						opc1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Funcionario \n"
								+ "2 - Listar Funcion�rios \n" + "3 - Deletar Funcion�rio "));
						switch (opc1) {
						case 1: {
							String login = JOptionPane.showInputDialog("Digite o login do funcion�rio: ");
							String senha1 = JOptionPane.showInputDialog("Digite a senha do funcion�rio: ");
							int codigo = Integer.parseInt(
									JOptionPane.showInputDialog("Digite o c�digo do funcion�rio (apenas n�meros): "));
							String nome = JOptionPane.showInputDialog("Digite o nome do funcion�rio: ");
							String dataDeNascimento = JOptionPane
									.showInputDialog("Digite a data de nascimento do funcion�rio (dd/mm/aaaa): ");
							String cargo = JOptionPane.showInputDialog("Digite o cargo do funcion�rio: ").toUpperCase();
							ga.addFuncionario(new Funcionario(login, senha1, nome, sdf.parse(dataDeNascimento),
									Cargo.valueOf(cargo), codigo));
							break;
						}
						case 2: {
							System.out.println("LISTA DE FUNCION�RIOS: \n");
							ga.listarFuncionarios();
							break;
						}
						case 3: {
							int codigo = Integer.parseInt(
									JOptionPane.showInputDialog("Digite o c�digo do funcion�rio que deseja excluir:"));
							try {
								if (ga.funcionarioExiste(codigo)) {
									System.out.println(ga.delFuncionario(codigo));
								}
							} catch (UsuarioNaoExisteException e) {
								System.out.println(e.getMessage());
							}							
							break;
						}
						}

					} else if (usuario.equals("FUN")) {
						boolean sair2 = false;
						while (!sair2) {
							int opc1 = 0;
							opc1 = Integer.parseInt(JOptionPane
									.showInputDialog("1 - Cadastrar Paciente \n" + "2 - Definir Prioridade \n"
											+ "3 - Ver Prioridades \n" + "4 - Alterar Prioridade \n"
											+ "5 - Ver Todos Os Pacientes \n" + "6 - Deletar Paciente "));
							switch (opc1) {
							case 1: {
								JOptionPane.showMessageDialog(null, "Digite os dados do paciente com aten��o!");
								String nome = JOptionPane.showInputDialog("Digite o nome completo do paciente:");
								String dataDeNascimento = JOptionPane
										.showInputDialog("Digite a data de nascimento do paciente (dd/mm/aaaa):");
								String sexo = JOptionPane.showInputDialog("Digite o sexo do paciente (M/F): ");
								int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o RG do paciente: "));

								JOptionPane.showMessageDialog(null,
										"Agora digite os dados do endere�o do paciente com aten��o!");
								String rua = JOptionPane.showInputDialog(
										"Digite a rua do paciente junto com o n�mero de sua resid�ncia:");
								int cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep do paciente:"));
								String cidade = JOptionPane.showInputDialog("Digite a cidade do paciente:");
								String estado = JOptionPane.showInputDialog("Digite o estado do paciente:");
								int telefone = Integer
										.parseInt(JOptionPane.showInputDialog("Digite o telefone do paciente:"));

								JOptionPane.showMessageDialog(null, "Responda ao question�rio cl�nico com aten��o!");
								String pergunta1 = JOptionPane.showInputDialog("Voc� faz uso de bebida alc�olica?");
								String pergunta2 = JOptionPane.showInputDialog("� fumante?");
								String pergunta3 = JOptionPane.showInputDialog("Pratica atividade f�sica?");
								String pergunta4 = JOptionPane.showInputDialog("Tem press�o alta?");
								String pergunta5 = JOptionPane.showInputDialog("Possui problemas card�acos?");
								String pergunta6 = JOptionPane.showInputDialog("Sua taxa de colesterol � alta?");
								String pergunta7 = JOptionPane.showInputDialog("� diab�tico?");
								String pergunta8 = JOptionPane.showInputDialog("Voc� possui doen�a pulmonar?");
								String pergunta9 = JOptionPane.showInputDialog(
										"Usa algum tipo de medica��o para o tratamento de alguma doen�a?");
								String pergunta10 = JOptionPane.showInputDialog("� gestante de alto risco?");
								String pergunta11 = JOptionPane.showInputDialog("Possui doen�as renais?");
								String pergunta12 = JOptionPane.showInputDialog("Possui doen�as hep�ticas?");
								String pergunta13 = JOptionPane.showInputDialog("� obeso?");
								String pergunta14 = JOptionPane.showInputDialog("J� fez ou faz quimioterapia?");

								gp.addPaciente(new Paciente(nome, sdf.parse(dataDeNascimento), sexo, estado,
										new Endereco(cidade, rua, estado, cep), telefone,
										new Perguntas(pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6,
												pergunta7, pergunta8, pergunta9, pergunta10, pergunta11, pergunta12,
												pergunta13, pergunta14),
										rg));

								break;
							}
							case 2: {
								System.out.println("Lista de Pacientes Que Ainda N�o T�m Prioridade Definida: \n");
								System.out.println(gp.listarPacientesSemPrioDefi() + "\n");

								int rg = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o RG do paciente a definir prioridade: "));
								if (gp.pacienteExiste(rg)) {
									System.out.println(gp.listarPerguntas(rg));
									String prioridade = JOptionPane.showInputDialog(
											"Qual � o n�vel de prioridade desse paciente (VERDE/AMARELO/VERMELHO)? ");
									gp.alterarPrioridade(prioridade, rg);
									JOptionPane.showMessageDialog(null, "Prioridade Definida Com Sucesso!");
								} else {
									throw new UsuarioNaoExisteException(
											"N�O EXISTE PACIENTE REGISTRADO COM ESTE RG!\n");
								}
								break;
							}
							case 3: {
								System.out.println("Lista de Pacientes Com Prioridade Definida: \n");
								gp.listarPacientesComPrioDefi();
								break;
							}
							case 4: {
								System.out.println("Lista de Pacientes Com Prioridade Definida: \n");
								System.out.println(gp.listarPacientesComPrioDefi() + "\n");

								int rg = Integer.parseInt(JOptionPane
										.showInputDialog("Digite o RG do paciente que deseja alterar prioridade: "));
								try {
									if (gp.pacienteExiste(rg)) {

										System.out.println(gp.listarPerguntas(rg));
										String prioridade = JOptionPane.showInputDialog(
												"Qual � o n�vel de prioridade desse paciente (VERDE/AMARELO/VEMERMEHO)? ");
										gp.alterarPrioridade(prioridade, rg);
										JOptionPane.showMessageDialog(null, "Prioridade Alterada Com Sucesso!");
									}
								} catch (UsuarioNaoExisteException e) {
									System.out.println(e.getMessage());
								}
								break;
							}
							case 5: {
								System.out.println("Lista de Todos Os Pacientes: \n");
								gp.listarPacientes();
								break;
							}
							case 6: {
								int rg = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o RG do paciente que deseja deletar: "));
								try {
									if (gp.pacienteExiste(rg)) {

										gp.deletarPaciente(rg);
										JOptionPane.showMessageDialog(null, "Paciente Excluido Com Sucesso!");
									}
								} catch (UsuarioNaoExisteException e) {
									System.out.println(e.getMessage());
								}
								break;
							}
							case 7: {
								sair2 = true;
								break;
							}
							}
						}
					}
				} catch (LoginErrorException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 2: {
				sair = true;
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Voc� digitou uma op��o inv�lida!");
			}
			sc.close();
		}
	}

}
