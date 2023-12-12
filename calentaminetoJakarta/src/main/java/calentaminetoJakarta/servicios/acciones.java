package calentaminetoJakarta.servicios;

import java.util.List;

import calentaminetoJakarta.dao.entidadDos;
import calentaminetoJakarta.dao.entidadUno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class acciones {

	public acciones() {
		super();
	}
	
	public void insertarEntidad(Object o,EntityManager em) {
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
	}
	public void borrarEntidad(Object o,EntityManager em) {
		em.getTransaction().begin();
		em.remove(o);
		em.getTransaction().commit();
	}
	public void actualizarEntidad(Object o,EntityManager em) {
		em.getTransaction().begin();
		em.merge(o);
		em.getTransaction().commit();
	}
	
	public List<entidadDos> leerDatosConUnCampoEntidadDos(String query,EntityManager em,String parametroSinPuntos,Object valorParametro){
		TypedQuery<entidadDos> consulta=em.createQuery(query,entidadDos.class);
		consulta.setParameter(parametroSinPuntos, valorParametro);
		return consulta.getResultList();
	}
}
