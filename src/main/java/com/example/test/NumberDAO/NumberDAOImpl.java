package com.example.test.NumberDAO;

import com.example.test.entity.NumberEntity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class NumberDAOImpl implements NumberDAO {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public NumberEntity getNumber() {
        if (entityManager.find(NumberEntity.class, 1) == null) {
            NumberEntity entity = new NumberEntity(0);
            entity.setId(1L);
            saveNumber(entity);
        }
        NumberEntity entity = entityManager.find(NumberEntity.class, 1);

        return entity;
    }

    @Transactional
    @Override
    public void saveNumber(NumberEntity entity) {
        entityManager.merge(entity);
    }
}
