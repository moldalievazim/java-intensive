package com.growthhungry.contactManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Contact {
//    Fields
    private String name;
    private String phoneNumber;
    private String email;

//    Constructor
    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

//    Getters and Setters
    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return name + ": " + phoneNumber + ", " + email;
    }

//          using ArrayList
    ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact(Contact contact){
//        for loop checks for duplicates
        for(Contact c : contacts){
            if (c.getName().equalsIgnoreCase(contact.getName())){
                System.out.println("Contact already exists");
                return;
            }
        }

        contacts.add(contact);

        System.out.println("Contact added: " + contact);
    }

    public void displayContacts(){
        if (contacts.isEmpty()){
            System.out.println("No contacts found");
        } else {
            for (Contact c : contacts){
                System.out.println(c);
            }
        }
    }

//          using HashMap
    HashMap<String, String> phoneBook = new HashMap<>();
    public void addContactToPhoneBook(){
       if (contacts.isEmpty()){
           System.out.println("Contact list is empty");
       }
        for (Contact c : contacts){
        phoneBook.put(c.getName(), c.getPhoneNumber());
        }
    }

    public void searchContact(String name){
        if (phoneBook.containsKey(name)){
            System.out.println("Phone number for " + name + ": " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found!");
        }
    }

//    using HashSet
    HashSet<String> emailDomains = new HashSet<>();
    public void extractEmailDomains(){
        for (Contact c : contacts){
            String email = c.getEmail();
            String domain = email.substring(email.indexOf("@") + 1);
            emailDomains.add(domain);
        }

        System.out.println("Unique email domains: " + emailDomains);
    }

    public static void main(String[] args){
        Contact manager = new Contact("", "", "");


        manager.addContact(new Contact("Kesa", "+996778202315", "kesa@icloud.com"));
        manager.addContact(new Contact("Munash", "+77737859314", "munar@gmail.com"));
        manager.addContact(new Contact("Azim", "+17738355262", "azim@yahoo.com"));

        manager.displayContacts();
        manager.addContactToPhoneBook();
        manager.searchContact("Azim");
        manager.extractEmailDomains();
    }

}
