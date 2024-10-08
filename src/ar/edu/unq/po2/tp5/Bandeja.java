package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Bandeja {
	ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public Bandeja(ArrayList<Correo> inbox, ArrayList<Correo> borrados) {
		this.inbox = inbox;
		this.borrados = borrados;
	}
	public void agregarCorreo(Correo correo) {
        this.inbox.add(correo);
    }
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
}
