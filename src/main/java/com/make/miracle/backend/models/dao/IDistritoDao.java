package com.make.miracle.backend.models.dao;

import com.make.miracle.backend.models.entity.Distrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IDistritoDao extends CrudRepository<Distrito, Long> {
}
