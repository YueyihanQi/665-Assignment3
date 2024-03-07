package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Customer.java
 * Description: The Customer interface represents a product for generating email appellation and customer right content.
 */
public interface Customer {
    //Generates the email appellation for a customer.
    String generateEmailAppelation();
    //Provides personalized rights message for a customer.
    void personalizedRight(String customerRight);
}
