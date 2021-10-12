package com.coucou.cloudsys.repository;

import com.coucou.cloudsys.entity.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {

}
