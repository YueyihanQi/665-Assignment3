package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: FrequentCustomer.java
 * Description: Frequent Customer is used to implement the Customer interface and to generate appellation and privilege descriptions.
 */
public class FrequentCustomer implements Customer{
    //Generates the email appellation for a Frequent customer.
    @Override
    public String generateEmailAppelation(){
        return "Dear Frequent Customer, ";
    }

    //Prints personalized rights message for a Frequent customer.
    @Override
    public void personalizedRight(String customerRight){
        System.out.println("Warm tip: You are Frequent Customer, your premium privileges have...");
    }
}
