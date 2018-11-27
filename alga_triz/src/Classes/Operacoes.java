/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author rodri
 */
public class Operacoes {
    
    
    
    	public int[][] Somar(int a[][],int b[][]) {
		
		int resultado[][]= null;
		int aLinha=0,aColuna=0;
		
		if(a.length>0) {
			aLinha=a.length;
		}
		if(a[0].length>0) {
			aColuna=a[0].length;
		}
		if(a.length==b.length&&a[0].length==b[0].length) {
                    resultado=new int[aLinha][aColuna];
                    
			for (int i = 0; i < aLinha; i++) {
				for (int j = 0; j < aColuna; j++) {
					resultado[i][j]=(a[i][j]+b[i][j]);
				}
			}
		}
		
		
		
		return resultado;
		
	}
        
        
        
        
}
