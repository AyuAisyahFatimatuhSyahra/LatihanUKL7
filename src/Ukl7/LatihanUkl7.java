/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ukl7;
/**
 *
 * @author MOKLET-1
 */
public class LatihanUkl7 {
    public static void main(String[]args){
        int matrixA[][]={{6,3},{4,8}};
        int matrixB[][]={{1},{2}};
        int matrixC[][]=new int[matrixA.length][matrixB[0].length];
        
        for (int a = 0; a < matrixA.length; a++){
            for(int b = 0; b < matrixB[0].length; b++){
                for(int c = 0; c < matrixB.length; c++){
                    matrixC[a][b] += matrixA[a][b]* matrixB[c] [b];
                }
                System.out.print(matrixC [a] [b]+" ");
                }
            System.out.println(" ");
            }
        }
        
                
}