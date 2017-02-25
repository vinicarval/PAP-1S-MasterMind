/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mastermindpap.interfaces;

/**
 *
 * @author icaro
 */
public interface IComparacao {
    public boolean isVencedor();
    public boolean isValido();
    public int[] compararMesmaPosicao();
    public int[]compararOutraPosicao();
    public void mostrarResposta();
}
