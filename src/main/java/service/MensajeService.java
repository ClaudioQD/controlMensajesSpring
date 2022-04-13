package service;

import java.util.List;

import Model.Mensaje;

public interface MensajeService {

	List<Mensaje> obternerListaMensaje();
	
	void guardarMensaje(Mensaje mensaje);
	
}
