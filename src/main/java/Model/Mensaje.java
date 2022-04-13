package Model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("mensaje")
public class Mensaje {

	private String title;
	private String mensaje;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
		
	
}
