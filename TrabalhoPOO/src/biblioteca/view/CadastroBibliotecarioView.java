package biblioteca.view;

import java.util.Scanner;

import biblioteca.model.Model;

public class CadastroBibliotecarioView implements Observer{
	
	private Model model;
	private CadastroBibliotecarioViewController controller;
	private String nome;
	private long id;
	private String senha;
	
	
	public void initCadastroBibliotecarioView(Model model) {
		this.model = model;
		controller = new CadastroBibliotecarioViewController();
		controller.initCadastroUsuarioViewController(model, this);
		model.attachObserver(this);
		cadastroBibliotecario();
		
	}
	
	public void cadastroBibliotecario() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("======= Biblioteca UFC =======");
		System.out.println("- Cadastro de Bibliotecário  -");
		System.out.println();
		System.out.println("Nome : ");
		nome=sc.nextLine();
		System.out.println("ID   : ");
		id=Integer.valueOf(sc.nextLine());
		System.out.println("Senha: ");
		senha=sc.nextLine();
		
		controller.selecaoEvento("OK");
		model.detachObserver(this);
		
	}
	
	public String getNome() {
		return nome;
	}

	public long getId() {
		return id;
	}

	public String getSenha() {
		return senha;
	}
	
	public void update() {

	}
	
}
