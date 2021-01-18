package com.company.oop2;

public class TestInvoice {

    public static void main(String[] args) {

        Customer customer = new Customer(324, "Kairos", 35);
        Invoice invoice = new Invoice(153, customer, 2000);
        System.out.println(invoice);
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmountAfterDiscount());
    }

}
