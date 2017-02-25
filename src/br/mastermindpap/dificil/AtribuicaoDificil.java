/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.dificil;
import br.mastermindpap.medio.AtribuicaoMedio;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author icaro
 */
public class AtribuicaoDificil extends AtribuicaoMedio{
    
    public AtribuicaoDificil()
    {
    super();
    
    }  
     @Override
     public void definirCorLabelUsuario(JLabel label)
     {
     String label1;
   label1 = label.getIcon().toString();
   
       
        super.definirCorLabelUsuario(label); 
        if(label1.equals(AtribuicaoMedio.IMG_ROXO.toString()))
        {
         label.setIcon(AtribuicaoMedio.IMG_VERDE_CLARO);
        }
         else if(label1.equals(AtribuicaoMedio.IMG_VERDE_CLARO.toString()))
         {
     label.setIcon(AtribuicaoMedio.IMG_VERMELHO_ESCURO);
         }
         else if(label1.equals(AtribuicaoMedio.IMG_VERMELHO_ESCURO.toString()))
         { 
      label.setIcon(AtribuicaoMedio.IMG_ROSA);
         }
     
     }
     @Override
      public List criarLista()
     {
         String[] vetor=new String[10];
         for(int cont=0;cont<vetor.length;cont++){
         vetor[cont]=String.valueOf(cont);
         
         }
         
            List lista;
            lista=Arrays.asList(vetor);
             
            Collections.shuffle(lista);
            return lista;
     }

}
