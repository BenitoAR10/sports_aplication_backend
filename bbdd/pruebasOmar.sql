--Insertar un dato de prueba para la tabla sp_lugar_entrenamiento
INSERT INTO sp_lugar_entrenamiento (nombre_lugar, nombre_propietario, apellido_propietario, correo, nit, logo_lugar, estado, tx_correo, tx_fecha, tx_host)
values ('Energym', 'Felix', 'Prueba', 'Energym@gmail.com', '715411', 'logo.png', 'true', 'algo@gmail.com', '2022-01-01', '192.166.2.1');

select * from sp_lugar_entrenamiento;
select * from sp_cuenta;

--Insertar un dato de prueba para la tabla sp_servicio_comida
INSERT INTO sp_servicio_comida (id_cuenta, nombre_lugar, nombre_propietario, apellido_propietario, telefono, correo,
                                nit, logo, latitud, direccion, longitud ,estado, tx_correo, tx_fecha, tx_host)
values ('1', 'SaludFood', 'Lucia', 'daa', '77111', 'saluf@gmail.com', '4512', 'logo.png', '12.55', 'calle 1',
        '25.33', 'true' , 'algo@gmail.com', '2022-01-01', '192.168.1.1');

select * from sp_servicio_comida;

--Insertar un dato de prueba para la tabla sp_entrenador
INSERT INTO sp_entrenador (id_cuenta, nit, correo, foto_entrenador, estado, tx_correo, tx_fecha, tx_host)
values ('2', '2020111', 'ga@gmail.com', 'foto.png', 'true', 'ent1@gmail.com', '2022-01-01', '127.2.1.3');

select * from sp_entrenador;



-- Insercion de datos de prueba en la tabla de sucursal de entrenamiento
INSERT INTO sp_lugar_entrenamiento_sucursal (id_lugar_entrenamiento, id_cuenta, nombre_encargado, apellido_encargado,
                                             telefono_sucursal, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host)
values ('1', '2', 'Empleado Felix', 'apellido prueba1', '77111', 'calle 1', '-10.55', '44.33', 'true', 'algo@email.com', '2022-01-01', '128.66.2.1');

select * from sp_lugar_entrenamiento_sucursal;
--Fin de la insercion de datos de prueba en las tablas de lugares
-- insercion de datos de prueba para los planes
INSERT INTO sp_plan_lugar_entrenamiento (id_lugar_entrenamiento_sucursal, costo, cantidad_meses, estado, tx_correo, tx_fecha, tx_host)
values ('1', '1000', '3', 'true', 'algo@email.com', '2022-01-01', '192.150.2.3');

select * from sp_plan_lugar_entrenamiento;

INSERT INTO sp_plan_comida (id_servicio_comida, nombre_plan, descripcion, costo_mes,estado , tx_correo, tx_fecha, tx_host)
values ('1', 'Plan 1', 'Plan de comida para bajar de peso', '800', 'true', 'algo@gmail.com', '2022-01-01', '166.71.5.30');

select * from sp_plan_comida;

insert into sp_plan_entrenador (id_entrenador, costo, cantidad_meses, estado, tx_correo, tx_fecha, tx_host)
values ('1', '1000', '3', 'true', 'algo@gmail.com', '2022-01-01', '200.30.2.3');

select * from sp_plan_entrenador;

-- insercion de planes en la tabla tipo de plan
insert into sp_tipo_plan_entrenamiento ( id_plan_comida, id_plan_lugar_entrenamiento, id_plan_entrenador, duracion, estado, tipo_plan,tx_correo, tx_fecha, tx_host)
values ('1', '1', '1', '3', 'true', 'plane 3 Meses powerfull','tipoplan1@email.es', '2022-01-01', '200.1.1.1');

select * from sp_tipo_plan_entrenamiento;

