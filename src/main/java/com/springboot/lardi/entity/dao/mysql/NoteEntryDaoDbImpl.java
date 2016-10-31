package com.springboot.lardi.entity.dao.mysql;

import com.springboot.lardi.entity.NoteEntry;
import com.springboot.lardi.entity.dao.NoteEntryDAO;
import org.springframework.stereotype.Repository;
import org.springframework. transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class NoteEntryDaoDbImpl implements NoteEntryDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(NoteEntry entry) {
        entityManager.persist(entry);
    }

    @Override
    public List<NoteEntry> findAll() {
        return entityManager
                .createQuery("SELECT n FROM NoteEntry n", NoteEntry.class)
                .getResultList();
    }

    @Override
    public List<NoteEntry> findAllByOwnerName(String name) {
        return entityManager
                .createQuery("SELECT n FROM Customer c, NoteEntry n where c.name = :name and n.owner.id = c.id", NoteEntry.class)
                .setParameter("name", name)
                .getResultList();
    }
}
