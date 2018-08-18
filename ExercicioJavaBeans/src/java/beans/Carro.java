/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author professor
 */
public class Carro {
    private String placa;
    private String nome;
    private String marca;
    private String modelo;
    private String preco;
    private float valorDiaria;
    private int diasLocados;
    private boolean situacao;

    public Carro() 
    {
        situacao = false;
    }

    public Carro(String placa, String nome, String marca, String modelo, String preco, float valorDiaria) {
        this.placa = placa;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.valorDiaria = valorDiaria;
        this.situacao = false;
    }

    public float calcularMulta(int diasReais)
    {
        float multa = 0;
        if(diasReais > diasLocados)
        {
            multa = (0.07f * valorDiaria) * (diasReais - diasLocados);
        }
        
        return multa;
    }
    
    public float calcularValorTotal(int diasReais)
    {
        return (diasLocados * valorDiaria) + calcularMulta(diasReais);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getDiasLocados() {
        return diasLocados;
    }

    public void setDiasLocados(int diasLocados) {
        this.diasLocados = diasLocados;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
        
    
}
