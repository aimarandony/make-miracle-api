package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.entity.Distrito;

import java.util.List;

public interface IDistritoService {
    public List<Distrito> findAll();
    public  Distrito save(Distrito distrito);
}
