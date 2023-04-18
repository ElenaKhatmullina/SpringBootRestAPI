
DELETE FROM cities;
DELETE FROM countries;

ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO countries (id, name, area, population)
VALUES (100000,'USA', 9826675, 334998398),
       (100001,'France', 675417, 66172539),
       (100002, 'UK', 243809, 63181775);

INSERT INTO cities (id, name, area, population, age, country_id)
VALUES (100003, 'New York', 1223.3, 8467513, 370, 100000),
       (100004, 'Los Angeles', 1299.01, 3849297, 242, 100000),
       (100005,'Chicago', 606, 2696555, 190, 100000),
       (100006, 'Houston', 1722, 2288250, 197, 100000),

       (100007, 'Paris', 105.40, 2233818, 2076, 100001),
       (100008, 'Marseille', 240.62, 861635, 2623, 100001),
       (100009, 'Nice', 71.92, 343629, 2373, 100001),

       (1000010, 'London', 1602, 8787892, 1980, 100002),
       (1000011, 'Birmingham', 267.8, 1137100, 857, 100002);

INSERT INTO countries (id, name, area, population)
VALUES (100012,'Россия', 17100000, 146424729);