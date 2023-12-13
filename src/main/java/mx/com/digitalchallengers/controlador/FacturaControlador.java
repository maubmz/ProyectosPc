package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/factura")
@RestController
@Controller
@Service
public class FacturaControlador {
//    @Autowired
//    private FacturaRepositorio facturaRepositorio;
//
//    @GetMapping
//    public List<Factura> findAllFacturas() {
//        return facturaRepositorio.findAll();
//    }
}
