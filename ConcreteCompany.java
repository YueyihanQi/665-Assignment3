package edu.bu.met.cs665.example1;
/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: ConcreteCompany.java
 * Description: Concrete Company is used to implement the Company interface and to create different types of customers and generate email content.
 */
public class ConcreteCompany implements Company{
    @Override
    public Customer createCustomer(String type){
        //using switch to create types of customers
        switch (type){
            case "Business Customer":
                return new BusinessCustomer();
            case "Frequent Customer":
                return new FrequentCustomer();
            case "New Customer":
                return new NewCustomer();
            case "Returning Customer":
                return new ReturningCustomer();
            case "VIP Customer":
                return new VIPCustomer();
            default:
                throw new IllegalArgumentException("Unsupported customer type: " + type);
        }
    }

    @Override
    public void email(String emailContent){
        System.out.println(emailContent);
    }
}
