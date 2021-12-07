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
public class Automovel extends Terrestre  {
    
    private String numPlaca;
    private int numPortas;
   private String Cor;
   
   public void ImprimirDados(){
       System.out.println("----------------------------------");
       System.out.println("Placa: "+numPlaca);
       System.out.println("numero de Portas: "+numPortas);
       System.out.println("Cor: "+Cor);
       System.out.println("numero de rodas: "+numRodas);
       System.out.println("Capacidade: "+Capacidade);
        System.out.println("----------------------------------");
   }
   
   public Automovel(){
          
   }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
   
   
    
    
}
