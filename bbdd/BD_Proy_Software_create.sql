-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-15 02:37:02.279

-- tables
-- Table: h_sp_persona
CREATE TABLE h_sp_persona (
    id_h_persona int  NOT NULL,
    id_persona int  NOT NULL,
    nombres varchar(100)  NOT NULL,
    apellidos varchar(100)  NOT NULL,
    numero_telefono varchar(100)  NOT NULL,
    ciudad varchar(100)  NOT NULL,
    cat_persona_status varchar(100)  NOT NULL,
    fecha_nacimiento date  NOT NULL,
    altura int  NOT NULL,
    peso decimal(5,2)  NOT NULL,
    indice_masa_corporal int  NOT NULL,
    foto varchar(500)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host varchar(100)  NOT NULL,
    CONSTRAINT h_sp_persona_pk PRIMARY KEY (id_h_persona)
);

-- Table: sp_color
CREATE TABLE sp_color (
    id_color serial  NOT NULL,
    color Varchar(100)  NOT NULL,
    descripcion Varchar(200)  NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(500)  NOT NULL,
    CONSTRAINT sp_color_pk PRIMARY KEY (id_color)
);

-- Table: sp_compra_plan
CREATE TABLE sp_compra_plan (
    id_compra_plan serial  NOT NULL,
    id_tipo_plan_entrenamiento int  NOT NULL,
    id_cuenta int  NOT NULL,
    costo_plan money  NOT NULL,
    detalle_comida Varchar(100)  NULL,
    fecha_compra date  NOT NULL,
    fecha_fin date  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_compra_plan_pk PRIMARY KEY (id_compra_plan)
);

-- Table: sp_configuracion
CREATE TABLE sp_configuracion (
    id_configuracion Serial  NOT NULL,
    id_cuenta int  NOT NULL,
    estado_notificacion boolean  NOT NULL,
    estado_anuncios boolean  NOT NULL,
    estado_mensajes boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_configuracion_pk PRIMARY KEY (id_configuracion)
);

-- Table: sp_cuenta
CREATE TABLE sp_cuenta (
    id_cuenta Serial  NOT NULL,
    id_persona int  NOT NULL,
    id_deporte int  NULL,
    correo Varchar(200)  NOT NULL,
    contrasenia Varchar(200)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_cuenta_pk PRIMARY KEY (id_cuenta)
);

-- Table: sp_cuenta_grupos
CREATE TABLE sp_cuenta_grupos (
    id_cuenta_grupos Serial  NOT NULL,
    id_cuenta int  NOT NULL,
    id_grupos int  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_cuenta_grupos_pk PRIMARY KEY (id_cuenta_grupos)
);

-- Table: sp_cuenta_notificaciones
CREATE TABLE sp_cuenta_notificaciones (
    id_cuenta_notificaciones Serial  NOT NULL,
    id_cuenta int  NOT NULL,
    id_notificacion int  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_cuenta_notificaciones_pk PRIMARY KEY (id_cuenta_notificaciones)
);

-- Table: sp_deporte
CREATE TABLE sp_deporte (
    id_deporte serial  NOT NULL,
    deporte varchar(100)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_deporte_pk PRIMARY KEY (id_deporte)
);

-- Table: sp_entrenador
CREATE TABLE sp_entrenador (
    id_entrenador serial  NOT NULL,
    id_cuenta int  NOT NULL,
    NIT Varchar(100)  NOT NULL,
    correo Varchar(200)  NOT NULL,
    foto_entrenador Varchar(500)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_entrenador_pk PRIMARY KEY (id_entrenador)
);

-- Table: sp_grupo_roles
CREATE TABLE sp_grupo_roles (
    id_grupo_roles Serial  NOT NULL,
    id_grupos int  NOT NULL,
    id_roles int  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_grupo_roles_pk PRIMARY KEY (id_grupo_roles)
);

-- Table: sp_grupos
CREATE TABLE sp_grupos (
    id_grupos Serial  NOT NULL,
    grupo Varchar(50)  NOT NULL,
    descripcion Varchar(100)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_grupos_pk PRIMARY KEY (id_grupos)
);

-- Table: sp_lugar_entrenamiento
CREATE TABLE sp_lugar_entrenamiento (
    id_lugar_entrenamiento serial  NOT NULL,
    nombre_lugar Varchar(100)  NOT NULL,
    nombre_propietario Varchar(100)  NOT NULL,
    apellido_propietario Varchar(100)  NOT NULL,
    correo Varchar(100)  NOT NULL,
    NIT Varchar(100)  NOT NULL,
    logo_lugar varchar(500)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_lugar_entrenamiento_pk PRIMARY KEY (id_lugar_entrenamiento)
);

