/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.classe.visual;


import javax.swing.JOptionPane;

/**
 *
 * @author icaro
 */
public class Visual{  
    
    public void erro() {
    String erro="Escolha todas as cores";

 JOptionPane.showMessageDialog(null,erro,"ERRO",JOptionPane.ERROR_MESSAGE);
}

public void vencer(){
    
JOptionPane.showMessageDialog(null, "Vencedor");

}

public void perder(){
JOptionPane.showMessageDialog(null, "Fim de jogo!");
}


    
   
    
     
}
