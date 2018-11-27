/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Operacoes {

    public int[][] Somar(int a[][], int b[][]) {

        int resultado[][] = null;
        int aLinha = 0, aColuna = 0;

        if (a.length > 0) {
            aLinha = a.length;
        }
        if (a[0].length > 0) {
            aColuna = a[0].length;
        }

        resultado = new int[aLinha][aColuna];

        for (int i = 0; i < aLinha; i++) {
            for (int j = 0; j < aColuna; j++) {
                resultado[i][j] = (a[i][j] + b[i][j]);
            }
        }

        return resultado;

    }

    public int[][] Multiplicar(int a[][], int b[][]) {

        int resultado[][] = null;
        int soma=0;
        List<Integer>n=new ArrayList();
        
        int aLinha = 0, aColuna = 0,bLinha=0,bColuna=0;

        if (a.length > 0) {
            aLinha = a.length;
        }
        if (a[0].length > 0) {
            aColuna = a[0].length;
        }if (b.length > 0) {
            bLinha = b.length;
        }
        if (b[0].length > 0) {
            bColuna = b[0].length;
        }
        resultado=new int[aLinha][bColuna];
        
        for (int i = 0; i < aLinha; i++) {
            for (int j = 0; j < bColuna; j++) {
                for (int k = 0; k < bLinha; k++) {
                    soma+=a[i][k]*b[k][j];
                }
                resultado[i][j]=soma;
                soma=0;
                
            }
                
            
        }
        

        return resultado;

    }

}
