/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl1;

public class Latihan1 {
public static void main(String[] args){
        int sukuPertama = 3;
        int selisih = 5;  
        int jumlahSuku = 10; 
        int sukuSaatIni = sukuPertama; 
        int jumlahDeretAritmatika = 0;
        for(int i = 1; i <= jumlahSuku; i++){ 
            System.out.println("Suku ke - "+i+" adalah "+sukuSaatIni); 
        jumlahDeretAritmatika += sukuSaatIni; 
            sukuSaatIni += selisih; 
            
        }

        System.out.println("Jumlah Deret Matematika : " + jumlahDeretAritmatika); 
    }
}
