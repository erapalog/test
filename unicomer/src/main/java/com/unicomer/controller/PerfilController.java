package com.unicomer.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unicomer.domain.Perfil;
import com.unicomer.service.IPerfilService;
import com.unicomer.utils.Response;
import com.unicomer.utils.CommonConstants;




@RestController
public class PerfilController {
	

	
	ResponseEntity<?> response = null;
	
	@Autowired
	private IPerfilService perfilServiceImp;
	
	
	@GetMapping("/getperfil")
	public ResponseEntity<?> getAllPerfiles() {
		
		try {
			List<Perfil> listaCriticidad = perfilServiceImp.findAll();
			/* Condicional para identificar si se encuentran registros en BBDD */
			if (listaCriticidad == null) {
				response = Response.getResponseBadRequest(null, CommonConstants.NO_FOUND);
			} else {
				response = Response.getResponseSuccess(listaCriticidad, CommonConstants.RESULTADO_EXITOSO);
			}
		} catch (Exception e) {
			response = Response.getResponseServerError("error " + e);
		}

		return response;
	}
	
	@GetMapping("/getperfil/{id}")
	public ResponseEntity<?> getAllIdPerfiles(@PathVariable("id") Long id) {
		
		try {
			Perfil listaCriticidad = perfilServiceImp.findRecordById(id);
			/* Condicional para identificar si se encuentran registros en BBDD */
			if (listaCriticidad == null ) {
				response = Response.getResponseBadRequest(null, CommonConstants.NO_FOUND);
			} else {
				response = Response.getResponseSuccess(listaCriticidad, CommonConstants.RESULTADO_EXITOSO);
			}
		} catch (Exception e) {
			response = Response.getResponseServerError("error " + e);
		}

		return response;
	}
	
	@PostMapping("/postperfil")
	public ResponseEntity<?> saveMedioNotif(@RequestBody Perfil perfil,  BindingResult result) {
	
		try {
			
			perfilServiceImp.save(perfil);
			response = Response.getResponseSuccess(null, CommonConstants.INSERCION_EXITOSA);

		} catch (Exception e) {
			response = Response.getResponseServerError(e.getMessage());
		}

		return response;

	}
	


}
