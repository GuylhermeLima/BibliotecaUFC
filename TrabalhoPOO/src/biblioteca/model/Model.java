package biblioteca.model;

import java.util.ArrayList;
import java.util.HashMap;

import biblioteca.*;
import biblioteca.view.*;

public class Model {
	private HashMap<String,Pessoa> usuarios = new HashMap<String, Pessoa>();
	private Pessoa usuarioAutenticado;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void notifica() {
		for (Observer o : observers) {
			o.update();
		}
	}
	
	public Pessoa getUsuario(int id) {
		if(id!=0) {
			Pessoa usuario = usuarios.get(id);
			return usuario;
		}
		
		return null;
	}
	
	public void setUsuario(Pessoa usuario) {
		if(usuario != null && usuario.getId()!= 0) {
			usuarios.put(Long.toString(usuario.getId()), usuario);
		}
	}
	
	public Pessoa autenticarUsuario(String id, String senha) {
		Pessoa usuario;
		if(id != null && senha != null) {
			usuario = usuarios.get(id);
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
	
	public Pessoa getUsuarioAutenticado() {
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
	
	public int getTotalUsuarios(){
		return usuarios.size();
	}
	
	
}
