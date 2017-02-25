/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.impossivel;
import br.mastermindpap.dificil.AtribuicaoDificil;
import java.util.Random;
import javax.swing.JLabel;
/**
 *
 * @author icaro
 */
public class AtribuicaoImpossivel extends AtribuicaoDificil{
     Random aleat=new Random();
    public AtribuicaoImpossivel(){
    super();
    
    }
   public int[] gerarNumerosImpossivel(){
  //gerador de numeros para o nivel impossivel  
       int[]vet;
              vet=new int[10];  
    for (int cont=0;cont<10;cont++){
   vet[cont] = this.aleat.nextInt(10);
    }
    return vet;
    }
    @Override
     public void criarSeqAleatoria()
     {
       int[] vetor=gerarNumerosImpossivel();
          int cont=0;
            
          JLabel[] labels=super.getLabelsresposta();
         
         while(cont<labels.length){ 
             switch (vetor[cont]) {
                 case 0:
                     labels[cont].setIcon(AtribuicaoDificil.IMG_ROSA);
                     break;
                 case 1:
                     labels[cont].setIcon(AtribuicaoDificil.IMG_VERMELHA);
                     break;
                 case 2:
                     labels[cont].setIcon(AtribuicaoDificil.IMG_AZUL);
                     break;
                 case 3:
                     labels[cont].setIcon(AtribuicaoDificil.IMG_VERDE);
                     break;
                 case 4:
                     labels[cont].setIcon(AtribuicaoDificil.IMG_LARANJA);
                     break;
                 case 5:
                     labels[cont].setIcon(AtribuicaoDificil.IMG_AMARELO);
                     break;
                  case 6:
                  labels[cont].setIcon(AtribuicaoDificil.IMG_MARROM);
                  break;
                  case 7:
                  labels[cont].setIcon(AtribuicaoDificil.IMG_ROXO);
                  break;  
                  case 8:
                  labels[cont].setIcon(AtribuicaoDificil.IMG_VERDE_CLARO);
                  break;  
                  case 9:
                  labels[cont].setIcon(AtribuicaoDificil.IMG_VERMELHO_ESCURO);
                  break;       
             }
         cont++;
         }
      
}
    
}