-- Table: sp_lugar_entrenamiento_sucursal
CREATE TABLE sp_lugar_entrenamiento_sucursal (
    id_lugar_entrenamiento_sucursal serial  NOT NULL,
    id_lugar_entrenamiento int  NOT NULL,
    id_cuenta int  NOT NULL,
    nombre_encargado Varchar(100)  NOT NULL,
    apellido_encargado Varchar(100)  NOT NULL,
    telefono_sucursal Varchar(100)  NOT NULL,
    direccion Varchar(100)  NOT NULL,
    latitud decimal(12,9)  NOT NULL,
    longitud decimal(12,9)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_lugar_entrenamiento_sucursal_pk PRIMARY KEY (id_lugar_entrenamiento_sucursal)
);

-- Table: sp_notificaciones
CREATE TABLE sp_notificaciones (
    id_notificacion Serial  NOT NULL,
    descripcion varchar(200)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_notificaciones_pk PRIMARY KEY (id_notificacion)
);

-- Table: sp_oferta_cuenta
CREATE TABLE sp_oferta_cuenta (
    id_oferta_cuenta Serial  NOT NULL,
    id_cuenta int  NOT NULL,
    id_oferta_producto int  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_oferta_cuenta_pk PRIMARY KEY (id_oferta_cuenta)
);

-- Table: sp_oferta_producto
CREATE TABLE sp_oferta_producto (
    id_oferta_producto Serial  NOT NULL,
    id_ofertas int  NOT NULL,
    id_producto int  NOT NULL,
    id_tienda int  NOT NULL,
    precio_oferta money  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_oferta_producto_pk PRIMARY KEY (id_oferta_producto)
);

-- Table: sp_ofertas
CREATE TABLE sp_ofertas (
    id_ofertas Serial  NOT NULL,
    descripcion varchar(200)  NOT NULL,
    fecha_inicio Date  NOT NULL,
    fecha_fin Date  NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(500)  NOT NULL,
    CONSTRAINT sp_ofertas_pk PRIMARY KEY (id_ofertas)
);

-- Table: sp_persona
CREATE TABLE sp_persona (
    id_persona Serial  NOT NULL,
    nombres varchar(100)  NOT NULL,
    apellidos varchar(100)  NOT NULL,
    genero boolean  NULL,
    numero_telefono varchar(100)  NOT NULL,
    ciudad varchar(100)  NULL,
    cat_persona_status varchar(100)  NULL,
    fecha_nacimiento date  NULL,
    altura decimal(5,2)  NULL,
    peso decimal(5,2)  NULL,
    indice_masa_corporal int  NULL,
    foto varchar(500)  NULL,
    estado boolean  NOT NULL,
    tx_correo varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host varchar(100)  NOT NULL,
    CONSTRAINT sp_persona_pk PRIMARY KEY (id_persona)
);

-- Table: sp_plan_comida
CREATE TABLE sp_plan_comida (
    id_plan_comida serial  NOT NULL,
    id_servicio_comida int  NOT NULL,
    nombre_plan Varchar(100)  NOT NULL,
    descripcion Varchar(200)  NOT NULL,
    costo_mes money  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_plan_comida_pk PRIMARY KEY (id_plan_comida)
);

-- Table: sp_plan_entrenador
CREATE TABLE sp_plan_entrenador (
    id_plan_entrenador serial  NOT NULL,
    id_entrenador int  NOT NULL,
    costo money  NOT NULL,
    cantidad_meses int  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_plan_entrenador_pk PRIMARY KEY (id_plan_entrenador)
);

-- Table: sp_plan_lugar_entrenamiento
CREATE TABLE sp_plan_lugar_entrenamiento (
    id_plan_lugar_entrenamiento serial  NOT NULL,
    id_lugar_entrenamiento_sucursal int  NOT NULL,
    costo money  NOT NULL,
    cantidad_meses int  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_plan_lugar_entrenamiento_pk PRIMARY KEY (id_plan_lugar_entrenamiento)
);

