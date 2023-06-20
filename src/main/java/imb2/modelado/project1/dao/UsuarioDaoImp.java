package imb2.modelado.project1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import imb2.modelado.project1.entity.UsuarioEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<UsuarioEntity> obtenerUsuarios() {
		
		String query = "from UsuarioEntity";
		
		return entityManager.createQuery(query).getResultList();
	
	}
	
}
