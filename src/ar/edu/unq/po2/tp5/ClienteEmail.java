package ar.edu.unq.po2.tp5;


public class ClienteEmail {
	private IServidor servidor;
	private String nombreUsuario;
	private String passusuario;
	public ClienteEmail(IServidor servidor, String nombreUsuario, String passusuario) {
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
		this.passusuario = passusuario;
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
	
	public Bandeja gestionarBandeja() {
		return gestionarBandeja();
	}
	
}
