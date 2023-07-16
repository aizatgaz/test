package com.example.test.NumberDAO;

import com.example.test.entity.NumberEntity;

/**
 * Интерфейс, который обеспечивает доступ к нашей базе данных через методы.
 */

public interface NumberDAO {

    NumberEntity getNumber();

    void saveNumber(NumberEntity entity);
}
