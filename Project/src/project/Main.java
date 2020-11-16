/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import FacadePattern.*;
/**
 *
 * @author Rizal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }  
    
    public static void Detail(){
            Persegi3 persegi = new Persegi3();
            PersegiPanjang3 persegiP = new PersegiPanjang3();

            System.out.println("\n========= Persegi : ");
            persegi.ketentuan();
            persegi.Luas();
            persegi.Keliling();
            persegi.Diagonal();

            System.out.println("\n========= Persegi Panjang : ");
            persegiP.ketentuan();
            persegiP.Luas();
            persegiP.Keliling();
            persegiP.Diagonal();
        }
}
