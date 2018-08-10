package com.Lucas.ManyToManyCocina.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoReceting extends CrudRepository<Receting,Long> {

}
