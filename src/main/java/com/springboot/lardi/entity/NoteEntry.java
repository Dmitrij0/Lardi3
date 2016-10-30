package com.springboot.lardi.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

@Entity
public class NoteEntry {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private Customer owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public NoteEntry setName(String name) {
        this.name = name;
        return this;
    }

    public Customer getOwner() {
        return owner;
    }

    public NoteEntry setOwner(Customer owner) {
        this.owner = owner;
        return this;
    }
}
