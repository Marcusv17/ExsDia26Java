package com.mycompany.hipotenusa;

import javax.swing.JOptionPane;

public class Hipotenusa {

    public static void main(String[] args) {
        
         {
        int a, b;
        
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        
        double hipotenusa = (a*a) + (b*b);
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa desse triângulo é: " + hipotenusa + ".");
   
         }
    }
}
    
       
    

