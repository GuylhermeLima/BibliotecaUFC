package biblioteca.view;

import java.util.Scanner;

import biblioteca.model.Model;
import biblioteca.view.LoginBibliotecarioViewController;

public class LoginBibliotecarioView implements Observer{
	private Model model;
	private LoginBibliotecarioViewController controller;
	private String login;
	private String senha;
	
	
	public void initLoginBibliotecarioView(Model model) {
		this.model = model;
		controller = new LoginBibliotecarioViewController();
		controller.initLoginBibliotecarioViewController(model, this);
		model.attachObserver(this);
		logarBibliotecario();
	}
	
	public void logarBibliotecario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("TELA DE LOGIN");
		System.out.println("======================");
		System.out.println();
		System.out.print("Login: ");
		login = sc.nextLine();
		System.out.print("Senha: ");
		senha = sc.nextLine();
		controller.selecaoEvento("OK");
		model.detachObserver(this);
	}
	
	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	public void update() {
		
	}
	
	public void exibeMSG(String msg) {
		System.out.println();
		System.out.println(msg);
		System.out.println();
	}
	
}
