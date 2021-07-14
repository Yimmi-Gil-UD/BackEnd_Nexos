package com.yimmy.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yimmy.demo.entity.Cargo;


@Repository
public interface ICargo extends CrudRepository<Cargo,Integer> {

}
