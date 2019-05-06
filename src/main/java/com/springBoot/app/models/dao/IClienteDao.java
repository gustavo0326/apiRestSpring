package com.springBoot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.app.models.entity.Cliente;

/*extiende de una clase generica que tiene todos los cruds. 
 * solo le damos el nombre de la clase entity y el tipo de dato de la
 * llave privaria*/
public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
