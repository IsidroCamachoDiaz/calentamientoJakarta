package calentaminetoJakarta.controladores;


import java.util.List;

import calentaminetoJakarta.dao.entidadDos;
import calentaminetoJakarta.dao.entidadUno;
import calentaminetoJakarta.servicios.acciones;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class inicio {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em =emf.createEntityManager();
		
		entidadDos e1= new entidadDos(0,"jdfheru");
		acciones a= new acciones();
		List <entidadDos> listaDos=a.leerDatosConUnCampoEntidadDos("SELECT d FROM entidadDos d WHERE d.id_entidad_dos=:e", em, "e", 1);
		for(int i=0;i<listaDos.size();i++) {
			System.out.println(listaDos.get(i).toString());
		}
		em.close();
	}

}
