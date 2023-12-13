package Controlador;


import Entidades.Profesor;
import Repositorios.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/profesor")
@RestController
@Controller
@Service
public class ProfesorControlador {
    @Autowired
    private ProfesorRepositorio profesorRepositorio;

    @GetMapping
    public List<Profesor> findAllProfesor() {
        return profesorRepositorio.findAll();
    }
}
