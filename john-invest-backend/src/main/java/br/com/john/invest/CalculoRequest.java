package br.com.john.invest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculoRequest {

    private double valorInicial;

    private double aporteMensal;

    private double taxaJuros;

    private int tempo;

}
