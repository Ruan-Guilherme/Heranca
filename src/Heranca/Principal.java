/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("NNJH-9009");
        carro.setNumPortas(4);
        carro.setCor("Vermelho");
        carro.setNumRodas(4);
        carro.setCapacidade(4);
        
        
        moto.setNumPlaca("KNID-1442");
        moto.setNumPortas(0);
        moto.setCor("Azul");
        moto.setNumRodas(2);
        moto.setCapacidade(2);
        
        carro.ImprimirDados();
        moto.ImprimirDados();
    }
    
}
