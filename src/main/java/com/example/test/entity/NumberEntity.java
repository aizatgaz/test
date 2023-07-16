package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс для таблицы из MySQL, которая всегда будет с единственным значением, если вы сами туда не впишите что-то.
 */

@Entity
@Table(name = "number_table")
@NoArgsConstructor
@Getter
@Setter
public class NumberEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private int number;

    public NumberEntity(int number) {
        this.number = number;
    }
}