/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap9_password_verify;

import javax.swing.JOptionPane;

/**
 *
 * @author SRonan
 */
public class Chap9_Password_Verify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("Enter your password");
        boolean lower = false, upper = false, digit = false;
        
        if(input.length() < 6)
                System.out.println("Your password is to short");
        
        for(int x = 0; x < input.length(); x++)
        {
            if(Character.isLowerCase(input.charAt(x)))
            {
                lower = true;
                
            }
        }
        for(int x = 0; x < input.length(); x++)
        {   
            if(Character.isUpperCase(input.charAt(x)))
            {
                upper = true;
            }   
        }
        for(int x = 0; x < input.length(); x++)
        {    
            if(Character.isDigit(input.charAt(x)))
            {
                digit = true;
            }   
        }
        
        if(input.length() >=6 && lower  && upper  && digit )
                    System.out.println("Valid password");
        else
            System.out.println("Invalid password");
    }
    
}
