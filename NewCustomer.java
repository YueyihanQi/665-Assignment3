package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: NewCustomer.java
 * Description: New Customer is used to implement the Customer interface and to generate appellation and privilege descriptions.
 */
public class NewCustomer implements Customer{
    //Generates the email appellation for a new customer.
    @Override
    public String generateEmailAppelation(){
        return "Dear New Customer, ";
    }
    //Prints personalized rights message for a new customer.
    @Override
    public void personalizedRight(String customerRight){
        System.out.println("Warm tip: You are New Customer, your premium privileges have...");
    }

}
