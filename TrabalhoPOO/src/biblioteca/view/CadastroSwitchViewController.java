package biblioteca.view;

import biblioteca.model.Model;

public class CadastroSwitchViewController implements Observer{
	private Model model;
	private CadastroSwitchView view;
	
	public void initCadastroSwitchViewController(Model model, CadastroSwitchView view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a biblioteca.view
		model.attachObserver(this);
	}
	
	public void selecaoEvento(String evento) {
		switch(evento) {
			case "1" : System.out.println("CADASTRO USUÁRIO: ALUNO");
				System.out.println("(Indisponível no momento)");
				view.initCadastroSwitchView(model);
				break;
			case "2" : System.out.println("CADASTRO USUÁRIO: SERVIDOR");
				System.out.println("(Indisponível no momento)");
				view.initCadastroSwitchView(model);
				break;
			case "3" : System.out.println("CADASTRO USUÁRIO: BIBLIOTECARIO");
				System.out.println("(Indisponível no momento)");
				view.initCadastroSwitchView(model);	
				break;
			case "4" : System.out.println("Voltando");
				MainView view0 = new MainView();
				view0.initMainView(model);
				break;
			default:
				System.out.println("ENTRADA INVÁLIDA, TENTE OUTRA VEZ");
				break;
		}
	}
	
	public void update() {
		
	}

}
