/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.facil;

import br.mastermindpap.iniciante.AtribuicaoIniciante;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author icaro
 */
public class AtribuicaoFacil extends AtribuicaoIniciante{
   
    public AtribuicaoFacil()
    {
   super();
    }
    
    @Override
    public void definirCorLabelUsuario(JLabel label){
  
   String label1;
   label1 = label.getIcon().toString();
   
       
         super.definirCorLabelUsuario(label); 
        if(label1.equals(AtribuicaoIniciante.IMG_VERDE.toString()))
        {
         label.setIcon(AtribuicaoFacil.IMG_LARANJA);
        }
         else if(label1.equals(AtribuicaoIniciante.IMG_LARANJA.toString()))
         {
     label.setIcon(AtribuicaoFacil.IMG_AMARELO);
         }
         else if(label1.equals(AtribuicaoIniciante.IMG_AMARELO.toString()))
         { 
      label.setIcon(AtribuicaoIniciante.IMG_ROSA);
         }

    }
    @Override
      public List criarLista()
     {
         String[] vetor=new String[6];
         for(int cont=0;cont<vetor.length;cont++){
         vetor[cont]=String.valueOf(cont);
         
         }
         
            List lista;
            lista=Arrays.asList(vetor);
             
            Collections.shuffle(lista);
            return lista;
     }
      
  
}