-- insercion de datos en la tabla sp_compra_plan
insert into sp_compra_plan (id_tipo_plan_entrenamiento, id_cuenta, costo_plan, fecha_compra, fecha_fin, tx_correo, tx_fecha, tx_host)
values ('2', '5', '2800', '2021-01-01', '2021-04-01', 'algo@gmail.com', '2022-01-01', '100.25.2.1');
insert into sp_compra_plan (id_tipo_plan_entrenamiento, id_cuenta, costo_plan, fecha_compra, fecha_fin, tx_correo, tx_fecha, tx_host)
values ('2', '10', '3500', '2021-01-01', '2021-04-01', 'algo@gmail.com', '2022-01-01', '100.25.2.1');

select * from sp_compra_plan;


-- Consulta para ver los planes adquiridos en entrenamientos segun el id del lugar de entrenamiento
select c.id_cuenta, p.nombres, p.apellidos, t.cantidad_meses, t.costo
from sp_cuenta c
inner join sp_persona p on c.id_persona = p.id_persona
inner join sp_compra_plan cp on c.id_cuenta = cp.id_cuenta
inner join sp_tipo_plan_entrenamiento tp on cp.id_tipo_plan_entrenamiento = tp.id_tipo_plan_entrenamiento
inner join sp_plan_lugar_entrenamiento t on tp.id_plan_lugar_entrenamiento = t.id_plan_lugar_entrenamiento
inner join sp_lugar_entrenamiento_sucursal s on t.id_lugar_entrenamiento_sucursal = s.id_lugar_entrenamiento_sucursal
where s.id_cuenta = 2;

-- Hacer una consulta para ver los planes de comida adquiridos segun el id del servicio de comida
select c.id_cuenta, p.nombres, p.apellidos, tp.duracion, t.costo_mes
from sp_cuenta c
inner join sp_persona p on c.id_persona = p.id_persona
inner join sp_compra_plan cp on c.id_cuenta = cp.id_cuenta
inner join sp_tipo_plan_entrenamiento tp on cp.id_tipo_plan_entrenamiento = tp.id_tipo_plan_entrenamiento
inner join sp_plan_comida t on tp.id_plan_comida = t.id_plan_comida
inner join sp_servicio_comida s on t.id_servicio_comida = s.id_servicio_comida
where s.id_cuenta = 1;

-- Hacer una consulta para ver los planes de entrenador adquiridos por una persona segun el id del entrenador
select c.id_cuenta, p.nombres, p.apellidos, t.cantidad_meses, t.costo
from sp_cuenta c
inner join sp_persona p on c.id_persona = p.id_persona
inner join sp_compra_plan cp on c.id_cuenta = cp.id_cuenta
inner join sp_tipo_plan_entrenamiento tp on cp.id_tipo_plan_entrenamiento = tp.id_tipo_plan_entrenamiento
inner join sp_plan_entrenador t on tp.id_plan_entrenador = t.id_plan_entrenador
inner join sp_entrenador s on t.id_entrenador = s.id_entrenador
where s.id_cuenta = 2;

-- ver el historial de planes adquiridos por una persona segun su id en entrenamientos
select c.nombres, c.apellidos, t.cantidad_meses, t.costo, cp.fecha_compra, cp.fecha_fin
from sp_cuenta cu
inner join sp_persona c on cu.id_persona = c.id_persona
inner join sp_compra_plan cp on cu.id_cuenta = cp.id_cuenta
inner join sp_tipo_plan_entrenamiento tp on cp.id_tipo_plan_entrenamiento = tp.id_tipo_plan_entrenamiento
inner join sp_plan_lugar_entrenamiento t on tp.id_plan_lugar_entrenamiento = t.id_plan_lugar_entrenamiento
inner join sp_lugar_entrenamiento_sucursal s on t.id_lugar_entrenamiento_sucursal = s.id_lugar_entrenamiento_sucursal
where cu.id_cuenta = 5
and s.id_cuenta=2;

