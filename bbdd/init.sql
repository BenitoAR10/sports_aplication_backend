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
INSERT INTO sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
VALUES (26, null, 'carlos@gmail.com', 'ACADASAS@13123123', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
VALUES (23, null, 'colan@gmail.com', '$2a$12$lZC5vCrthu/3S/NnI2oC5On64GA.TY1JT9qtoVDEdyQq5uIf/OEJq', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_cuenta;

-- INSERTS ROLES

INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('usuario', 'Rol para los usuarios normales de la aplicacion', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Agregar entrenamientos', 'Rol para los entrenadores de la aplicacion', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Agregar tienda', 'Rol para los dueños de tienda(s) de la aplicacion', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Agregar comida', 'Rol para los servicios de comida de la aplicacion', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_roles (rol, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Agregar lugar de entrenamiento', 'Rol para los duenios de lugaremos de entrenamiento', true, 'alampaert1@businessweek.com', now(), '167.130.231.107');


SELECT * FROM sp_roles;

-- INSERT GRUPOS

INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('clientes', 'Clientes de la aplicaion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Entrenador', 'Entrenadores de la aplicacion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Dueño de tienda', 'Duenios de tiendas de la aplicacion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Servicio de comida', 'Servicio de comida de la aplicacion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupos (grupo, descripcion, estado, tx_correo, tx_fecha, tx_host)
VALUES ('Duenios de lugares de entrenamiento', 'Duenios de lugares de entrenamiento de la aplicaion', true,'alampaert1@businessweek.com', now(), '167.130.231.107');

SELECT * FROM sp_grupos;


-- INSERTS GRUPO-ROLES

INSERT INTO sp_grupo_roles (id_grupos, id_roles, estado, tx_correo, tx_fecha, tx_host)
VALUES (1, 1, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupo_roles (id_grupos, id_roles, estado, tx_correo, tx_fecha, tx_host)
VALUES (2, 2, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupo_roles (id_grupos, id_roles, estado, tx_correo, tx_fecha, tx_host)
VALUES (3, 3, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_grupo_roles (id_grupos, id_roles, estado, tx_correo, tx_fecha, tx_host)
VALUES (4, 4, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');


SELECT * FROM sp_grupo_roles;

-- INSERTS CUENTA-GRUPOS

INSERT INTO sp_cuenta_grupos (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
VALUES (1, 1, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_cuenta_grupos (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
VALUES (2, 2, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_cuenta_grupos (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
VALUES (28, 3, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');
INSERT INTO sp_cuenta_grupos (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
VALUES (29, 4, true, 'alampaert1@businessweek.com', now(), '167.130.231.107');

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


-- crear trigger para la funcin anterior.







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

-- Cambiando campos a nulleables en la tabla sp_tienda.
ALTER TABLE sp_tienda ALTER COLUMN latitud DROP NOT NULL;
ALTER TABLE sp_tienda ALTER COLUMN longitud DROP NOT NULL;
ALTER TABLE sp_tienda ALTER COLUMN estado DROP NOT NULL;
ALTER TABLE sp_tienda ALTER COLUMN tx_correo DROP NOT NULL;
ALTER TABLE sp_tienda ALTER COLUMN tx_fecha DROP NOT NULL;
ALTER TABLE sp_tienda ALTER COLUMN tx_host DROP NOT NULL;

-- elinar trigger y procedimiento.
DROP TRIGGER inst_cuenta ON sp_persona;


--------------SP_TIENDA----------------

insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (16,'Watsica, Mosciski and Leffler', 'Nonna', 'Warden', 'http://dummyimage.com/248x244.png/5fa2dd/ffffff', '703-824-17', 6186364, '8773 Merry Street', 359.13, 56.31, true, 'nwarden0@amazon.com', '2022/9/23', '192.168.0.1');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (17,'Rosenbaum, Graham and Ondricka', 'Tracey', 'Myhan', 'http://dummyimage.com/197x213.png/5fa2dd/ffffff', '701-278-54', 1957944, '2 Carioca Parkway', 332.89, 366.13, true, 'tmyhan1@toplist.cz', '2022/5/26', '192.168.0.2');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (18,'Mayert-Mertz', 'Lucia', 'Clemits', 'http://dummyimage.com/249x188.png/cc0000/ffffff', '894-184-4893', 702038, '5 Ronald Regan Hill', 168.67, 41.33, true, 'lclemits2@amazon.de', '2021/12/10', '192.168.0.3');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (19,'Barton, Shields and Predovic', 'Helenka', 'Speaks', 'http://dummyimage.com/102x165.png/cc0000/ffffff', '667-992-0263', 9332822, '4360 Forster Place', 348.26, 311.1, false, 'hspeaks3@nps.gov', '2022/10/5', '192.168.0.4');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (20,'Sipes LLC', 'Chip', 'Fritschmann', 'http://dummyimage.com/214x191.png/5fa2dd/ffffff', '966-175-9542', 1131449, '355 International Street', 12.57, 482.6, false, 'cfritschmann4@usda.gov', '2022/1/26', '192.168.0.5');

--------------SP_PRODUCTO--------------

insert into sp_producto (p_nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, estado, tx_correo, tx_fecha, tx_host) values ('Audifonos KZ', 'descripcion1', 'http://dummyimage.com/179x244.png/ff4444/ffffff', 'Telecom Italia S.P.A.', true, null, null, null, 96, 17, 'otro', false, 'swasling0@arizona.edu', '2022/3/8', '192.168.0.1');
insert into sp_producto (p_nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, estado, tx_correo, tx_fecha, tx_host) values ('Tenis X power', 'descripcion2', 'http://dummyimage.com/155x234.png/cc0000/ffffff', 'Fifth Street Senior Floating Rate Corp.', true, 48.98, 13, 66, 84, 91, 'tenis', false, 'jswatheridge1@bloomberg.com', '2022/12/20', '192.168.0.3');
insert into sp_producto (p_nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, estado, tx_correo, tx_fecha, tx_host) values ('Poleras de entrenamiento', 'descripcion3', 'http://dummyimage.com/197x220.png/ff4444/ffffff', 'Shoe Carnival, Inc.', true, null, null, null, 20, 24, 'otro', false, 'mholme2@cnbc.com', '2021/1/2', '192.168.0.3');
insert into sp_producto (p_nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, estado, tx_correo, tx_fecha, tx_host) values ('Tenis Thunder', 'descripcion4', 'http://dummyimage.com/217x167.png/5fa2dd/ffffff', 'Huntington Bancshares Incorporated', true, 69.2, 26, 57, 81, 70, 'tenis', false, 'tryson3@squarespace.com', '2022/10/14', '192.168.0.4');
insert into sp_producto (p_nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, estado, tx_correo, tx_fecha, tx_host) values ('Short Barcelona', 'descripcion5', 'http://dummyimage.com/128x169.png/cc0000/ffffff', 'Isramco, Inc.', true, null, null, null, 22, 64, 'otro', true, 'cphlipon4@sun.com', '2022/2/2', '192.168.0.5');

--------------SP_OFERTAS---------------

insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 1', '2022/09/03', '2022/09/16',true, 'yskipworth0@scientificamerican.com', '2022/3/28', '0.158.66.49');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 2', '2022/10/24', '2022/08/17',true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 3', '2022/08/07', '2022/08/05',false, 'gpenkethman2@yahoo.co.jp', '2022/2/9', '177.82.144.108');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 4', '2022/09/20', '2022/10/13',true, 'kmichel3@pcworld.com', '2022/1/29', '24.160.226.16');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 5', '2022/08/27', '2022/10/10',true, 'flippi4@example.com', '2021/11/24', '207.0.5.42');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 6', '2022/04/20', '2022/08/01',false, 'kevetts5@t/online.de', '2022/3/28', '229.243.165.71');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 7', '2022/08/22', '2022/08/04',true, 'lskone6@privacy.gov.au', '2021/12/18', '155.210.171.207');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 8', '2022/05/28', '2022/07/29',true, 'atummond7@myspace.com', '2022/10/23', '42.16.69.168');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 9', '2022/06/27', '2022/08/20',false, 'speacham8@oaic.gov.au', '2022/4/22', '245.37.208.92');
insert into sp_ofertas (descripcion, fecha_inicio, fecha_fin, estado, tx_correo, tx_fecha, tx_host) values ('descripcion 10', '2022/06/21', '2022/09/22',true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
select * from sp_ofertas;

--------------SP_OFERTA_PRODUCTO------------------

insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (9, 5, 4, 1.70, false);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (10, 4, 1,5.88, true);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (3, 3, 1, 8.36, true);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (4, 2, 2, 2.44, true);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (3, 1, 2, 0.93, true);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (7, 1, 1, 3.09, true);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (5, 3, 5, 1.68, false);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (3, 1, 5, 6.76, true);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (10, 2, 2,2.92, false);
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado) values (7, 5, 1, 1.77, true);
select * from sp_ofertas;

--------------SP_PRODUCTO_TIENDA-------------------

insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (1, 1, 8.51, true);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (2, 2, 3.07, true);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (3, 1, 1.39, true);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (1, 3, 0.54, false);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (5, 5, 4.91, true);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (3, 3, 6.27, false);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (4, 4, 9.44, true);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (2, 4, 0.96, true);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (1, 3, 7.86, false);
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado) values (3, 5, 0.26, false);

---------------SP_OFERTA_CUENTA----------------

insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (11, 5, false);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (2, 2, true);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (13, 7, true);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (22, 3, true);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (13, 4, true);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (23, 3, false);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (17, 10, false);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (4, 5, false);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (10, 5, true);
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado) values (20, 7, true);


---------------SP_PRODUCTO_CUENTA-------------------

insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (5, 18, false);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (8, 10, false);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (3, 12, true);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (9, 23, true);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (1, 22, true);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (4, 24, false);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (1, 4, false);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (5, 7, false);
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado) values (8, 20, false);


SELECT contrasenia FROM sp_cuenta WHERE correo = 'pablex.com';

-- CONSTRAINT DE UNIQUE para correo en sp_cuenta.
ALTER TABLE sp_cuenta ADD CONSTRAINT sp_cuenta_correo UNIQUE (correo);

SELECT p.nombres, p. apellidos, c.correo
FROM sp_cuenta c
         INNER JOIN sp_persona p ON c.id_persona = p.id_persona
WHERE c.correo = 'amirb@gmail.com'
  AND c.estado = true
