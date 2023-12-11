/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author sawaz
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Do you want to encrypt[e] or decrypt[d] a message? ");
        outerLoop:
        while(true){
            
            String choice = scan.nextLine(); //user input 
            if(choice.equals("e") || choice.equals("E")){ //encrpytion
                scan.nextLine();
                System.out.print("Enter the message for encryption:");
                String userInput = scan.nextLine();

                System.out.print("Enter shift key:");
                int key = scan.nextInt();

                System.out.println("Encrypted message: "+encrypt(userInput,key));
                break;
            }else if(choice.equals("d") || choice.equals("D")){ //decryption
                scan.nextLine();
                System.out.print("Enter the message for decryption:");
                String userInput = scan.nextLine();

                System.out.print("Enter shift key:");
                int key = scan.nextInt();

                System.out.println("Decrypted message: "+decrypt(userInput,key));
                break;
            }else if(choice.isEmpty()){
                break;
               
            }
            else{
                System.out.println("Invalid input. Please enter 'e' or 'd' to continue or press 'Enter' to end the program!");
                continue outerLoop;
            }
        }  
    }
    
    public static String encrypt(String x, int key){
        String y = "";
        for(int i = 0;i<x.length();i++){
            if((x.charAt(i)+key)>'z'){
                char z = (char) ((x.charAt(i)+key)-26); //to reset and only get a-z
                y+=(char)z;
            }
            else{
                y+=(char)(x.charAt(i)+key);
            }
        }
        return y;
    }
    
    public static String decrypt(String x, int key){
        String y = "";
        for(int i = 0;i<x.length();i++){
            if((x.charAt(i)-key)<'a'){
                char a = (char) ((x.charAt(i)-key)+26); //to reset and only get a-z
                y+=(char)a;
            }
            else{
                y+=(char)(x.charAt(i)-key);
            }
        }
        return y;
    }
    
}
