package br.com.john.invest;

public class CalculoResponse {
    private int periodo;
    private double valorFinal;

    public CalculoResponse(int periodo, double valorFinal) {
        this.periodo = periodo;
        this.valorFinal = valorFinal;
    }

    public int getPeriodo() { return periodo; }
    public double getValorFinal() { return valorFinal; }
}
