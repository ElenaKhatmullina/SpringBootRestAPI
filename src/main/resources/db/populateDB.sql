DELETE FROM countries;
DELETE FROM cities;

ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO countries (id, name, area, population)
VALUES (100000,'USA', 9826675, 334998398),
       (100001,'France', 675417, 66172539),
       (100002, 'UK', 243809, 63181775);

INSERT INTO cities (id, name, area, population, age, country_id)
VALUES (100003, 'New York', 1223.3, 8467513, 370, 100000),
       (100004, 'Los Angeles', 1299.01, 3849297, 242, 100000),
       (100005,'Chicago', 606, 2696555, 190, 100000),
       (100006, 'Houston', 1722, 2288250, 197, 100000);