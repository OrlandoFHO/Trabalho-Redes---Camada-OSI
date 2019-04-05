/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaosi;

/**
 *
 * @author Sistemas
 */
public class Enlace implements Rede {  
    protected String valor;
    private String Dado;
    
    protected Enlace(){
        valor = "1234";
    }
    protected Enlace(String nome){
        valor = Dado;
    }
    
    public String getDado(){
        return valor;
    }
    
    public String setDado(){
        return Dado;
        
    }
}  