-- Table: sp_producto
CREATE TABLE sp_producto (
    id_producto serial  NOT NULL,
    id_talla int  NULL,
    id_color int  NULL,
    nombre Varchar(100)  NOT NULL,
    descripcion Varchar(200)  NULL,
    imagen Varchar(500)  NOT NULL,
    marca Varchar(100)  NOT NULL,
    genero boolean  NULL,
    peso decimal(5,2)  NULL,
    amortiguacion int  NULL,
    pisada int  NULL,
    numero_de_vistas int  NULL,
    numero_de_comparaciones int  NULL,
    tipo_producto Varchar(50)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(500)  NOT NULL,
    CONSTRAINT sp_producto_pk PRIMARY KEY (id_producto)
);

-- Table: sp_producto_cuenta
CREATE TABLE sp_producto_cuenta (
    id_producto_cuenta Serial  NOT NULL,
    id_tienda_producto int  NOT NULL,
    id_cuenta int  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_producto_cuenta_pk PRIMARY KEY (id_producto_cuenta)
);

-- Table: sp_producto_tienda
CREATE TABLE sp_producto_tienda (
    id_tienda_producto serial  NOT NULL,
    id_producto int  NOT NULL,
    id_tienda int  NOT NULL,
    precio money  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_producto_tienda_pk PRIMARY KEY (id_tienda_producto)
);

-- Table: sp_roles
CREATE TABLE sp_roles (
    id_roles Serial  NOT NULL,
    rol Varchar(50)  NOT NULL,
    descripcion Varchar(100)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_roles_pk PRIMARY KEY (id_roles)
);

-- Table: sp_servicio_comida
CREATE TABLE sp_servicio_comida (
    id_servicio_comida serial  NOT NULL,
    id_cuenta int  NOT NULL,
    nombre_lugar Varchar(100)  NOT NULL,
    nombre_propietario Varchar(100)  NOT NULL,
    apellido_propietario Varchar(100)  NOT NULL,
    telefono Varchar(100)  NOT NULL,
    correo Varchar(200)  NOT NULL,
    NIT Varchar(100)  NOT NULL,
    logo Varchar(200)  NOT NULL,
    latitud decimal(12,9)  NOT NULL,
    direccion Varchar(100)  NOT NULL,
    longitud decimal(12,9)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_servicio_comida_pk PRIMARY KEY (id_servicio_comida)
);

-- Table: sp_tallas
CREATE TABLE sp_tallas (
    id_talla serial  NOT NULL,
    talla Varchar(100)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(500)  NOT NULL,
    CONSTRAINT sp_tallas_pk PRIMARY KEY (id_talla)
);

-- Table: sp_tienda
CREATE TABLE sp_tienda (
    id_tienda serial  NOT NULL,
    id_cuenta int  NOT NULL,
    nombre_tienda Varchar(100)  NOT NULL,
    nombre_propietario Varchar(100)  NOT NULL,
    apellido_propietario Varchar(100)  NOT NULL,
    foto_tienda Varchar(500)  NOT NULL,
    correo Varchar(200)  NOT NULL,
    telefono Varchar(100)  NOT NULL,
    NIT Varchar(200)  NOT NULL,
    direccion Varchar(100)  NOT NULL,
    latitud decimal(12,9)  NOT NULL,
    longitud decimal(12,9)  NOT NULL,
    estado boolean  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_tienda_pk PRIMARY KEY (id_tienda)
);

-- Table: sp_tipo_plan_entrenamiento
CREATE TABLE sp_tipo_plan_entrenamiento (
    id_tipo_plan_entrenamiento Serial  NOT NULL,
    id_plan_comida int  NULL,
    id_plan_lugar_entrenamiento int  NULL,
    id_plan_entrenador int  NULL,
    duracion int  NOT NULL,
    estado boolean  NOT NULL,
    tipo_plan Varchar(100)  NOT NULL,
    tx_correo Varchar(100)  NOT NULL,
    tx_fecha timestamp  NOT NULL,
    tx_host Varchar(100)  NOT NULL,
    CONSTRAINT sp_tipo_plan_entrenamiento_pk PRIMARY KEY (id_tipo_plan_entrenamiento)
);

-- foreign keys
-- Reference: sp_compra_plan_sp_cuenta (table: sp_compra_plan)
ALTER TABLE sp_compra_plan ADD CONSTRAINT sp_compra_plan_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_compra_plan_sp_plan_entrenamiento (table: sp_compra_plan)
ALTER TABLE sp_compra_plan ADD CONSTRAINT sp_compra_plan_sp_plan_entrenamiento
    FOREIGN KEY (id_tipo_plan_entrenamiento)
    REFERENCES sp_tipo_plan_entrenamiento (id_tipo_plan_entrenamiento)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_configuracion_sp_cuenta (table: sp_configuracion)
