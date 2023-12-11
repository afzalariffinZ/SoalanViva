/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2;

/**
 *
 * @author sawaz
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "abc";
        String y = "";
        for(int i = 0;i<x.length();i++){
           y+=(char)(x.charAt(i)+1); //y+=(char)(x.charAt(i)+key)
        }
        System.out.println(y);
    }
    
    
}
