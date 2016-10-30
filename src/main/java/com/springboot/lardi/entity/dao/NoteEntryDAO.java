package com.springboot.lardi.entity.dao;


import com.springboot.lardi.entity.NoteEntry;

import java.util.List;

public interface NoteEntryDAO {

    void save(NoteEntry entry);

    List<NoteEntry> findAll();

    List findAllByOwnerName(String name);

/*
    int countAll();
    List<NoteEntry> findAll(int startPosition, int pageSize);
*/


}
