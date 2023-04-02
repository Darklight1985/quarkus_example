package com.example;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyEntityRepository implements PanacheRepository<MyEntity> {

//    @Override
//    public void persist(MyEntity entity) {
//       PanacheRepository.super.(entity);
//    }
}
