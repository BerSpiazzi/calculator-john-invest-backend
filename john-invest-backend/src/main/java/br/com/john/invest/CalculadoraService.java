package br.com.john.invest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public List<CalculoResponse> calcular(CalculoRequest request) {
        List<CalculoResponse> resultados = new ArrayList<>();
        double montante = request.getValorInicial();
        double taxa = request.getTaxaJuros() / 100.0;
        int tempo = request.getTempo();
        double aporte = request.getAporteMensal();

        for (int i = 1; i <= tempo; i++) {
            montante = (montante + aporte) * (1 + taxa);
            resultados.add(new CalculoResponse(i, montante));
        }

        return resultados;
    }
}
