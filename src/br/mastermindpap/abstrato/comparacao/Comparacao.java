/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.abstrato.comparacao;

import br.mastermindpap.classe.visual.Visual;
import javax.swing.JLabel;
import br.mastermindpap.interfaces.IComparacao;
import javax.swing.ImageIcon;
import br.mastermindpap.telas.NivelImpossivel;
/**
 *
 * @author icaro
 */
public abstract class Comparacao implements IComparacao{ 
   Visual visual=new Visual();
  
    private JLabel[] labeldicas;
    private JLabel[] labelusuario;
    private JLabel[] labelsresposta;
    public static final  ImageIcon IMG_INICIAL;
    public static final  ImageIcon IMG_BRA_PEQ;
    public static final  ImageIcon IMG_PRETO_PEQ;
    
     static{
        IMG_INICIAL= new ImageIcon(Comparacao.class.getResource("/br/mastermindpap/imagens/circulobranco.png"));
        IMG_BRA_PEQ= new ImageIcon(Comparacao.class.getResource("/br/mastermindpap/imagens/circulobrapeq.png"));
        IMG_PRETO_PEQ= new ImageIcon(Comparacao.class.getResource("/br/mastermindpap/imagens/circulopretopeq.png"));
    }
    
   
   
    public Comparacao () {
     
     
     
    }
    
      
   public void setLabelsresposta(JLabel[] labelsresposta) {
        this.labelsresposta = labelsresposta;
    }
   public JLabel[] getLabelsresposta() {
         return this.labelsresposta;
    }
  public void setLabelUsuario(JLabel[] labelusuario){
  this.labelusuario=labelusuario;
  
  
  }
  
   public void setLabelDicas(JLabel []labeldicas){
 
   this.labeldicas=labeldicas;  
  }
 
   @Override
       public boolean isValido(){
 //Verifica se o usuario escolheu uma cor em todas as labels
           int cont=0;
          
           int valido=0;
      
       while (cont<this.labelusuario.length){
       if (!this.labelusuario[cont].getIcon().toString().equals(Comparacao.IMG_INICIAL.toString())){
        valido++;
        
       }
     
       cont++;
       }
      
       return valido==cont;
        
       }
      
       
      
       public String[]verificarRep(){
            String[]lab=new String[this.labelusuario.length];//={labelusuario[0].getIcon().toString(),labelusuario[1].getIcon().toString(),labelusuario[2].getIcon().toString(),labelusuario[3].getIcon().toString()};
           for(int contador=0;contador<this.labelusuario.length;contador++){
    lab[contador]=this.labelusuario[contador].getIcon().toString();
           }
      for(int cont=0;cont<lab.length;cont++){
              for(int cont1=0;cont1<lab.length;cont1++){
           
           if(cont==cont1){
            continue;
           }
           if(lab[cont].equals(lab[cont1])){
           lab[cont1]=String.valueOf(cont1);
           
           }
           
       }
       }
           return lab;
       }
   @Override
       public boolean isVencedor(){
     //Verifica se o usuario acertou a posiçao de todas as cores
           int cont=0;
           int vencedor=0;
           while(cont<this.labeldicas.length){
   if(this.labeldicas[cont].getIcon().equals(Comparacao.IMG_PRETO_PEQ) ){
       vencedor++;
        
    }
   
   cont++;
           }
         return cont==vencedor;
    }
   
   @Override
   public int[] compararMesmaPosicao(){
int[] interseccao;
   interseccao=new int[this.labelusuario.length]; 
    int indice=0;
    for(int cont=0;cont<this.labelusuario.length;cont++)
  {
   String vetusuario=this.labelusuario[cont].getIcon().toString();
 
   for( int cont2=0;cont2<this.labelsresposta.length;cont2++)
   {
          String resposta=this.labelsresposta[cont2].getIcon().toString();
   
    if(resposta.equals(vetusuario) && cont==cont2)
    {
   interseccao[indice]=2;
   indice++;
    }


}
   
  }

return interseccao;
}

   @Override
   public int[] compararOutraPosicao(){

int[] interseccaobranco;
   interseccaobranco=new int[10000000]; //tamanho do vetor grande o suficiente para garantir que não ocorra index out of bounds
    int indice=0;
    String[] verep=verificarRep();
       for (int cont=0;cont<this.labelusuario.length;cont++) {
           String vetusuario =verep[cont];
    for (JLabel labelsresposta1 : this.labelsresposta) {
        String resposta = labelsresposta1.getIcon().toString();
        if(resposta.equals(vetusuario))
        {
            interseccaobranco[indice]=1;
            indice++;
        }
    }
 }

return interseccaobranco;
}
   @Override
   public void mostrarResposta(){
int indice=0;

int[] interseccao;
interseccao = compararMesmaPosicao();
int[] interseccaobranco=compararOutraPosicao();

       for (JLabel labelsresposta1 : this.labelsresposta) {
           if (interseccao[indice]==2)
           {
               this.labeldicas[indice].setIcon(Comparacao.IMG_PRETO_PEQ);
               
           }
           else  if (interseccaobranco[indice]==1)
           {
               this.labeldicas[indice].setIcon(Comparacao.IMG_BRA_PEQ);
               
           }
           indice++;
       }

}


}



