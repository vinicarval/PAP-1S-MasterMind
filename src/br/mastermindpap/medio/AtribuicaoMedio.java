/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.medio;

import br.mastermindpap.facil.AtribuicaoFacil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author icaro
 */
public class AtribuicaoMedio extends AtribuicaoFacil {

    public AtribuicaoMedio() {
        super();

    }

    @Override
    public void definirCorLabelUsuario(JLabel label) {
        String label1;
        label1 = label.getIcon().toString();

        super.definirCorLabelUsuario(label);
        if (label1.equals(AtribuicaoFacil.IMG_AMARELO.toString())) {
            label.setIcon(AtribuicaoFacil.IMG_MARROM);
        } else if (label1.equals(AtribuicaoFacil.IMG_MARROM.toString())) {
            label.setIcon(AtribuicaoFacil.IMG_ROXO);
        } else if (label1.equals(AtribuicaoFacil.IMG_ROXO.toString())) {
            label.setIcon(AtribuicaoFacil.IMG_ROSA);
        }

    }

    @Override
    public List criarLista() {
        String[] vetor = new String[8];
        for (int cont = 0; cont < vetor.length; cont++) {
            vetor[cont] = String.valueOf(cont);

        }

        List lista;
        lista = Arrays.asList(vetor);

        Collections.shuffle(lista);
        return lista;
    }

}
