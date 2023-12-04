package biblioteca.view;

import java.util.Scanner;

import biblioteca.model.Model;
import biblioteca.view.MainViewController;

public class CadastroSwitchView implements Observer{
	private Model model; //Guarda o modelo
	private CadastroSwitchViewController controller; //Usado para guardar o controller
	private int totalUsers; //Usado para guardar o total de usuários resgistrados
	
	public void initCadastroSwitchView(Model model) {
		this.model = model;	// Guarda o modelo
		controller = new CadastroSwitchViewController();	// Cria seu controller
		controller.initCadastroSwitchViewController(model, this);	// Inicializa o controller
		model.attachObserver(this);	// Registra a poo.view na lista de observadores do modelo
		cadastroSwitch();
	}
	
	public void cadastroSwitch() {
		Scanner sc = new Scanner(System.in);
		String opcoes[] = {"[1] - Aluno","[2] - Servidor", "[3] - Bibliotecario","[4] - Voltar"};
		boolean testeEntrada = true;
		do {
			System.out.println();
			System.out.println("==== Biblioteca UFC ====");
			System.out.println("- Seleção de Cadastro  -");
			System.out.println();
			System.out.println("Usuarios Cadastrados: " + totalUsers);
			System.out.println();
			for(int i=0;i<opcoes.length;i++) {
				System.out.println(opcoes[i]);
			}
			System.out.println();
			System.out.println("Digite a opcao desejada: ");
			String evento = sc.nextLine();
			controller.selecaoEvento(evento);
			if(Integer.parseInt(evento)>opcoes.length) {
				testeEntrada = false;
			}
		}while(!testeEntrada);
			
		
		sc.close();
	}
	
	public void update() {
		
	}
}
