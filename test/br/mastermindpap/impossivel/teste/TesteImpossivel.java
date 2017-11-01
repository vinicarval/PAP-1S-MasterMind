/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.impossivel.teste;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import br.mastermindpap.impossivel.AtribuicaoImpossivel;

/**
 *
 * @author icaro
 */
public class TesteImpossivel {

    //teste de metodo especifico do nivel impossivel
    AtribuicaoImpossivel atimp;

    @Before
    public void inicializar() {
        atimp = new AtribuicaoImpossivel();

    }

    @Test
    public void testarNivelImpossivel() {
        int cont = 0;
        int[] vet = atimp.gerarNumerosImpossivel();
        while (cont < 10) {
            if (vet[cont] >= 10) {
                fail("Falhou numero maior ou igual a 10 " + vet[cont]);
                break;
            }

            cont++;
        }

    }

}
