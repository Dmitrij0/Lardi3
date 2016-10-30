package com.springboot.lardi.service;

import com.springboot.lardi.entity.Customer;
import com.springboot.lardi.entity.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserDetailsService {

    @Autowired
    private CustomerDAO customerDao;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        Customer customer = customerDao.findByName(name);
        if (customer != null) {
            return new User(customer.getName(), customer.getPassword(),
                    AuthorityUtils.createAuthorityList(customer.getRoles()));
        }

        return null;
    }
}
