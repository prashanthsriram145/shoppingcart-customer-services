package com.visa.shoppingcart.customer.customer.services;

import com.visa.shoppingcart.customer.customer.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    boolean addCustomer(Customer customer);

}
