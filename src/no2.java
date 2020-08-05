
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herda
 */
public class no2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int totaldetik,detiksekarang,totalmenit; 
        int menitsekarang,totaljam,jamsekarang;
        
        
        System.out.print("total detik : " );
        totaldetik = input.nextInt();   
        
        detiksekarang = totaldetik % 60;
        totalmenit = totaldetik / 60;
        menitsekarang = totalmenit % 60;
        totaljam = totalmenit / 60;
        jamsekarang = totaljam % 24 ;
        
        System.out.println(jamsekarang+" : "+menitsekarang+" : "+detiksekarang);
       
        
       
        
    }
}
