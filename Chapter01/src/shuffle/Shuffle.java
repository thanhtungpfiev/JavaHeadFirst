/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffle;

/**
 * @author thanhtung
 * @date Oct 6, 2016
 */
public class Shuffle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 3;
        if (x > 2) {
            System.out.print("a");
        }

        x = x - 1;
        System.out.print("-");
        while (x > 0) {
            if (x == 2) {
                System.out.print("b c");
            }

            x = x - 1;
            System.out.print("-");
            
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
        
        System.out.println("");
    }

}
