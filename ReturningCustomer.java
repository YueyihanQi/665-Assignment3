package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: ReturningCustomer.java
 * Description: Returning Customer is used to implement the Customer interface and to generate appellation and privilege descriptions.
 */
public class ReturningCustomer implements Customer {
    //Generates the email appellation for a returning customer.
    @Override
    public String generateEmailAppelation(){
        return "Dear Returning Customer, ";
    }
    //Prints personalized rights message for a Returning customer.
    @Override
    public void personalizedRight(String customerRight){
        System.out.println("Warm tip: You are Returning Customer, your premium privileges have...");
    }
}
