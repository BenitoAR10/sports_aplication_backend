-- Datos de prueba

-- INSERTS PERSONA
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
values ('Jamison', 'Filan', false, '916-795-5076', 'Sacramento', '2022-07-27', 162, 148, 36, 'http://dummyimage.com/171x100.png/5fa2dd/ffffff', true, false, 'jfilan0@nationalgeographic.com', '2022-03-24', '152.218.17.125');

INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Amara', 'Lampaert', false, '994-560-9729', 'Binzhou', '2022-09-08', 204, 67, 24, 'http://dummyimage.com/155x100.png/5fa2dd/ffffff', true, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Mario', 'Clements', false, '580-708-5752', 'Vilares', '2022-06-20', 207, 41, 29, 'http://dummyimage.com/133x100.png/ff4444/ffffff', false, true, 'mclementsb@flickr.com', now(), '142.158.189.231');

INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Carlitos', 'Sucha', false, '580-708-5752', 'Vilares', '2022-06-20', 207, 41, 29, 'http://dummyimage.com/133x100.png/ff4444/ffffff', false, true, 'carlitos@gmail.com', now(), '142.158.189.231');

INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Camila', 'Sucha', false, '580-708-5752', 'Vilares', '2022-06-20', 207, 41, 29, 'http://dummyimage.com/133x100.png/ff4444/ffffff', false, true, 'carlitos@gmail.com', now(), '142.158.189.231');

SELECT * FROM sp_persona;

-- INSERTS DEPORTE
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Atletismo', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Futbol', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Basquet', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Tenis', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
insert into sp_deporte (deporte, estado, tx_correo, tx_fecha, tx_host) values ('Voley', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_deporte;

-- INSERTS CUENTA

INSERT INTO sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
VALUES (2, 1, 'amaral@gmail.com', 'ACADASAS@13123123', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
VALUES (1, 1, 'amirb@gmail.com', 'ACADASAS@13123123', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_cuenta;

-- INSERTS ROLES

INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('usuario', 'Rol para los usuarios normales de la aplicacion', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Agregar entrenamientos', 'Rol para los entrenadores de la aplicacion', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_roles;

-- INSERT GRUPOS

INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('clientes', 'Clientes de la aplicaion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Entrenador', 'Entrenadores de la aplicacion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_grupos;


-- INSERTS GRUPO-ROLES

INSERT INTO sp_grupo_roles (id_grupos, id_roles, estado, tx_correo, tx_fecha, tx_host)
VALUES (1, 1, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupo_roles (id_grupos, id_roles, estado, tx_correo, tx_fecha, tx_host)
VALUES (2, 2, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_grupo_roles;

-- INSERTS CUENTA-GRUPOS

INSERT INTO sp_cuenta_grupos (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
VALUES (1, 1, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_cuenta_grupos (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
VALUES (2, 2, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_cuenta_grupos;

SELECT sr.rol, sr.descripcion
FROM
    sp_cuenta sc
    LEFT JOIN sp_cuenta_grupos scg ON scg.id_cuenta = sc.id_cuenta
    LEFT JOIN sp_grupos sg ON sg.id_grupos = scg.id_grupos
    LEFT JOIN sp_grupo_roles sgr ON sgr.id_grupos = sg.id_grupos
    LEFT JOIN sp_roles sr ON sgr.id_roles = sr.id_roles
WHERE
    sc.correo = 'amirb@gmail.com';


-- PROCEDURE insert sp_cuenta y sp_persona en una sola transaccion.

CREATE OR REPLACE PROCEDURE sp_insert_cuenta_persona()
LANGUAGE plpgsql
AS $$
    BEGIN

        INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, cat_persona_status, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, estado, tx_correo, tx_fecha, tx_host)
        VALUES ('Camila', 'Lopez', true, '12-3232-4141','La Paz', true,'2022-06-20', 160, 65, 20, 'http://dummyimage.com/133x100.png/ff4444/ffffff', true, 'camilal@gmail.com', now(),'167.130.231.107');

        INSERT INTO sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
        VALUES (1, 1, 'camilal@gmail.com', 'ACADASAS@13123123', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

END;$$;

call sp_insert_cuenta_persona();

<<<<<<< HEAD
-- crear trigger para la funcin anterior.





=======

CREATE OR REPLACE FUNCTION inst_cuenta()
returns trigger as
$$
BEGIN
    INSERT INTO sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
    VALUES (new.id_persona, 1, '', '', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
return new;
END;
$$
language plpgsql;

-- Trigger

CREATE TRIGGER inst_cuenta
AFTER INSERT ON sp_persona
FOR EACH ROW
EXECUTE PROCEDURE inst_cuenta();


-- Cambiando campos a nulleables en la tabla sp_cuenta.
ALTER TABLE sp_cuenta ALTER COLUMN estado DROP NOT NULL;
ALTER TABLE sp_cuenta ALTER COLUMN tx_correo DROP NOT NULL;
ALTER TABLE sp_cuenta ALTER COLUMN tx_fecha DROP NOT NULL;
ALTER TABLE sp_cuenta ALTER COLUMN tx_host DROP NOT NULL;


-- Cambiando campos a nulleables en la tabla sp_persona.
ALTER TABLE sp_persona ALTER COLUMN genero DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN cat_persona_status DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN ciudad DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN fecha_nacimiento DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN altura DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN peso DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN indice_masa_corporal DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN foto DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN estado DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN tx_correo DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN tx_fecha DROP NOT NULL;
ALTER TABLE sp_persona ALTER COLUMN tx_host DROP NOT NULL;

-- elinar trigger y procedimiento.
DROP TRIGGER inst_cuenta ON sp_persona;
>>>>>>> 7911d42c1f26ee48c9361039538898bab89d927c
