package com.springboot.lardi.configuration;


import com.springboot.lardi.entity.Customer;
import com.springboot.lardi.entity.NoteEntry;
import com.springboot.lardi.entity.dao.CustomerDAO;
import com.springboot.lardi.entity.dao.NoteEntryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PopulateData implements CommandLineRunner {

    @Autowired
    private CustomerDAO customerDao;

    @Autowired
    private NoteEntryDAO entryDao;


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("********** Sample Data Populated");

        String[] roles = new String[1];
        roles[0] = "ROLE_USER";

        Customer c1 = new Customer().setName("one").setPassword("123").setRoles(roles);
        Customer c2 = new Customer().setName("two").setPassword("123").setRoles(roles);

        NoteEntry n1 = new NoteEntry().setName("qwert").setOwner(c1);
        NoteEntry n2 = new NoteEntry().setName("asgas").setOwner(c1);
        NoteEntry n3 = new NoteEntry().setName("asvv").setOwner(c1);
        NoteEntry n4 = new NoteEntry().setName("fgkfjk").setOwner(c2);
        NoteEntry n5 = new NoteEntry().setName("dhryehr").setOwner(c2);

/*        customerDao.save(c1);
        customerDao.save(c2);

        entryDao.save(n1);
        entryDao.save(n2);
        entryDao.save(n3);
        entryDao.save(n4);
        entryDao.save(n5);*/

    }

}
