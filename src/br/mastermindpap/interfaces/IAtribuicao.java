/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.interfaces;

import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author icaro
 */
public interface IAtribuicao {
    public void definirCorLabelUsuario(JLabel label);
    public List criarLista();
    public void criarSeqAleatoria();
}
