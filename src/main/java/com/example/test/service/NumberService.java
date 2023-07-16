package com.example.test.service;

import com.example.test.entity.NumberEntity;

/**
 * Интерфейс для обслуживания данных, которые находятся в базе или просто логика
 */

public interface NumberService {

    NumberEntity getNumber();

    void saveNumber(NumberEntity entity);
}
