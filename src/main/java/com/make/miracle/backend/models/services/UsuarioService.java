package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.dao.IUsuarioDao;
import com.make.miracle.backend.models.entity.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

//EN ESTA CLASE IMPLEMENTAREMOS LA INTERFAZ USURIO
// Y UN CLASE DE SPRING SECURITY LLAMADA UserDetailsService

@Service
public class UsuarioService  implements IUsuarioService {

//  importante el Looger debe ser de la libreria Slf4j y pondremos en getlogger  la clase raiz

    private Logger logger= LoggerFactory.getLogger(UsuarioService.class);

//    injectamos
    @Autowired
    private IUsuarioDao usuarioDao;


    //aqui solamente pondremos el metodo del Dao
    //que es buscar por usuario
    @Override
    @Transactional(readOnly = true)
    public Usuario findByUsername(String username) {
        return usuarioDao.findByUsername(username);
    }

}
