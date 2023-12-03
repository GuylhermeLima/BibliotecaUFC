package biblioteca.view;

import java.util.*;
import biblioteca.model.*;

public class MainView implements Observer{
	private Model model; //Guarda o modelo
	private MainViewController controller; //Usado para guardar o controller
	private int totalUsers; //Usado para guardar o total de usuários resgistrados
	private boolean finalizar = false; // Usado para finalizar o programa
	
	public void finalizarSistema() {
		finalizar = true;
	}
	
	public void initMainView(Model model) {
		this.model = model;
		controller = new MainViewController();
		controller.initMainViewController(model, this);
		model.attachObserver(this);
		menuPrincipal();
	}
	
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		String opcoes[] = {"[1] - Login","[2] - Cadastro","[3] - Fechar"};
		do {
			System.out.println("==== Biblioteca UFC ====");
			System.out.println();
			System.out.println("Usuarios Cadastrados: " + totalUsers);
			if(model.getUsuarioAutenticado() != null) {
				opcoes[0] = "[1] - Logout";
			}else{
				opcoes[0] = "[1] - Login";
			}
			System.out.println();
			System.out.println(opcoes[0]);
			System.out.println(opcoes[1]);
			System.out.println(opcoes[2]);
			System.out.println();
			System.out.println("Digite a opcao desejada: ");
			String evento = sc.nextLine();
			controller.selecaoEvento(evento);
			
		}while (!finalizar);
		sc.close();
		
		
	}

	public void update() {
		
		totalUsers = model.getTotalUsuarios();
		
	}
	
}
