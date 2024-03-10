package com.qr.SistemasQr.Controlador;

import com.qr.SistemasQr.Entidades.Constancia;
import com.qr.SistemasQr.Entidades.Estudiante;
import com.qr.SistemasQr.Repositorios.ConstanciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/constancia")
@RestController
@Controller
@Service
@CrossOrigin(origins = "http://localhost:4200")
public class ConstanciaControlador {
    @Autowired
    private ConstanciaRepositorio constanciaRepositorio;

    @GetMapping(value = "/{idConstancia}")
    public Constancia findByNoCuenta(@PathVariable(value = "idConstancia")int idConstancia) {
        return constanciaRepositorio.findByIdConstancia(idConstancia);
    }

    @PostMapping(
            value = "/addC",
            consumes = "application/json"
    )
    public void addConstancia(@RequestBody Constancia constancia) {
        constanciaRepositorio.save(constancia);
        System.out.println("constancia = " + constancia);
    }

}
