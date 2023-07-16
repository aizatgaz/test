package com.example.test;

import com.example.test.entity.NumberEntity;
import com.example.test.service.NumberService;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route()
@PageTitle("Increase a number")
public class MainView extends VerticalLayout {

    private final Binder<NumberEntity> binder;
    private NumberService numberService;



    public MainView(@Autowired NumberService numberService) {
        this.numberService = numberService;


        NumberEntity currentNumber = currentNumber();

        IntegerField numberField = new IntegerField("Текущее число: " + currentNumber.getNumber()) {{
            addClickListener(click -> {
                currentNumber.setNumber(this.getValue());
                numberService.saveNumber(currentNumber);
                UI.getCurrent().getPage().reload();
            });
            addClickShortcut(Key.ENTER);
        }};
        numberField.setClearButtonVisible(true);

        binder = new Binder<>(NumberEntity.class);
        binder.bind(numberField, NumberEntity::getNumber, NumberEntity::setNumber);

        Button incrementButton = new Button("Увеличить на 1");
        incrementButton.addClickListener(buttonClickEvent -> {
            NumberEntity numberEntity = currentNumber;
            int number = numberEntity.getNumber() + 1;
            numberEntity.setNumber(number);
            numberService.saveNumber(numberEntity);
            UI.getCurrent().getPage().reload();
        });

        add(numberField, incrementButton);

    }

    private NumberEntity currentNumber() {
        return numberService.getNumber();
    }
}
