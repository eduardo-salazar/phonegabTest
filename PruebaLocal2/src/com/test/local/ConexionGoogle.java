
package com.test.local;


import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;


public class ConexionGoogle {
	private static Logger logger = Logger.getLogger(ConexionGoogle.class.getName());
	
	public List<Contacto> getContactos()
	{
		logger.info("Obteniendo Contactos");
		List<Contacto> result=null;
		EntityManager mgr=EMF.get().createEntityManager();
		try
		{
			TypedQuery<Contacto> q = mgr.createQuery("SELECT x from Contacto x ",Contacto.class);
			result=q.getResultList();
			for(Contacto a:result)
			{
				System.out.println(a.getNombre()+" "+a.getApellido()+" "+a.getEmail());
			}
		}finally{
			mgr.close();
		}
		logger.info("Saliendo");
		return result;
	}
}
