package com.springboot.lardi.entity.dao;

import com.springboot.lardi.entity.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableWebMvc
//@ContextConfiguration()
public class CustomerDAOTest extends Assert {

    @Autowired
    private CustomerDAO customerDao;

    @Test
    public void testSave() throws Exception {
        Customer c = new Customer()
                            .setName("Kolya")
                            .setPassword("123");
        customerDao.save(c);

        Customer fromStore = customerDao.findByName("Kolya");

        assertTrue(c.getName().equals(fromStore.getName()));

    }

    @Test
    public void testFindByName() throws Exception {
        Customer c = new Customer()
                            .setName("Kolya")
                            .setPassword("123");
        customerDao.save(c);

        Customer fromStore = customerDao.findByName("Kolya");

        assertTrue(c.getName().equals(fromStore.getName()));
    }
}