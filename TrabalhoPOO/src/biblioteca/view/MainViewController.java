package biblioteca.view;

import biblioteca.model.*;

public class MainViewController implements Observer{
	
	private Model model;
	private MainView view;

	public void initMainViewController(Model model, MainView view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a biblioteca.view
		model.attachObserver(this);
	}
	
	public void update() {
		
	}
	
	public void selecaoEvento(String evento) {
		switch(evento) {
			case "1" :
				LoginSwitchView view2 = new LoginSwitchView();
				view2.initLoginSwitchView(model);
				break;
			case "2" : 
				CadastroSwitchView view3 = new CadastroSwitchView();
				view3.initCadastroSwitchView(model);
				break;
			case "3" : System.out.println("Saindo do sistema..");
				view.finalizarSistema();	
				break;
		}
	}
	
}
