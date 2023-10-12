package com.mx.im.dao;
import com.mx.im.domain.Persona;
import org.springframework.data.repository.CrudRepository;



public interface PersonaDao  extends CrudRepository<Persona,Long> {

}
