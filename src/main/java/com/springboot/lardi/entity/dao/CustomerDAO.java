package com.springboot.lardi.entity.dao;


import com.springboot.lardi.entity.Customer;

public interface CustomerDAO {

    void save(Customer customer);

    Customer findByName(String name);

}
