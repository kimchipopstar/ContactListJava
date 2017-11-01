/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlistjava;
import java.util.*;

/**
 *
 * @author j.k.
 */
public class ContactList {
    
    private List<Contact> contacts;
    
    public ContactList() {
        contacts = new ArrayList<Contact>();
    }
    
    public void setContacts (Contact contact) {
        this.contacts.add(contact);
    }
    
    public List<Contact> getContacts () {
        return contacts;
    }
}