ALTER TABLE sp_configuracion ADD CONSTRAINT sp_configuracion_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_cuenta_grupos_sp_cuenta (table: sp_cuenta_grupos)
ALTER TABLE sp_cuenta_grupos ADD CONSTRAINT sp_cuenta_grupos_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_cuenta_grupos_sp_grupos (table: sp_cuenta_grupos)
ALTER TABLE sp_cuenta_grupos ADD CONSTRAINT sp_cuenta_grupos_sp_grupos
    FOREIGN KEY (id_grupos)
    REFERENCES sp_grupos (id_grupos)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_cuenta_notificaciones_sp_cuenta (table: sp_cuenta_notificaciones)
ALTER TABLE sp_cuenta_notificaciones ADD CONSTRAINT sp_cuenta_notificaciones_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_cuenta_notificaciones_sp_notificaciones (table: sp_cuenta_notificaciones)
ALTER TABLE sp_cuenta_notificaciones ADD CONSTRAINT sp_cuenta_notificaciones_sp_notificaciones
    FOREIGN KEY (id_notificacion)
    REFERENCES sp_notificaciones (id_notificacion)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_cuenta_sp_deporte (table: sp_cuenta)
ALTER TABLE sp_cuenta ADD CONSTRAINT sp_cuenta_sp_deporte
    FOREIGN KEY (id_deporte)
    REFERENCES sp_deporte (id_deporte)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_cuenta_sp_persona (table: sp_cuenta)
ALTER TABLE sp_cuenta ADD CONSTRAINT sp_cuenta_sp_persona
    FOREIGN KEY (id_persona)
    REFERENCES sp_persona (id_persona)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_entrenador_sp_cuenta (table: sp_entrenador)
ALTER TABLE sp_entrenador ADD CONSTRAINT sp_entrenador_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_grupo_roles_sp_grupos (table: sp_grupo_roles)
ALTER TABLE sp_grupo_roles ADD CONSTRAINT sp_grupo_roles_sp_grupos
    FOREIGN KEY (id_grupos)
    REFERENCES sp_grupos (id_grupos)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_grupo_roles_sp_roles (table: sp_grupo_roles)
ALTER TABLE sp_grupo_roles ADD CONSTRAINT sp_grupo_roles_sp_roles
    FOREIGN KEY (id_roles)
    REFERENCES sp_roles (id_roles)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_lugar_entrenamiento_sucursal_sp_cuenta (table: sp_lugar_entrenamiento_sucursal)
ALTER TABLE sp_lugar_entrenamiento_sucursal ADD CONSTRAINT sp_lugar_entrenamiento_sucursal_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_lugar_entrenamiento_sucursal_sp_lugar_entrenamiento (table: sp_lugar_entrenamiento_sucursal)
ALTER TABLE sp_lugar_entrenamiento_sucursal ADD CONSTRAINT sp_lugar_entrenamiento_sucursal_sp_lugar_entrenamiento
    FOREIGN KEY (id_lugar_entrenamiento)
    REFERENCES sp_lugar_entrenamiento (id_lugar_entrenamiento)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_oferta_cuenta_sp_cuenta (table: sp_oferta_cuenta)
