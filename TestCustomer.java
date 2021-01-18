package com.company.oop2;

public class TestCustomer {


    public static void main(String[] args) {
        Customer customer = new Customer(324, "Kairos", 35);
        System.out.println(customer);
        customer.setDiscount(30);
        System.out.println(customer.getDiscount());
        System.out.println(customer.getID());
        System.out.println(customer.getName());
    }

}
