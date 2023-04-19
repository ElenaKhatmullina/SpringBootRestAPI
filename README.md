# SpringBootRestAPI
Тестовое задание для демонстрации навыков создания REST API приложений.

Приложение позволяет сохранять, удалять, обновлять и просматривать в базе данных страны и города мира.
Сначала следует добавить в базу данных страну, потом город в ней.
___
## Запуск проекта
Убедитесь что на вашем компьюьтере установлена java 8+ .

Вы можете запустить приложение любым из нескольких способов:

- Запустите main метод из класса Main (расположен в папке /src/main/java/org/example ).

- Используйте плагин Maven Spring Boot: mvn spring-boot:run

- либо вы можете собрать приложение с mvn clean package, упаковав приложение как JAR, после чего перейдите в папку target и запустите его, используя java -jar SpringBootRestAPI-1.0.jar
___
### Просмотр запущенного приложения:
 перейдите в браузере по адресу http://localhost:8080
___
### Обращение через терминал:
curl -v http://localhost:8080

___
### Подготовленные запросы:
* #### Добавление в базу данных новой страны:
через терминал Linux:

curl -i -H "Content-Type:application/json" -d '{"name": "Wonderful country", "area": "777777", "population": "111"}' http://localhost:8080/countries

* #### Добавление в базу данных нового города:
* через терминал Linux:
* 
curl -i -H "Content-Type:application/json" -d '{"name":"Город будущего","area":"222","population":"123","age":"0","country":"http://localhost:8080/countries/14"}' http://localhost:8080/cities


___
### Использованные в проекте зависимости:
* spring-boot-starter-parent
* spring-boot-starter-data-rest
* spring-boot-starter-web
* spring-boot-starter-data-jpa
* postgresql
* spring-boot-maven-plugin
___
### Пул подключений к базе данных:
В Spring Boot 2 Hikari является реализацией DataSource по умолчанию (имеет базовую конфигурацию).

