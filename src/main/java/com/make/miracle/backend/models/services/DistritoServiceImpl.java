package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.dao.IDistritoDao;
import com.make.miracle.backend.models.entity.Distrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoServiceImpl implements IDistritoService{

    @Autowired
    IDistritoDao iDistritoDao;

    @Override
    public List<Distrito> findAll() {
        return (List<Distrito>) iDistritoDao.findAll();
    }

    @Override
    public Distrito save(Distrito distrito) {
        return iDistritoDao.save(distrito);
    }
}
