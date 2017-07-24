/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunique;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class FirstUnique {

    /**
     * @param args the command line arguments
     */
    public static char string[];

    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("Enter String");

        string = txt.toCharArray();

        String u = "No unique letters";

            for (int i = 0; i < string.length; i++) {
                
                boolean check = false;
                
                for (int j = 0; j < string.length; j++) {

                    if(string[i]==string[j]&&i!=j){
                        check = true;
                        break;
                    }
                }
                
                if(check==false){
                    u = Character.toString(string[i]);
                    break;
                }
            }
            
        JOptionPane.showMessageDialog(null, "The first unique letter is: " + u);

    }

}