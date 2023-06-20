package imb2.modelado.project1.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imb2.modelado.project1.dao.UsuarioDao;
import imb2.modelado.project1.entity.UsuarioEntity;

@RestController
public class UserController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	/*
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola";
	}
	
	@RequestMapping(value="usuarios")
	public List<String> mostrarUsuarios(){
		return List.of("Juan", "Rama", "Nano");
	}
	
	@RequestMapping(value="personas")
	public UsuarioEntity listarUsuarios() {
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setNombre("Facundo");
		usuario.setApellido("Egarrat");
		usuario.setEmail("egarratfacundo@gmail.com");
		usuario.setTelefono("2616099986");
		
		return usuario;
	}
	*/
	
	@RequestMapping(value="personas/{id}")
	public UsuarioEntity getUsuarioEntity(@PathVariable Long id) {
		
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setId(id);
		usuario.setNombre("Facundo");
		usuario.setApellido("Egarrat");
		usuario.setEmail("egarratfacundo@gmail.com");
		usuario.setTelefono("2616099986");
		
		return usuario;
	}
	
	@RequestMapping(value="personas/lista_usuarios")
	public List<UsuarioEntity> listar_variosUsuarios() {
		
		List<UsuarioEntity> usuarios = new ArrayList<>();
		
		UsuarioEntity usuario1 = new UsuarioEntity();
		usuario1.setId(3L);
		usuario1.setNombre("Facundo");
		usuario1.setApellido("Egarrat");
		usuario1.setEmail("egarratfacundo@gmail.com");
		usuario1.setTelefono("2616099986");
		
		UsuarioEntity usuario2 = new UsuarioEntity();
		usuario2.setId(4L);
		usuario2.setNombre("Facundo");
		usuario2.setApellido("Espindola");
		usuario2.setEmail("egarratfacundo@gmail.com");
		usuario2.setTelefono("2616099986");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<UsuarioEntity> getUsuarioEntity(){
		
		List<UsuarioEntity> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}
	
}
