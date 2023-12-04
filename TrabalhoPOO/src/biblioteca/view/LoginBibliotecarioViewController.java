package biblioteca.view;

import biblioteca.model.Model;
import biblioteca.*;

public class LoginBibliotecarioViewController implements Observer{

	private Model model;
	private LoginBibliotecarioView view;
	
	public void initLoginBibliotecarioViewController(Model model, LoginBibliotecarioView loginBibliotecarioView) {
		this.model = model;
		this.view = view;
		model.attachObserver(this);
	}
	
	public void selecaoEvento(String evento) {
		switch (evento) {
		case "OK" :
			Pessoa biblio = model.autenticarUsuario(view.getLogin(), view.getSenha());
			if (biblio == null) {
				view.exibeMSG("ERRO: Usuario e/ou Senha invalidos!");				
			} else {
				view.exibeMSG("SUCESSO: Usuario autenticado!");
			}
			model.detachObserver(this);
			
			break;
		}
	}
	
	public void update() {
		
	}
}
