/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vanessalagomachado
 */
public class Veiculo {
    private String placa;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private double valor;
    private Marca marca;
    private Modelo modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return placa + "Marca: "+marca+" - Modelo: "+modelo;
    }
    
    public String exibirDados(){
        String aux = "Veiculo cadastrado:\n";
        aux += "Placa: "+placa+"\n";
        aux += "Cor: "+cor+"\n";
        aux += "Ano de Fabricação: "+anoFabricacao+"\n";
        aux += "Ano do Modelo: "+anoModelo+"\n";
        aux += "Modelo: "+modelo+"\n";
        aux += "Marca: "+marca+"\n";
        aux += "Valor: R$"+valor+"\n";

        return aux;
    }
    
}
