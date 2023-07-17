# test
Тест для вакансии.

Перед запуском у вас должна быть таблица `number_table` в MySQL:

CREATE TABLE `number_table` (
  `id` int NOT NULL,
  `number` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

А так же поменять базу (schema) данных в файле application.properties, всесто "my_db" на свою, где вы создали `number_table`

<hr>

Тестовое задание:
Добавить кнопку и текстовое поле на страницу.
По нажатию на кнопку - значение в поле увеличивается на 1.
Значение поля можно изменить руками, вписав нужное значение.

Изменения должны сохранятся в БД автоматически при каждом изменении.
Необходимо использовать binder и Spring Data.

В качестве БД подойдет H2.
Остальное: Vaadin 24, Java 17, Maven, Spring Boot 3

<hr>
Вот как это выглядит:

![123](https://github.com/aizatgaz/test/assets/100792272/f8eff16f-9b8c-46d1-b923-18ae7071dbb6)
