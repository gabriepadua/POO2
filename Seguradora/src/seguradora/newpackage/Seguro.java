/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguradora.newpackage;

/**
 *
 * @author alunolab08
 */
public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente proprietario;
    private Cliente[] assegurado;

    
 
 
    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }
    
    public void setAssegurados(Cliente[] assegurado) {
        this.assegurado = assegurado;
    }
     
    public float getValor() {
        return valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public Cliente getProprietario() {
        return proprietario;
    }
   
    public Cliente[] getAssegurado() {
        return assegurado;
    }
    
   
}

