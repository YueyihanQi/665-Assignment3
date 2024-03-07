package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: VIPCustomer.java
 * Description: VIP Customer is used to implement the Customer interface and to generate appellation and privilege descriptions.
 */
public class VIPCustomer implements Customer{
    //Generates the email appellation for a VIP customer.
    @Override
    public String generateEmailAppelation(){
        return "Dear VIP Customer, ";
    }
    //Prints personalized rights message for a VIP customer.
    @Override
    public void personalizedRight(String customerRight){
        System.out.println("Warm tip: You are VIP Customer, your premium privileges have...");
    }
}
