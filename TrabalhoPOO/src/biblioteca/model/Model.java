package biblioteca.model;

import java.util.ArrayList;
import java.util.HashMap;

import biblioteca.*;
import biblioteca.view.*;

public class Model {
	private HashMap<String,Bibliotecario> bibliotecarios = new HashMap<String, Bibliotecario>();
	private HashMap<String,Aluno> usuarios = new HashMap<String, Aluno>();
	private Pessoa usuarioAutenticado;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void notifica() {
		for (Observer o : observers) {
			o.update();
		}
	}
	
	public Pessoa getUsuario(int id) {
		if(id!=0) {
			Pessoa usuario = bibliotecarios.get(id);
			return usuario;
		}
		
		return null;
	}
	
	public void setUsuario(Bibliotecario usuario) {
		if(usuario.getSenha() != null && usuario.getId()!= 0) {
			bibliotecarios.put(Long.toString(usuario.getId()), usuario);
		}
	}
	
	public Pessoa autenticarUsuario(String id, String senha) {
		Pessoa usuario;
		if(id != null && senha != null) {
			usuario = bibliotecarios.get(id);
			if(usuario != null) {
				if(id.equals(usuario.getId()) && senha.equals(usuario.getSenha())) {
					usuarioAutenticado = usuario;
				}
			}
		}
		return usuarioAutenticado;
	}
	
	public void deslogarUsuario() {
		usuarioAutenticado = null;
		notifica();
	}
	
	public Pessoa getgetUsuarioAutenticado() {
		return usuarioAutenticado;
	}
	
	public void attachObserver(Observer observer) {
		if(observer != null) {
			observers.add(observer);
		}
	}
	
	public void detachObserver(Observer observer) {
		if(observer != null) {
			observers.remove(observer);
		}
	}
	
}
