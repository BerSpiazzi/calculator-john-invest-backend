package br.com.john.invest;

public class CalculoRequest {
    private double valorInicial;
    private double aporteMensal;
    private double taxaJuros;
    private int tempo;
    private String periodicidade;

    public double getValorInicial() { return valorInicial; }
    public void setValorInicial(double valorInicial) { this.valorInicial = valorInicial; }

    public double getAporteMensal() { return aporteMensal; }
    public void setAporteMensal(double aporteMensal) { this.aporteMensal = aporteMensal; }

    public double getTaxaJuros() { return taxaJuros; }
    public void setTaxaJuros(double taxaJuros) { this.taxaJuros = taxaJuros; }

    public int getTempo() { return tempo; }
    public void setTempo(int tempo) { this.tempo = tempo; }

    public String getPeriodicidade() { return periodicidade; }
    public void setPeriodicidade(String periodicidade) { this.periodicidade = periodicidade; }
}
