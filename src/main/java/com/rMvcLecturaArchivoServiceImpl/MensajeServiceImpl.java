package com.rMvcLecturaArchivoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Mensaje;
import service.MensajeService;


@Service("mensajeService")
public class MensajeServiceImpl implements MensajeService {
	
	@Autowired
	private Mensaje mensaje;
	
	private List<Mensaje> listaMensajes;	
	
	
	@Override
	public List<Mensaje> obternerListaMensaje() {
		// TODO Auto-generated method stub
		return listaMensajes;
	}

	@Override
	public void guardarMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		listaMensajes.add(mensaje);

	}

}
