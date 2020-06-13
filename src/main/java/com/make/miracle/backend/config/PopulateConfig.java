package com.make.miracle.backend.config;

import com.make.miracle.backend.models.entity.Distrito;
import com.make.miracle.backend.models.entity.Estudiante;
import com.make.miracle.backend.models.services.IDistritoService;
import com.make.miracle.backend.models.services.IEstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Date;

@Configuration
public class PopulateConfig {

    @Autowired
    IEstudianteServices estudianteServices;

    @Autowired
    IDistritoService distritoService;

    @PostConstruct
    public void init(){
        Distrito distrito1 = null, distrito2 = null, distrito3 = null;

        if(estudianteServices.findAllDistrito().isEmpty()){
            Distrito distrito = new Distrito();
            distrito.setNombre("San borja");
            distrito1 = distritoService.save(distrito);

            distrito = new Distrito();
            distrito.setNombre("San Juan de Lurigancho");
            distrito2 = distritoService.save(distrito);

            distrito = new Distrito();
            distrito.setNombre("La Victoria");
            distrito3 = distritoService.save(distrito);
        }

        if (estudianteServices.findAll().isEmpty()){
            Estudiante estudiante = new Estudiante();
            estudiante.setDni("47218688");
            estudiante.setNombre("jasson kevin");
            estudiante.setApellido("caceres villar");
            estudiante.setSexo("M");
            estudiante.setFechaNac(new Date());
            estudiante.setDistrito(distrito1);
            estudiante.setDireccion("AV las flores 123");
            estudiante.setTelefono("123456789");
            estudiante.setCorreo("jasson@gmail.com");
            estudianteServices.save(estudiante);

            estudiante = new Estudiante();
            estudiante.setDni("78658734");
            estudiante.setNombre("Santiago");
            estudiante.setApellido("Lopez Oropeza");
            estudiante.setSexo("M");
            estudiante.setFechaNac(new Date());
            estudiante.setDistrito(distrito2);
            estudiante.setDireccion("AV las Orquideas 123");
            estudiante.setTelefono("123456789");
            estudiante.setCorreo("Santiago@gmail.com");
            estudianteServices.save(estudiante);

            estudiante = new Estudiante();
            estudiante.setDni("89093412");
            estudiante.setNombre("Simon");
            estudiante.setApellido("Gomez Acero");
            estudiante.setSexo("M");
            estudiante.setFechaNac(new Date());
            estudiante.setDistrito(distrito3);
            estudiante.setDireccion("AV Bayovar 123");
            estudiante.setTelefono("123456789");
            estudiante.setCorreo("Simonn@gmail.com");
            estudianteServices.save(estudiante);
        }
    }
}
