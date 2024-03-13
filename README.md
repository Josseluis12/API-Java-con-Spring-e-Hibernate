# API de Estudiantes con Spring y Hibernate

Esta API es un sistema básico para gestionar información de estudiantes. Está desarrollada utilizando Spring Framework y Hibernate para interactuar con una base de datos relacional.

## Funcionalidades

La API ofrece las siguientes funcionalidades básicas:

### 1. Obtener todos los estudiantes

Endpoint: `GET /estudiantes`

Este endpoint devuelve todos los estudiantes almacenados en la base de datos.

### 2. Obtener un estudiante por su ID

Endpoint: `GET /estudiantes/{id}`

Devuelve la información de un estudiante específico según su ID.

### 3. Agregar un nuevo estudiante

Endpoint: `POST /estudiantes`

Permite agregar un nuevo estudiante a la base de datos. Se deben proporcionar los datos del estudiante en el cuerpo de la solicitud en formato JSON.

### 4. Actualizar la información de un estudiante

Endpoint: `PUT /estudiantes/{id}`

Permite actualizar la información de un estudiante existente según su ID. Se deben proporcionar los nuevos datos del estudiante en el cuerpo de la solicitud en formato JSON.

### 5. Eliminar un estudiante

Endpoint: `DELETE /estudiantes/{id}`

Permite eliminar un estudiante de la base de datos según su ID.

## Uso con Postman

Puedes utilizar Postman para realizar solicitudes a esta API. Asegúrate de configurar correctamente la URL base y los endpoints mencionados anteriormente.

## Configuración de la base de datos

La configuración de la base de datos se encuentra en el archivo `application.properties` o `application.yml` del proyecto Spring. Asegúrate de configurar correctamente la URL, nombre de usuario y contraseña de tu base de datos relacional.

## Requisitos previos

- JDK (Java Development Kit)
- Maven
- IDE (IntelliJ IDEA, Eclipse, etc.)
- Base de datos relacional (MySQL, PostgreSQL, etc.)




https://github.com/Josseluis12/API-Java-con-Spring-e-Hibernate/assets/145585591/64574885-808f-406a-b3a2-88f433f0722f

