-- inserts into sp_persona

select * from sp_persona;
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Nessi', 'Edelheit', true, '713-963-6798', 'Centre de Flacq', '2022-06-19', 175, 47, 20, 'http://dummyimage.com/107x100.png/cc0000/ffffff', false, true, 'nedelheitf@wiley.com', '2022-01-29', '198.252.207.19');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Rodina', 'Wahncke', true, '446-545-3675', 'Rosmaninhal', '2021-12-19', 160, 114, 37, 'http://dummyimage.com/148x100.png/ff4444/ffffff', false, false, 'rwahnckeg@toplist.cz', '2022-04-17', '46.191.150.178');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Micheal', 'Wiffield', true, '940-656-7376', 'Sidomulyo', '2022-03-22', 193, 106, 15, 'http://dummyimage.com/118x100.png/ff4444/ffffff', true, true, 'mwiffieldh@bloglovin.com', '2021-12-27', '36.64.18.30');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Chen', 'Piddock', false, '398-320-3081', 'Golomunta', '2022-02-05', 206, 102, 30, 'http://dummyimage.com/193x100.png/cc0000/ffffff', false, true, 'cpiddocki@macromedia.com', '2022-10-11', '174.39.99.47');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Godfry', 'Cogdon', true, '566-257-5823', 'Gapyeong', '2022-01-15', 150, 118, 39, 'http://dummyimage.com/234x100.png/ff4444/ffffff', true, false, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Roxana', 'Culpen', true, '499-299-8280', 'Rongai', '2021-12-25', 185, 50, 37, 'http://dummyimage.com/221x100.png/dddddd/000000', false, false, 'rculpenk@mozilla.org', '2022-08-10', '36.151.6.118');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Herta', 'Yon', false, '818-593-4191', 'Shāhpur', '2022-02-21', 184, 98, 24, 'http://dummyimage.com/155x100.png/dddddd/000000', false, true, 'hyonl@google.nl', '2022-02-01', '142.214.234.76');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Colan', 'Bettinson', true, '948-555-5795', 'Nantes', '2022-08-17', 200, 133, 15, 'http://dummyimage.com/201x100.png/ff4444/ffffff', false, true, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Leoline', 'Yancey', false, '761-360-9443', 'Créteil', '2021-12-25', 177, 92, 30, 'http://dummyimage.com/240x100.png/cc0000/ffffff', false, false, 'lyanceyn@fc2.com', '2022-03-18', '0.123.213.95');
insert into sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, cat_persona_status, estado, tx_correo, tx_fecha, tx_host) values ('Garvin', 'Bracchi', false, '965-363-3631', 'Ambovombe', '2022-09-20', 193, 146, 30, 'http://dummyimage.com/236x100.png/dddddd/000000', false, false, 'gbracchio@blog.com', '2022-01-05', '44.179.68.49');


--inserts into sp_cuenta

insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 18, null, 'rbrecheh@wired.com', 'MVSoeDAjmL3', true);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 19, null, 'wbarrowcliffi@unblog.fr', 'HfJR3UIFbk', false);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 20, null, 'btorbetj@cyberchimps.com', 'V1vkOMVdq', false);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 21, 1, 'nbulstrodek@bravesites.com', 'k2kSsK3e', true);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 22, 2, 'rratnegel@cbsnews.com', '6xF0ArdzEs', false);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 23, 3, 'pjoynsonm@histats.com', 'iwuOeLEoIV15', true);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 24, 4, 'bbrittainn@yellowbook.com', '97repuna5', false);
insert into sp_cuenta (id_persona, id_deporte, correo, contrasenia, estado) values ( 25, 5, 'ggouldebyo@themeforest.net', 'qSvUqmIs', true);


--------------INSERT SP_TIENDA----------------

select * from sp_cuenta;

insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, correo, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (16,'Watsica, Mosciski and Leffler', 'Nonna', 'Warden', 'http://dummyimage.com/248x244.png/5fa2dd/ffffff','pmarquez@ucb.edu.bo', '703-824-17', 6186364, '8773 Merry Street', 359.13, 56.31, true, 'nwarden0@amazon.com', '2022/9/23', '192.168.0.1');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, correo, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (17,'Rosenbaum, Graham and Ondricka', 'Tracey', 'Myhan', 'http://dummyimage.com/197x213.png/5fa2dd/ffffff','pmarquez@ucb.edu.bo', '701-278-54', 1957944, '2 Carioca Parkway', 332.89, 366.13, true, 'tmyhan1@toplist.cz', '2022/5/26', '192.168.0.2');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, correo, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (18,'Mayert-Mertz', 'Lucia', 'Clemits', 'http://dummyimage.com/249x188.png/cc0000/ffffff', '894-184-4893','pmarquez@ucb.edu.bo', 702038, '5 Ronald Regan Hill', 168.67, 41.33, true, 'lclemits2@amazon.de', '2021/12/10', '192.168.0.3');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, correo, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (19,'Barton, Shields and Predovic', 'Helenka', 'Speaks', 'http://dummyimage.com/102x165.png/cc0000/ffffff','pmarquez@ucb.edu.bo', '667-992-0263', 9332822, '4360 Forster Place', 348.26, 311.1, false, 'hspeaks3@nps.gov', '2022/10/5', '192.168.0.4');
insert into sp_tienda (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, correo, telefono, NIT, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host) values (20,'Sipes LLC', 'Chip', 'Fritschmann', 'http://dummyimage.com/214x191.png/5fa2dd/ffffff', '966-175-9542','pmarquez@ucb.edu.bo', 1131449, '355 International Street', 12.57, 482.6, false, 'cfritschmann4@usda.gov', '2022/1/26', '192.168.0.5');

select * from sp_tienda;

--------------SP_PRODUCTO--------------

insert into sp_producto (nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, color, talla, estado, tx_correo, tx_fecha, tx_host) values ('Audifonos KZ', 'descripcion1', 'http://dummyimage.com/179x244.png/ff4444/ffffff', 'Telecom Italia S.P.A.', true, null, null, null, 96, 17, 'otro','Azul',38.5, false, 'swasling0@arizona.edu', '2022/3/8', '192.168.0.1');
insert into sp_producto (nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, color, talla, estado, tx_correo, tx_fecha, tx_host) values ('Tenis X power', 'descripcion2', 'http://dummyimage.com/155x234.png/cc0000/ffffff', 'Fifth Street Senior Floating Rate Corp.', true, 48.98, 13, 66, 84, 91, 'tenis','Negro',34, false, 'jswatheridge1@bloomberg.com', '2022/12/20', '192.168.0.3');
insert into sp_producto (nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, color, talla, estado, tx_correo, tx_fecha, tx_host) values ('Poleras de entrenamiento', 'descripcion3', 'http://dummyimage.com/197x220.png/ff4444/ffffff', 'Shoe Carnival, Inc.', true, null, null, null, 20, 24, 'otro','Rojo',null, false, 'mholme2@cnbc.com', '2021/1/2', '192.168.0.3');
insert into sp_producto (nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, color, talla, estado, tx_correo, tx_fecha, tx_host) values ('Tenis Thunder', 'descripcion4', 'http://dummyimage.com/217x167.png/5fa2dd/ffffff', 'Huntington Bancshares Incorporated', true, 69.2, 26, 57, 81, 70, 'Cian','Azul',36, false, 'tryson3@squarespace.com', '2022/10/14', '192.168.0.4');
insert into sp_producto (nombre, descripcion, imagen, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, color, talla, estado, tx_correo, tx_fecha, tx_host) values ('Short Barcelona', 'descripcion5', 'http://dummyimage.com/128x169.png/cc0000/ffffff', 'Isramco, Inc.', true, null, null, null, 22, 64, 'otro','Verde',null, true, 'cphlipon4@sun.com', '2022/2/2', '192.168.0.5');

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

insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (9, 5, 6, 1.70, false, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (10, 4, 3,5.88, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (3, 3, 3, 8.36, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (4, 2, 6, 2.44, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (3, 1, 6, 0.93, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (7, 1, 3, 3.09, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (5, 3, 7, 1.68, false, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (3, 1, 7, 6.76, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (10, 2, 2,2.92, false, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
insert into sp_oferta_producto (id_ofertas, id_producto, id_tienda, precio_oferta, estado,tx_correo,tx_fecha,tx_host) values (7, 5, 3, 1.77, true, 'vbloxland9@latimes.com', '2022/10/12', '153.105.252.220');
select * from sp_oferta_producto;

--------------SP_PRODUCTO_TIENDA-------------------

insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (1, 2, 8.51, true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (2, 2, 3.07, true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (3, 2, 1.39, true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (1, 3, 0.54, false, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (5, 6, 4.91, true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (3, 3, 6.27, false, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (4, 6, 9.44, true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (2, 7, 0.96, true, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (1, 3, 7.86, false, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');
insert into sp_producto_tienda (id_producto, id_tienda, precio, estado,tx_correo,tx_fecha,tx_host) values (3, 7, 0.26, false, 'rstronach1@google.pl', '2022/8/28', '52.42.47.42');

---------------SP_OFERTA_CUENTA----------------
select * from sp_oferta_producto;
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (11, 9, false, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (2, 2, true, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (16, 12, true, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (22, 6, true, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (15, 4, true, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (23, 3, false, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (17, 7, false, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (4, 10, false, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (19, 8, true, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');
insert into sp_oferta_cuenta (id_cuenta, id_oferta_producto, estado,tx_correo,tx_fecha,tx_host) values (20, 11, true, 'gcogdonj@phoca.cz', '2022-08-11', '139.252.128.206');

select * from sp_cuenta;
---------------SP_PRODUCTO_CUENTA-------------------

select * from sp_producto_tienda;
select * from sp_cuenta;

insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (5, 19, false, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (8, 11, false, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (3, 12, true, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (9, 23, true, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (10, 22, true, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (4, 24, false, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (1, 4, false, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (5, 17, false, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (8, 20, false, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');
insert into sp_producto_cuenta (id_tienda_producto, id_cuenta, estado,tx_correo,tx_fecha,tx_host) values (6, 24, true, 'cbettinsonm@rambler.ru', '2022-09-14', '255.196.196.3');


SELECT  * from sp_producto;

-- MY QUERYS FOR THE APP--

--Obtener los productos con mayor numero de vistas--

select numero_de_vistas, nombre, marca from sp_producto order by numero_de_vistas desc limit 3;

--Obtener los productos con menor precio y su marca--

select op.precio_oferta, p.nombre, p.marca
from sp_oferta_producto op, sp_producto p, sp_ofertas o
where op.id_producto = p.id_producto
  and op.id_ofertas = o.id_ofertas
  and o.estado = true
  and op.estado = true
order by op.precio_oferta asc limit 3;

--Redesign the last query with the JOINS --

select op.precio_oferta, p.nombre, p.marca
from sp_oferta_producto op
  inner join sp_producto p on op.id_producto = p.id_producto
  inner join sp_ofertas o on op.id_ofertas = o.id_ofertas
where o.estado = true
  and op.estado = true
order by op.precio_oferta asc limit 3;

-- Obtener los productos con mayor numero de vistas --

select p.numero_de_vistas, p.nombre, p.marca, pt.precio,  op.precio_oferta
from sp_producto p, sp_oferta_producto op, sp_producto_tienda pt
where p.id_producto = op.id_producto
  and p.id_producto = pt.id_producto
  and op.estado = true
  and pt.estado = true
  and p.estado = true
order by p.numero_de_vistas desc limit 3;

--Redesign the last query with JOINS

select p.numero_de_vistas, p.nombre, p.marca, pt.precio,  op.precio_oferta
from sp_producto p
  inner join sp_oferta_producto op on p.id_producto = op.id_producto
  inner join sp_producto_tienda pt on p.id_producto = pt.id_producto
where op.estado = true
  and pt.estado = true
  and p.estado = true
order by p.numero_de_vistas desc limit 3;

-- Obtener los productos activos en ofertas

select p.nombre, p.marca, op.precio_oferta
from sp_producto p
  inner join sp_oferta_producto op on p.id_producto = op.id_producto
where op.estado = true
  and p.estado = true
order by p.numero_de_vistas desc limit 3;

--
SELECT p.nombre, p.descripcion, t.nombre_tienda, t.direccion
FROM sp_producto p, sp_tienda t, sp_producto_tienda pt
WHERE p.id_producto = pt.id_producto
  AND t.id_tienda = pt.id_tienda
  AND pt.estado = true;

-- Redesign the last query and update with the model with JOINS
--Obtener los productos que se encuentran activos en que tiendas
SELECT p.nombre, p.descripcion, t.nombre_tienda, t.direccion
FROM sp_producto p
INNER JOIN sp_producto_tienda pt ON p.id_producto = pt.id_producto
INNER JOIN sp_tienda t ON t.id_tienda = pt.id_tienda
WHERE pt.estado = true;

--Obtener el producto con mas vistas y de que tienda es

SELECT p.numero_de_vistas, p.nombre, p.descripcion, t.nombre_tienda, t.direccion
FROM sp_producto p
INNER JOIN sp_producto_tienda pt ON p.id_producto = pt.id_producto
INNER JOIN sp_tienda t ON t.id_tienda = pt.id_tienda
WHERE p.numero_de_vistas = (SELECT MAX(numero_de_vistas) FROM sp_producto);



select * from sp_producto;


SELECT * from sp_producto;
SELECT * from sp_tienda;
SELECT * from sp_ofertas;
SELECT * from sp_oferta_producto;
SELECT * from sp_oferta_cuenta;
SELECT * from sp_producto_tienda;
SELECT * from sp_producto_cuenta;
