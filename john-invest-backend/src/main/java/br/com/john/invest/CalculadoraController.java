package br.com.john.invest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calcular")
@CrossOrigin(origins = "*")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @PostMapping
    public List<CalculoResponse> calcular(@RequestBody CalculoRequest request) {
        return service.calcular(request);
    }
}
