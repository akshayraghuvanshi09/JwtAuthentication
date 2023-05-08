# JwtAuthentication
INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('CREATOR');_
INSERT INTO roles (name) VALUES ('EDITOR');
INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO users (username, password, enabled) VALUES ('nilesh', '$2a$10$01pVGGz1EXm. LQ/OcvmBQOFdAe3FQNYhOOXrKD6y9fhx0r2aBKwHu', 1);
INSERT INTO users (username, password, enabled) VALUES ('mahesh', '$2a$10$1v8PTtiNw7injglznpYeIehWW6knfFe/RnUW16TmGKtfSWRm/V2z2', '1');
INSERT INTO users (username, password, enabled) VALUES ('suresh', '$2a$10$flDL1ovH. 7JEy11SpBuuHuqagrXA8K3j3ELXQFV/KXhQK. WSnP8a.', '1');
INSERT INTO users (username, password, enabled) VALUES ('ramesh', '$2a$10$9k8/ODt16QFCmcmXL02.oeVR8gHUtqpw9JeoEwEx/BKKAX9BZbbHK', '1');
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$bN7OWEvi6rTqJEYbZfD0g. FHmG.xPTDxJR1k9LzsR406Nt8zuIKwq', '1');
INSERT INTO users roles (user id, role id) VALUES (1, 1);
INSERT INTO users roles (user id, role id) VALUES (2, 2);
INSERT INTO users roles (user id, role id) VALUES (3, 3);
INSERT INTO users roles (user id, role id) VALUES (4, 2);
INSERT INTO users rol (user id, role id) VALUES (4, 3);
INSERT INTO users roles (user id, role id) VALUES (5, 4);
insert into student (sname, scity) values('Nilesh', 'Rajkot');
insert into student (sname, scity) values('Suresh', 'Ahmedabad');
insert into student (sname, scity) values('Mahesh', 'Mumbai');
insert into student (sname, scity) values ('Ravi', 'Delhi');
