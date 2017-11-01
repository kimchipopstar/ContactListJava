/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlistjava;
import java.util.Scanner;

/**
 *
 * @author j.k.
 */
public class ContactListJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean programIsOn = true;
        
        while (programIsOn) {
            System.out.println("What would you like do next?\n new - Create a new contact\n list - List all contacts\n quit - Exit Application > _");
            String userInput = scan.nextLine();
            if (userInput.equals("new")) {
                Contact contact = new Contact();
                System.out.println("Enter first name");
                userInput = scan.nextLine();
                contact.setFirstName(userInput);
                System.out.println("Enter last name");
                userInput = scan.nextLine();
                contact.setLastName(userInput);
                System.out.println("Enter email");
                userInput = scan.nextLine();
                contact.setEmail(userInput);
            }
        }
    }
    
}
