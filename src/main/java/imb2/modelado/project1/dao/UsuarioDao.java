package imb2.modelado.project1.dao;

import java.util.List;

import imb2.modelado.project1.entity.UsuarioEntity;
import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	List<UsuarioEntity> obtenerUsuarios();
}
