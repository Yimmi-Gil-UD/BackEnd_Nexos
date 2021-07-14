package com.yimmy.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yimmy.demo.entity.Mercancia;

@Repository
public interface IMercancia extends CrudRepository<Mercancia,Integer>{

}
