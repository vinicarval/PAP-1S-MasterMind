/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.resto.teste;

import org.junit.Test;
import static org.junit.Assert.*;
import br.mastermindpap.iniciante.AtribuicaoIniciante;
import java.util.Arrays;
import javax.swing.JLabel;
import org.junit.Before;
/**
 *
 * @author icaro
 */
public class TesteComparacaoAtribuicao {
    //testa os metodos da classe comparação e das atribuições dos varios niveis
    //Obs com exceção de um metodo da classe AtribuicaoImpossivel testando em outro arquivo todos os metodos de todas as classes sao identicos(por todos terem relação de herança; 
   
    AtribuicaoIniciante atinicio;
       @Before
       public void inicializar(){
       atinicio=new AtribuicaoIniciante();
    
     JLabel labelresp=new JLabel();
     labelresp.setIcon(AtribuicaoIniciante.IMG_VERMELHA);
     JLabel labelresp1=new JLabel();
     labelresp1.setIcon(AtribuicaoIniciante.IMG_AZUL);
     JLabel[] labelresposta={labelresp,labelresp1};
     atinicio.setLabelsresposta(labelresposta);
       }
    
        @Test
         public void testarOrdemLista(){
            //Testa se o metodo esta mudando a ordem dos numeros          
         if(Arrays.asList("0","1","2","3").equals(atinicio.criarLista())){
         fail("Falha numeros na mesma ordem");
         
         }    
         }
         @Test
         public void testarSeTemCorInicial(){
             //Verifica se o usuario  deixou a cor de alguma das labels de sua tentativa como a inicial
             JLabel label1=new JLabel();
             label1.setIcon(AtribuicaoIniciante.IMG_INICIAL);
          JLabel[] label={label1};
         atinicio.setLabelUsuario(label);
             assertEquals(false,atinicio.isValido());
         }
          @Test
         public void testarSeNaoTemCorInicial(){
              //Verifica se o usuario  mudou a cor de todas as labels de sua tentativa 
             JLabel label1=new JLabel();
             label1.setIcon(AtribuicaoIniciante.IMG_AZUL);
          JLabel[] label={label1};
         atinicio.setLabelUsuario(label);
          assertEquals(true,atinicio.isValido());
         }
    @Test
    public void testarSeVenceu(){
         //Verifica se o usuario acertou a sequencia completa
     JLabel label1=new JLabel();
     label1.setIcon(AtribuicaoIniciante.IMG_PRETO_PEQ);
     JLabel[] label={label1};
     atinicio.setLabelDicas(label);
     assertEquals(true,atinicio.isVencedor());
    
    }
     @Test
    public void testarSeNaoVenceu(){
          //Verifica se o usuario não acertou a sequencia completa
     JLabel label1=new JLabel();
     label1.setIcon(AtribuicaoIniciante.IMG_BRA_PEQ);
     JLabel[] label={label1};
     atinicio.setLabelDicas(label);
     assertEquals(false,atinicio.isVencedor());
    
    }
    @Test
    public void testarCompararMesmaPosicao()
    {
          //Verifica se  o usuario acertou a posição correta da cor na sequencia aleatoria e se  acertou colocar o numero 2 no array 
     JLabel label1=new JLabel();
     label1.setIcon(AtribuicaoIniciante.IMG_AZUL);
     JLabel[] label={label1};
     atinicio.setLabelUsuario(label);
     JLabel label2=new JLabel();
     label2.setIcon(AtribuicaoIniciante.IMG_AZUL);
     JLabel[] label3={label2};
     atinicio.setLabelsresposta(label3);
     int[]vetor=atinicio.compararMesmaPosicao();
        assertEquals(2, vetor[0]);
    }
    @Test
    public void testarCompararMesmaPosicaoCasoOutraPosicao()
    {
         //Verifica se  o usuario não acertou a posição correta da cor na sequencia aleatoria e se não acertou colocar o numero 0(padrão do java em indice de vetor de inteiros vazio) no array 
     JLabel label1=new JLabel();
     label1.setIcon(AtribuicaoIniciante.IMG_AZUL);
     JLabel[] label={label1};
     atinicio.setLabelUsuario(label);
     JLabel label2=new JLabel();
     label2.setIcon(AtribuicaoIniciante.IMG_ROSA);
     JLabel[] label3={label2};
     atinicio.setLabelsresposta(label3);
     int[]vetor=atinicio.compararMesmaPosicao();
        assertEquals(0, vetor[0]);
    }
     @Test
    public void testarCompararOutraPosicao()
    {
         //Verifica se  o usuario acertou a cor na posição incorreta na sequencia aleatoria e se  acertou colocar o numero 1 no array 
     JLabel label1=new JLabel();
     label1.setIcon(AtribuicaoIniciante.IMG_AZUL);
     JLabel[] label={label1};
     atinicio.setLabelUsuario(label);
     int[]vetor=atinicio.compararOutraPosicao();
        assertEquals(1, vetor[0]);
    }
      @Test
    public void testarOutraPosicaoCasoCorNaoExista()
    {
         //Verifica se  o usuario acertou a cor na posição incorreta na sequencia aleatoria e se não acertou colocar o numero 0 no array 
     JLabel label1=new JLabel();
     label1.setIcon(AtribuicaoIniciante.IMG_ROSA);
     JLabel[] label={label1};
     atinicio.setLabelUsuario(label);
     int[]vetor=atinicio.compararOutraPosicao();
        assertEquals(0, vetor[0]);
    }
    
    @Test
    public void testarVerificarRep(){
        //verifica se usuario repetiu cores ,se repetiu muda valor da variavel para que não ocorra varias comparaçoes da mesma cor e/ou no mesmo lugar
    JLabel label1=new JLabel();
    label1.setIcon(AtribuicaoIniciante.IMG_ROSA);
     JLabel label2=new JLabel();
    label2.setIcon(AtribuicaoIniciante.IMG_ROSA);    
    JLabel[] label={label1,label2};
    atinicio.setLabelUsuario(label);
    String[]lab=atinicio.verificarRep();
        assertEquals("1",lab[1]);
    }
    
    
    
    
    
    
    
    
}
