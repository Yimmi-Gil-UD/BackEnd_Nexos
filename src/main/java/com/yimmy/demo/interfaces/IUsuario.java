package com.yimmy.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.yimmy.demo.entity.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario,Integer>{

}
