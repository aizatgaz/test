package com.example.test.service;

import com.example.test.NumberDAO.NumberDAO;
import com.example.test.entity.NumberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberDAO numberDAO;

    @Override
    public NumberEntity getNumber() {
        return numberDAO.getNumber();
    }

    @Override
    public void saveNumber(NumberEntity entity) {
        numberDAO.saveNumber(entity);
    }
}
