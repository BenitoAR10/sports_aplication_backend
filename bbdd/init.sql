-- Datos de prueba

-- INSERTS PERSONA
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
values ('Jamison', 'Filan', false, '916-795-5076', 'Sacramento', '2022-07-27', 162, 148, 36, 'http://dummyimage.com/171x100.png/5fa2dd/ffffff', true, false, 'jfilan0@nationalgeographic.com', '2022-03-24', '152.218.17.125');

INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Amara', 'Lampaert', false, '994-560-9729', 'Binzhou', '2022-09-08', 204, 67, 24, 'http://dummyimage.com/155x100.png/5fa2dd/ffffff', true, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Mario', 'Clements', false, '580-708-5752', 'Vilares', '2022-06-20', 207, 41, 29, 'http://dummyimage.com/133x100.png/ff4444/ffffff', false, true, 'mclementsb@flickr.com', now(), '142.158.189.231');

SELECT * FROM sp_persona;

-- INSERTS DEPORTE
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Atletismo', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Futbol', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Basquet', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Tenis', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Voley', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_deporte;