package biblioteca.view;

import biblioteca.Bibliotecario;
import biblioteca.model.Model;
import biblioteca.view.CadastroBibliotecarioView;

public class CadastroBibliotecarioViewController implements Observer{
	
	private Model model;
	private CadastroBibliotecarioView view;
	
	
	public void initCadastroUsuarioViewController(Model model,CadastroBibliotecarioView view) {
		this.model = model;
		this.view = view;
		model.attachObserver(this);
	}
	
	public void selecaoEvento(String evento) {
		switch(evento) {
			case "OK" : 
				Bibliotecario biblio = new Bibliotecario(view.getNome(),view.getId(),view.getSenha());
				model.setUsuario(biblio);
				model.detachObserver(this);
				
				break;
		}
	}
	
	public void update(){
		
	}
	
}
