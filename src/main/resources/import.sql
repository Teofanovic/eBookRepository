INSERT INTO category(name) VALUES ('Comedy');
INSERT INTO category(name) VALUES ('Romance');
INSERT INTO category(name) VALUES ('Documentary');
INSERT INTO category(name) VALUES ('Sci-Fi');
INSERT INTO category(name) VALUES ('Horror');

INSERT INTO language(name) VALUES ('Serbian');
INSERT INTO language(name) VALUES ('English');
INSERT INTO language(name) VALUES ('Russian');
INSERT INTO language(name) VALUES ('French');
INSERT INTO language(name) VALUES ('German');

INSERT INTO user(first_name, last_name, role, username, password) VALUES ('Lionel', 'Messi', 'administrator', 'messi', '10');
INSERT INTO user(first_name, last_name, role, username, password, category_id) VALUES ('Karim', 'Benzema', 'pretplatnik', 'benzema', '11', 1);
INSERT INTO user(first_name, last_name, role, username, password, category_id) VALUES ('Cristiano', 'Ronaldo', 'pretplatnik', 'cr', '10', 2);