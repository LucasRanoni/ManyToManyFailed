package com.Lucas.ManyToManyCocina.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoReceta extends CrudRepository<Receta,Long> {

}
