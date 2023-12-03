package biblioteca;

import biblioteca.model.*;
import biblioteca.view.*;

public class SistemaBiblioteca {
	
	public static void main(String [] Args) {
		Model model = new Model(); // instancia modelo
		MainView view = new MainView(); // cria primeira view
		view.initMainView(model); // inicia o view com modelo
	}

}
