package com.springBoot.app.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.app.models.dao.IClienteDao;
import com.springBoot.app.models.entity.Cliente;

/*implementacion de la clase IClienteService y la crea
 * como un componente gracias a la anotacio service*/
@Service
public class ClienteServiceImplement implements IClienteService{

	/*inyectamos el cliente dao y hacemos el cableado a la clase*/
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

}
