package com.springBoot.app.models.services;

import java.util.List;

import com.springBoot.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
}
