package com.springboot.lardi.entity.dao.mysql;

import com.springboot.lardi.entity.NoteEntry;
import com.springboot.lardi.entity.dao.NoteEntryDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class NoteEntryDaoDbImpl implements NoteEntryDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(NoteEntry entry) {
        em.persist(entry);
    }

    @Override
    public List<NoteEntry> findAll() {
        return em
                .createQuery("SELECT n FROM NoteEntry n")
                .getResultList();
    }

    @Override
    public List<NoteEntry> findAllByOwnerName(String name) {
        return this.findAll();
    }
}
