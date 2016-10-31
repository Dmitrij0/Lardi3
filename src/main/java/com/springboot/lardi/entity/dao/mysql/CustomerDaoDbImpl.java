package com.springboot.lardi.entity.dao.mysql;


import com.springboot.lardi.entity.Customer;
import com.springboot.lardi.entity.dao.CustomerDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CustomerDaoDbImpl implements CustomerDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public Customer findByName(String name) {
        return entityManager
                .createQuery("SELECT c FROM Customer c WHERE c.name = :customerName", Customer.class)
                .setParameter("customerName", name)
                .getSingleResult();
    }

}
