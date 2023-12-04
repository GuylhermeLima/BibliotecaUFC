package biblioteca.view;

import biblioteca.model.Model;

public class LoginSwitchViewController implements Observer{
	private Model model;
	private LoginSwitchView view;
	
	public void initLoginSwitchViewController(Model model, LoginSwitchView view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a biblioteca.view
		model.attachObserver(this);
	}
	
	public void selecaoEvento(String evento) {
		switch(evento) {
			case "1" : System.out.println("LOGIN USUÁRIO: ALUNO");
				break;
			case "2" : System.out.println("LOGIN USUÁRIO: SERVIDOR");
				break;
			case "3" : System.out.println("LOGIN USUÁRIO: BIBLIOTECARIO");
				break;
			default:
				System.out.println("ENTRADA INVÁLIDA, TENTE OUTRA VEZ");
				break;
		}
	}
	
	public void update() {
		
	}

}
