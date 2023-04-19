
DELETE FROM cities;
DELETE FROM countries;

ALTER SEQUENCE entity_id_seq RESTART WITH 1;

INSERT INTO countries ( id, name, area, population)
VALUES (nextval('entity_id_seq'),'USA', 9826675, 334998398),
       (nextval('entity_id_seq'),'France', 675417, 66172539),
       (nextval('entity_id_seq'), 'UK', 243809, 63181775);

INSERT INTO cities (id, name, area, population, age, country)
VALUES (nextval('entity_id_seq'), 'New York', 1223.3, 8467513, 370, 1),
       (nextval('entity_id_seq'), 'Los Angeles', 1299.01, 3849297, 242, 1),
       (nextval('entity_id_seq'),'Chicago', 606, 2696555, 190, 1),
       (nextval('entity_id_seq'), 'Houston', 1722, 2288250, 197, 1),

       (nextval('entity_id_seq'), 'Paris', 105.40, 2233818, 2076, 2),
       (nextval('entity_id_seq'), 'Marseille', 240.62, 861635, 2623, 2),
       (nextval('entity_id_seq'), 'Nice', 71.92, 343629, 2373, 2),

       (nextval('entity_id_seq'), 'London', 1602, 8787892, 1980, 3),
       (nextval('entity_id_seq'), 'Birmingham', 267.8, 1137100, 857, 3);

INSERT INTO countries (id, name, area, population)
VALUES (nextval('entity_id_seq'),'Россия', 17100000, 146424729);