-- ver el historial de planes adquiridos por una persona segun su id en comida
select c.nombres, c.apellidos, t.costo_mes, t.nombre_plan, cp.fecha_compra, cp.fecha_fin
from sp_cuenta cu
inner join sp_persona c on cu.id_persona = c.id_persona
inner join sp_compra_plan cp on cu.id_cuenta = cp.id_cuenta
inner join sp_tipo_plan_entrenamiento tp on cp.id_tipo_plan_entrenamiento = tp.id_tipo_plan_entrenamiento
inner join sp_plan_comida t on tp.id_plan_comida = t.id_plan_comida
inner join sp_servicio_comida s on t.id_servicio_comida = s.id_servicio_comida
where cu.id_cuenta = 5
and s.id_cuenta=1;

-- ver el historial de planes adquiridos por una persona segun su id en entrenador
select c.nombres, c.apellidos, t.cantidad_meses, t.costo, cp.fecha_compra, cp.fecha_fin
from sp_cuenta cu
inner join sp_persona c on cu.id_persona = c.id_persona
inner join sp_compra_plan cp on cu.id_cuenta = cp.id_cuenta
inner join sp_tipo_plan_entrenamiento tp on cp.id_tipo_plan_entrenamiento = tp.id_tipo_plan_entrenamiento
inner join sp_plan_entrenador t on tp.id_plan_entrenador = t.id_plan_entrenador
inner join sp_entrenador s on t.id_entrenador = s.id_entrenador
where cu.id_cuenta = 5
and s.id_cuenta=2;

-- ver planes de entrenamiento de un lugar de entrenamiento segun su id
select t.cantidad_meses, t.costo
from sp_plan_lugar_entrenamiento t
inner join sp_lugar_entrenamiento_sucursal s on t.id_lugar_entrenamiento_sucursal = s.id_lugar_entrenamiento_sucursal
where s.id_cuenta = 2;

-- ver planes de comida de un servicio de comida segun su id
select t.nombre_plan, t.costo_mes, t.descripcion
from sp_plan_comida t
inner join sp_servicio_comida s on t.id_servicio_comida = s.id_servicio_comida
where s.id_cuenta = 1;

-- ver planes de entrenador de un entrenador segun su id
select t.cantidad_meses, t.costo
from sp_plan_entrenador t
inner join sp_entrenador s on t.id_entrenador = s.id_entrenador
where s.id_cuenta = 2;




-- consulta para ver el lugar de entrenamiento a partir del id de la cuenta de la sucusal
select s.id_lugar_entrenamiento_sucursal,sle.nombre_lugar, sle.logo_lugar, s.direccion
from sp_lugar_entrenamiento_sucursal s
inner join sp_lugar_entrenamiento sle on s.id_lugar_entrenamiento = sle.id_lugar_entrenamiento
where s.id_cuenta = 2;

-- la anterior consulta en base a sp_lugar_entrenamiento
select le.id_lugar_entrenamiento, le.nombre_lugar, le.logo_lugar
from sp_lugar_entrenamiento le
inner join sp_lugar_entrenamiento_sucursal sles on le.id_lugar_entrenamiento = sles.id_lugar_entrenamiento
where sles.id_cuenta = 2;


-- consulta para ver el servicio de comida a partir del id de la cuenta de la sucusal
select s.nombre_lugar, s.logo, s.direccion
from sp_servicio_comida s
where s.id_cuenta = 1;

-- consulta para ver el entrenador a partir del id de la cuenta de la sucusal
select p.nombres, p.apellidos, s.foto_entrenador, c.correo
from sp_entrenador s
inner join sp_cuenta c on s.id_cuenta = c.id_cuenta
inner join sp_persona p on c.id_persona = p.id_persona
where s.id_cuenta = 2;


--prueba
SELECT id_lugar_entrenamiento
FROM
    sp_lugar_entrenamiento_sucursal
WHERE
        id_cuenta = 2;










