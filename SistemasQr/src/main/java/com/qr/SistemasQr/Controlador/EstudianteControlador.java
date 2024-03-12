package com.qr.SistemasQr.Controlador;

import com.qr.SistemasQr.Entidades.Constancia;
import com.qr.SistemasQr.Entidades.Estudiante;
import com.qr.SistemasQr.Repositorios.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequestMapping(value = "/estudiante")
@RestController
@Controller
@Service
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteControlador {
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @GetMapping("/{noCuenta}")
    public Estudiante findByNoCuenta(@PathVariable(value = "noCuenta")int noCuenta) {
        return estudianteRepositorio.findByNoCuenta(noCuenta);
    }

    @GetMapping("/all")
    public List<Estudiante> findAll(){
        return estudianteRepositorio.findAll();
    }

    @PostMapping(
            value = "/addE",
            consumes = "application/json"
    )
    public void addEstudiante(@RequestBody Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        System.out.println("estudiante = " + estudiante);
    }

}
