# **Examen02: CRUD de Órdenes de Venta con Spring Boot**

Este es un proyecto desarrollado con **Spring Boot** que implementa un **CRUD** (Crear(POST), Leer(GET), Actualizar(PUT) y Eliminar(DELETE)) para las entidades **OrdenVenta** y **DetalleOrdenVta**. El backend expone una serie de endpoints RESTful que permiten interactuar con las tablas relacionadas **OrdenVenta** y **DetalleOrdenVta** en una base de datos, utilizando **Spring Data JPA** y **Postman** para pruebas.

## **Descripción**

Este proyecto está diseñado para gestionar las órdenes de venta en una aplicación de venta de productos. Se pueden realizar las siguientes operaciones sobre las órdenes y sus detalles:

- **Órdenes de Venta**:
  - Listar todas las órdenes de venta.
  - Obtener una orden de venta por su número.
  - Crear una nueva orden de venta.
  - Actualizar una orden de venta existente.
  - Eliminar una orden de venta.

- **Detalles de la Orden de Venta**:
  - Listar los detalles de una orden de venta específica.
  - Crear un nuevo detalle de orden de venta.
  - Obtener un detalle de orden de venta específico.
  - Actualizar un detalle de orden de venta.
  - Eliminar un detalle de orden de venta.

## **Estructura del Proyecto**

src
├── main
│ ├── java
│ │ └── com
│ │ └── tecsup
│ │ └── examen02
│ │ ├── controller
│ │ │ ├── OrdenVentaController.java
│ │ │ └── DetalleOrdenVtaController.java
│ │ ├── dao
│ │ │ ├── OrdenVentaDAO.java
│ │ │ ├── OrdenVentaDAOImpl.java
│ │ │ ├── DetalleOrdenVtaDAO.java
│ │ │ └── DetalleOrdenVtaDAOImpl.java
│ │ ├── model
│ │ │ ├── OrdenVenta.java
│ │ │ └── DetalleOrdenVta.java
│ │ └── service
│ │ ├── OrdenVentaService.java
│ │ ├── OrdenVentaServiceImpl.java
│ │ ├── DetalleOrdenVtaService.java
│ │ └── DetalleOrdenVtaServiceImpl.java
│ └── resources
│ ├── application.properties
│ └── static
│ ├── css
│ │ └── styles.css
│ └── js
│ └── app.js
└── test
└── java
└── com
└── tecsup
└── examen02
└── Examen02ApplicationTests.java


## **Tecnologías Utilizadas**

- **Spring Boot**: Framework principal para construir aplicaciones basadas en Java.
- **Spring Web**: Para la creación de servicios RESTful.
- **Spring Data JPA**: Para la integración con la base de datos usando JPA.
- **Postman**: Herramienta para realizar pruebas a los endpoints de la API.

## **EndPoints del CRUD de Ordenes de Venta**

### **Órdenes de Venta**

1. **Listar todas las órdenes de venta**  
   - Método: `GET`  
   - URL: `http://localhost:8081/ordenes-venta`

2. **Obtener una orden de venta por ID**  
   - Método: `GET`  
   - URL: `http://localhost:8081/ordenes-venta/001`

3. **Crear una nueva orden de venta**  
   - Método: `POST`  
   - URL: `http://localhost:8081/ordenes-venta`  
   - Body:  
     ```json
     {
       "nroOrdenVta": "001",
       "fechaEmision": "2025-05-17",
       "motivo": "Pedido inicial",
       "situacion": "Pendiente"
     }
     ```

4. **Actualizar una orden de venta existente**  
   - Método: `PUT`  
   - URL: `http://localhost:8081/ordenes-venta/{nroOrdenVta}`  
   - Body:  
     ```json
     {
       "nroOrdenVta": "001",
       "fechaEmision": "2025-05-18",
       "motivo": "Pedido actualizado",
       "situacion": "Completada"
     }
     ```

5. **Eliminar una orden de venta**  
   - Método: `DELETE`  
   - URL: `http://localhost:8081/ordenes-venta/001`



- La API está diseñada para ser consumida por clientes frontend, y puedes integrar fácilmente un frontend estático con HTML y CSS.
- Si necesitas agregar validaciones o manejo de errores más robusto, puedes extender los controladores y servicios.
- La base de datos está configurada para usar H2 en memoria, pero puede ser configurada fácilmente para usar MySQL, PostgreSQL o cualquier otro sistema de bases de datos.

---
