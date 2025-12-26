# CRUD en Java con Swing y MySQL

Aplicación de escritorio desarrollada en **Java** que implementa un **CRUD basico (Crear, Leer, Actualizar y Eliminar)** de usuarios, usando **Swing** para la interfaz gráfica y **MySQL** como base de datos.

## Funcionalidades

* Agregar usuarios
* Visualizar usuarios en una tabla
* Actualizar información de usuarios
* Eliminar usuarios
* Búsqueda por ID
* Ordenamiento de tabla
* Interfaz gráfica personalizada con paneles y botones animados

## Interfaz

El sistema cuenta con un menú lateral que permite navegar entre las opciones:

* Agregar
* Ver
* Actualizar
* Borrar
* Salir

Los paneles incluyen formularios y tablas para gestionar los registros de usuarios de forma visual.


## Base de datos

Tabla usada:

```sql
CREATE TABLE usuario(
  id_usuario INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  apellidoPaterno VARCHAR(100) NOT NULL,
  apellidoMaterno VARCHAR(100) NOT NULL,
  ocupacion VARCHAR(100) NOT NULL,
  correo VARCHAR(100) NOT NULL,
  telefono INT UNSIGNED NOT NULL
);
```

⚠️ Configura tus credenciales en `ConexionBD.java`.

## Tecnologías usadas

* Java SE 24
* Java Swing
* JDBC
* MySQL
* NetBeans IDE

## Ejecución

1. Clona el repositorio:

   ```bash
   git clone https://github.com/Erik7746/CRUD-in-java.git
   ```
2. Abre el proyecto en **NetBeans**
3. Configura la conexión a la base de datos
4. Ejecuta `VentanaPrincipal.java` 

En la carpeta `dist` se encuentra el `.jar` para su ejecucion directa

## Objetivo

Proyecto académico para practicar:

* Programación orientada a objetos
* Interfaces gráficas en Java
* Conexión a bases de datos
* Operaciones CRUD

## Licencia

Uso libre con fines educativos.
