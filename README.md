Alquileres:
Es una aplicación que permite gestionar propiedades en alquiler, inquilinos y contratos.
El backend de este proyecto está desarrollado con Spring Boot y MySQL, brindando una base sólida para la gestión
de datos de alquileres de manera eficiente y segura.

Características principales:
-Gestión de propiedades: Alta, baja y modificación de propiedades.
-Gestión de inquilinos: Registro y actualización de información de los inquilinos.
-Control de contratos: Creación y seguimiento de contratos de alquiler.
-Historial de pagos: Registro de pagos realizados por los inquilinos.

Tecnologías utilizadas
-Framework: Spring Boot
-Base de datos: MySQL
-ORM: Hibernate (JPA)
-Gestor de dependencias: Maven

Estructura del Proyecto
El proyecto sigue una arquitectura MVC (Modelo-Vista-Controlador) y está organizado de la siguiente manera:
-Controllers: Manejan las solicitudes HTTP y procesan las respuestas.
-Services: Contienen la lógica de negocio.
-Repositories: Gestionan la interacción con la base de datos.
-Entities: Definen las clases que representan las tablas de la base de datos.

Instalación y configuración
Tener instalado:
-JDK 11 o superior.
-MySQL.

Configuración del backend
application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/alquileres
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true 

Ejecuta la aplicación:
mvn spring-boot:run

Uso
Realiza solicitudes HTTP a los endpoints correspondientes para gestionar propiedades, inquilinos y contratos.
Integra el backend con un frontend o cliente REST (como Postman) para interactuar con las funcionalidades del sistema.
Endpoints principales

Propiedades:

-GET /api/propiedades - Listar todas las propiedades.

-POST /api/propiedades - Crear una nueva propiedad.

-PUT /api/propiedades/{id} - Actualizar una propiedad.

-DELETE /api/propiedades/{id} - Eliminar una propiedad.

Inquilinos:

-GET /api/inquilinos - Listar todos los inquilinos.

-POST /api/inquilinos - Registrar un nuevo inquilino.

-PUT /api/inquilinos/{id} - Actualizar información de un inquilino.

-DELETE /api/inquilinos/{id} - Eliminar un inquilino.


Contratos:

-GET /api/contratos - Listar todos los contratos.

-POST /api/contratos - Crear un nuevo contrato.

-PUT /api/contratos/{id} - Actualizar un contrato.

-DELETE /api/contratos/{id} - Eliminar un contrato.
