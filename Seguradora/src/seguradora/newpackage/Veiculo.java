/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguradora.newpackage;

/**
 *
 * @author alunolab08
 */
public class Veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    
    
     public Veiculo(int ano, String marca, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    
    
    
}
