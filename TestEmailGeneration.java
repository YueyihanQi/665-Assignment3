package edu.bu.met.cs665;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: TestEmailGeneration.java
 * Description: TestEmailGeneration class contains test cases for the EmailGeneration project.
 */
import org.junit.Test;
import edu.bu.met.cs665.example1.*;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;


public class TestEmailGeneration {

    //Tests the creation of various types of customers.
    @Test
    public void testCreateBusinessCustomer() {
        ConcreteCompany company = new ConcreteCompany();

        Customer businessCustomer = company.createCustomer("Business Customer");
        assertNotNull(businessCustomer);
        assertEquals("Dear Business Customer, ", businessCustomer.generateEmailAppelation());

        Customer returningCustomer = company.createCustomer("Returning Customer");
        assertNotNull(returningCustomer);
        assertEquals("Dear Returning Customer, ", returningCustomer.generateEmailAppelation());

        Customer newCustomer = company.createCustomer("New Customer");
        assertNotNull(newCustomer);
        assertEquals("Dear New Customer, ", newCustomer.generateEmailAppelation());

    }

    //Tests the creation of an unknown customer type.( the default of switch)
    @Test
    public void testCreateUnknownCustomer() {
        ConcreteCompany company = new ConcreteCompany();
        try {
            Customer unknownCustomer = company.createCustomer("Unknown Customer");
        } catch (IllegalArgumentException e) {
            assertEquals("Unsupported customer type: Unknown Customer", e.getMessage());
        }
    }

    //Tests the generation and sending of an email to a single customer.
    @Test
    public void testGenerateAndSendEmail() {
        Company company = new ConcreteCompany();
        Customer frequentCustomer = company.createCustomer("Frequent Customer");
        String emailAppellation = frequentCustomer.generateEmailAppelation();
        assertEquals("Dear Frequent Customer, ", emailAppellation);
        String emailContent = "Thank you.";
        company.email(emailAppellation + emailContent);
        frequentCustomer.personalizedRight("");
    }

    //using EmailGeneration class to generate email and send email
    @Test
    public void testSendEmail() {
        Company company = new ConcreteCompany();
        EmailGeneration emailService = new EmailGeneration(company);
        List<String> customerTypes = Arrays.asList("Business Customer");
        emailService.sendEmailToCustomer(customerTypes, "Thank you.", "access to premium services.");

    }

    //using EmailGeneration class to send an email to multiple customers.
    @Test
    public void testSendEmailToCustomers() {
        Company company = new ConcreteCompany();
        EmailGeneration emailService = new EmailGeneration(company);
        List<String> customerTypes = Arrays.asList("Business Customer", "Frequent Customer", "New Customer");
        emailService.sendEmailToCustomer(customerTypes, "Thank you.", "access to premium services.");

    }


}



