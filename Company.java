package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Company.java
 * Description: The Company interface represents a factory for generating user and email content.
 */
public interface Company {
    //Creates a new customer of the specified type.
    Customer createCustomer(String type);
    //Sends an email with the specified content.
    void email(String emailContent);

}
