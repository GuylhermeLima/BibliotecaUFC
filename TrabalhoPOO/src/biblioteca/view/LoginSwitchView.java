package biblioteca.view;

import java.util.Scanner;

import biblioteca.model.Model;
import biblioteca.view.MainViewController;

public class LoginSwitchView implements Observer{
	
	private Model model; //Guarda o modelo
	private LoginSwitchViewController controller; //Usado para guardar o controller
	private int totalUsers; //Usado para guardar o total de usuários resgistrados
	
	public void initLoginSwitchView(Model model) {
		this.model = model;	// Guarda o modelo
		controller = new LoginSwitchViewController();	// Cria seu controller
		controller.initLoginSwitchViewController(model, this);	// Inicializa o controller
		model.attachObserver(this);	// Registra a poo.view na lista de observadores do modelo
		loginSwitch();
	}
	
	public void loginSwitch() {
		Scanner sc = new Scanner(System.in);
		String opcoes[] = {"[1] - Aluno","[2] - Servidor","[3] - Bibliotecario"};
		boolean testeEntrada = true;
		do {
			System.out.println("==== Biblioteca UFC ====");
			System.out.println();
			System.out.println("Usuarios Cadastrados: " + totalUsers);
			System.out.println();
			System.out.println(opcoes[0]);
			System.out.println(opcoes[1]);
			System.out.println(opcoes[2]);
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
