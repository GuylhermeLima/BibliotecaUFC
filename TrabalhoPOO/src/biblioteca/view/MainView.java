package biblioteca.view;

import java.util.*;
import biblioteca.model.*;

public class MainView implements Observer{
	private Model model; //Guarda o modelo
	private MainViewController controller; //Usado para guardar o controller
	private boolean finalizar = false; // Usado para finalizar o programa
	
	public void finalizarSistema() {
		finalizar = true;
	}
	
	public void initMainView(Model model) {
		this.finalizar = false;
		this.model = model;
		controller = new MainViewController();
		controller.initMainViewController(model, this);
		model.attachObserver(this);
		menuPrincipal();
	}
	
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		String opcoes[] = {"[1] - Login","[2] - Cadastro","[3] - Fechar"};
		while (!finalizar && sc!=null) {
			System.out.println();
			System.out.println("==== Biblioteca UFC ====");
			System.out.println("----- Tela inicial -----");
			System.out.println();
			if(model.getgetUsuarioAutenticado() != null) {
				opcoes[0] = "[1] - Logout";
			}else{
				opcoes[0] = "[1] - Login";
			}
			for(int i=0;i<opcoes.length;i++) {
				System.out.println(opcoes[i]);
			}
			System.out.println();
			System.out.println("Digite a opcao desejada: ");
			String evento = sc.nextLine();
			controller.selecaoEvento(evento);
		}
		sc.close();
		
		
		
	}

	public void update() {
		
	}
	
}