ALTER TABLE sp_oferta_cuenta ADD CONSTRAINT sp_oferta_cuenta_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_oferta_cuenta_sp_oferta_producto (table: sp_oferta_cuenta)
ALTER TABLE sp_oferta_cuenta ADD CONSTRAINT sp_oferta_cuenta_sp_oferta_producto
    FOREIGN KEY (id_oferta_producto)
    REFERENCES sp_oferta_producto (id_oferta_producto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_oferta_producto_sp_ofertas (table: sp_oferta_producto)
ALTER TABLE sp_oferta_producto ADD CONSTRAINT sp_oferta_producto_sp_ofertas
    FOREIGN KEY (id_ofertas)
    REFERENCES sp_ofertas (id_ofertas)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_oferta_producto_sp_producto (table: sp_oferta_producto)
ALTER TABLE sp_oferta_producto ADD CONSTRAINT sp_oferta_producto_sp_producto
    FOREIGN KEY (id_producto)
    REFERENCES sp_producto (id_producto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_oferta_producto_sp_tienda (table: sp_oferta_producto)
ALTER TABLE sp_oferta_producto ADD CONSTRAINT sp_oferta_producto_sp_tienda
    FOREIGN KEY (id_tienda)
    REFERENCES sp_tienda (id_tienda)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_plan_comida_sp_servicio_comida (table: sp_plan_comida)
ALTER TABLE sp_plan_comida ADD CONSTRAINT sp_plan_comida_sp_servicio_comida
    FOREIGN KEY (id_servicio_comida)
    REFERENCES sp_servicio_comida (id_servicio_comida)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_plan_entrenador_sp_entrenador (table: sp_plan_entrenador)
ALTER TABLE sp_plan_entrenador ADD CONSTRAINT sp_plan_entrenador_sp_entrenador
    FOREIGN KEY (id_entrenador)
    REFERENCES sp_entrenador (id_entrenador)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_plan_entrenamiento_sp_plan_comida (table: sp_tipo_plan_entrenamiento)
ALTER TABLE sp_tipo_plan_entrenamiento ADD CONSTRAINT sp_plan_entrenamiento_sp_plan_comida
    FOREIGN KEY (id_plan_comida)
    REFERENCES sp_plan_comida (id_plan_comida)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_plan_entrenamiento_sp_plan_lugar_entrenamiento (table: sp_tipo_plan_entrenamiento)
ALTER TABLE sp_tipo_plan_entrenamiento ADD CONSTRAINT sp_plan_entrenamiento_sp_plan_lugar_entrenamiento
    FOREIGN KEY (id_plan_lugar_entrenamiento)
    REFERENCES sp_plan_lugar_entrenamiento (id_plan_lugar_entrenamiento)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_plan_lugar_entrenamiento_sp_lugar_entrenamiento_sucursal (table: sp_plan_lugar_entrenamiento)
ALTER TABLE sp_plan_lugar_entrenamiento ADD CONSTRAINT sp_plan_lugar_entrenamiento_sp_lugar_entrenamiento_sucursal
    FOREIGN KEY (id_lugar_entrenamiento_sucursal)
    REFERENCES sp_lugar_entrenamiento_sucursal (id_lugar_entrenamiento_sucursal)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_producto_cuenta_sp_cuenta (table: sp_producto_cuenta)
ALTER TABLE sp_producto_cuenta ADD CONSTRAINT sp_producto_cuenta_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

DROP TABLE sp_tallas;

-- Reference: sp_producto_cuenta_sp_producto_tienda (table: sp_producto_cuenta)
ALTER TABLE sp_producto_cuenta ADD CONSTRAINT sp_producto_cuenta_sp_producto_tienda
    FOREIGN KEY (id_tienda_producto)
    REFERENCES sp_producto_tienda (id_tienda_producto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_producto_sp_color (table: sp_producto)
ALTER TABLE sp_producto ADD CONSTRAINT sp_producto_sp_color
    FOREIGN KEY (id_color)
    REFERENCES sp_color (id_color)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_producto_sp_tallas (table: sp_producto)
ALTER TABLE sp_producto ADD CONSTRAINT sp_producto_sp_tallas
    FOREIGN KEY (id_talla)
    REFERENCES sp_tallas (id_talla)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_producto_tienda_sp_producto (table: sp_producto_tienda)
ALTER TABLE sp_producto_tienda ADD CONSTRAINT sp_producto_tienda_sp_producto
    FOREIGN KEY (id_producto)
    REFERENCES sp_producto (id_producto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_producto_tienda_sp_tienda (table: sp_producto_tienda)
ALTER TABLE sp_producto_tienda ADD CONSTRAINT sp_producto_tienda_sp_tienda
    FOREIGN KEY (id_tienda)
    REFERENCES sp_tienda (id_tienda)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_servicio_comida_sp_cuenta (table: sp_servicio_comida)
ALTER TABLE sp_servicio_comida ADD CONSTRAINT sp_servicio_comida_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_tienda_sp_cuenta (table: sp_tienda)
ALTER TABLE sp_tienda ADD CONSTRAINT sp_tienda_sp_cuenta
    FOREIGN KEY (id_cuenta)
    REFERENCES sp_cuenta (id_cuenta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sp_tipo_plan_entrenamiento_sp_plan_entrenador (table: sp_tipo_plan_entrenamiento)
ALTER TABLE sp_tipo_plan_entrenamiento ADD CONSTRAINT sp_tipo_plan_entrenamiento_sp_plan_entrenador
    FOREIGN KEY (id_plan_entrenador)
    REFERENCES sp_plan_entrenador (id_plan_entrenador)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

