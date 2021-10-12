package com.coucou.cloudsys.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counter")
public class Counter {

    @Id
    private Long id;

    private Long value;

    public Counter(long id) {
        this.id = id;
        this.value = 0L;
    }

    public Counter() {}

    public long add(long value) {
        this.value += value;
        return this.value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
