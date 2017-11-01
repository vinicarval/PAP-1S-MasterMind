/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.iniciante;

import br.mastermindpap.abstrato.comparacao.Comparacao;

import java.util.List;
import javax.swing.JLabel;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import br.mastermindpap.interfaces.IAtribuicao;

/**
 *
 * @author icaro
 */
public class AtribuicaoIniciante extends Comparacao implements IAtribuicao {

    public static final ImageIcon IMG_ROSA;
    public static final ImageIcon IMG_VERMELHA;
    public static final ImageIcon IMG_AZUL;
    public static final ImageIcon IMG_VERDE;
    public static final ImageIcon IMG_LARANJA;
    public static final ImageIcon IMG_AMARELO;
    public static final ImageIcon IMG_MARROM;
    public static final ImageIcon IMG_ROXO;
    public static final ImageIcon IMG_VERDE_CLARO;
    public static final ImageIcon IMG_VERMELHO_ESCURO;

    static {
        IMG_ROSA = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circulorosa.png"));
        IMG_VERMELHA = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circulovermelho.png"));
        IMG_AZUL = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circuloazul.png"));
        IMG_VERDE = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circuloverde.png"));
        IMG_LARANJA = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circulolaranja.png"));
        IMG_AMARELO = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circuloamarelo.png"));
        IMG_MARROM = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circulomarrom.png"));
        IMG_ROXO = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circuloroxo.png"));
        IMG_VERDE_CLARO = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circuloverdeclaro.png"));
        IMG_VERMELHO_ESCURO = new ImageIcon(AtribuicaoIniciante.class.getResource("/br/mastermindpap/imagens/circulovermelhoescuro.png"));
    }

    public AtribuicaoIniciante() {
        super();

    }

    @Override
    public void definirCorLabelUsuario(JLabel label) {
        //atribui cores nas labels do usuario

        if (label.getIcon().equals(Comparacao.IMG_INICIAL)) {

            label.setIcon(AtribuicaoIniciante.IMG_ROSA);

        } else if (label.getIcon().equals(AtribuicaoIniciante.IMG_ROSA)) {
            label.setIcon(AtribuicaoIniciante.IMG_VERMELHA);

        } else if (label.getIcon().equals(AtribuicaoIniciante.IMG_VERMELHA)) {
            label.setIcon(AtribuicaoIniciante.IMG_AZUL);

        } else if (label.getIcon().equals(AtribuicaoIniciante.IMG_AZUL)) {
            label.setIcon(AtribuicaoIniciante.IMG_VERDE);

        } else {
            label.setIcon(AtribuicaoIniciante.IMG_ROSA);
        }
    }

    @Override
    public List criarLista() {
        String[] vetor = new String[4];
        for (int cont = 0; cont < vetor.length; cont++) {
            vetor[cont] = String.valueOf(cont);

        }

        List lista;
        lista = Arrays.asList(vetor);

        Collections.shuffle(lista);
        return lista;
    }

    @Override
    public void criarSeqAleatoria() {

        int cont = 0;
        String[] listavet;
        listavet = (String[]) criarLista().toArray();
        JLabel[] lab;
        lab = super.getLabelsresposta();

        while (cont < lab.length) {

            switch (listavet[cont]) {
                case "0":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_ROSA);
                    break;
                case "1":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_VERMELHA);
                    break;
                case "2":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_AZUL);
                    break;
                case "3":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_VERDE);
                    break;
                case "4":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_LARANJA);
                    break;
                case "5":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_AMARELO);
                    break;
                case "6":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_MARROM);
                    break;
                case "7":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_ROXO);
                    break;
                case "8":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_VERDE_CLARO);
                    break;
                case "9":
                    lab[cont].setIcon(AtribuicaoIniciante.IMG_VERMELHO_ESCURO);
                    break;
            }
            cont++;
        }

    }
}
