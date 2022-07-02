package com.my.app.core.domain;

import com.my.app.core.domain.type.Value;

import java.util.List;

public interface DataRepository<T, ID extends Value.AsPositiveInt> {

    <S extends T> S save(S entity);

    boolean deleteById(ID id);

    List<T> findAll();

    T findById(ID id);

    ID getLastId();

    ID getNextId();

}
