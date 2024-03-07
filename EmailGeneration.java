package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: EmailGeneration.java
 * Description: Email generation handles the generation and sending of personalized emails to customers.
 */
import java.util.List;

public class EmailGeneration {
    private Company company;
    //Constructs a new EmailGeneration instance with the given company.
    public EmailGeneration(Company company) {
        this.company = company;
    }

    //using to list to store information of different types of customers, in order to achieve mass mailing
    public void sendEmailToCustomer(List<String> customerTypes, String emailContent, String customerRight) {
        //using loop to send email to all customers
        //the format of email is personalized appellation following with same email content, and finished with personalized customer's right.
        for (String customerType : customerTypes) {
            Customer customer = company.createCustomer(customerType);
            String emailAppellation = customer.generateEmailAppelation();
            company.email(emailAppellation + emailContent);
            customer.personalizedRight(customerRight);
        }
    }
}
