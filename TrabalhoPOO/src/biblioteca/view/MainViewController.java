package biblioteca.view;

import biblioteca.model.*;

public class MainViewController {
	
	private Model model;
	private MainView view;

	public void initMainViewController(Model model, MainView view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a biblioteca.view
	}
	
	public void update() {
		
	}
	
	public void selecaoEvento(String evento) {
		switch(evento) {
			case "1" :
				LoginSwitchView view3 = new LoginSwitchView();
				view3.initLoginSwitchView(model);
				break;
			case "2" : System.out.println("OK,mas falta implementar");
				break;
			case "3" : System.out.println("Saindo do sistema..");
				view.finalizarSistema();	
				break;
		}
	}
	
}
