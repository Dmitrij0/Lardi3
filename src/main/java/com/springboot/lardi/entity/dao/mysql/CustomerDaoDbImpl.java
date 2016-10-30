package com.springboot.lardi.entity.dao.mysql;


import com.springboot.lardi.entity.Customer;
import com.springboot.lardi.entity.dao.CustomerDAO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CustomerDaoDbImpl implements CustomerDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Customer customer) {
        em.persist(customer);
    }

    @Override
    public Customer findByName(String name) {
        return (Customer) em
                .createQuery("SELECT c FROM Customer c WHERE name = :customerName")
                .setParameter("customerName", name)
                .getSingleResult();
    }

}
