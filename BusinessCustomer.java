package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: BusinessCustomer.java
 * Description: Business Customer is used to implement the Customer interface and to generate appellation and privilege descriptions.
 */

public class BusinessCustomer implements Customer{
    @Override
    //Generates the email appellation for a business customer.
    public String generateEmailAppelation(){
        return  "Dear Business Customer, ";
    }
    //Prints personalized rights message for a business customer.
    @Override
    public void personalizedRight(String customerRight){
        System.out.println("Warm tip: You are Business Customer, your premium privileges have...");
    }
}



