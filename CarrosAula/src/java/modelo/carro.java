/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Maurício
 */
public class carro {
    private String marca,modelo;
    private int ano;
    private double preco;

    public carro() {
    }

    public carro(String marca, String modelo, int ano, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preço;
    }
    
    
    
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
