# Api-Spring-Swagger UI
Crud-SwaggerUI-SpringBoot.

Api de creación, eliminación, visualización de listado en un LIST de: Users. 

## Comenzando 🚀

git clone https://github.com/MichelleEspinoza/Api-spring-swagger3.git


### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_

```
-Eclipse Java EE IDE for Web Developers.(Desarrollo en: Version: Neon.2 Release (4.6.2))
-java version 1.8 o superior
```

### Instalación 🔧

_Importar como : Existing Maven proyects_

![image](https://user-images.githubusercontent.com/19162592/145286884-83312f1f-192c-4224-892d-c8519f97c385.png)


## Despliegue 📦

_Inicializar App_

![image](https://user-images.githubusercontent.com/19162592/145287630-63917eda-8aea-4dc1-aa8b-1d57377ee572.png)

_En caso de ERROR en clase main: Verificar que se cuente con JavaSE-1.8 en Libraries_
![image](https://user-images.githubusercontent.com/19162592/157557759-b86e7709-2e4a-486d-9094-2a518df20cbf.png)

_Ahora si, una vez inicializada la app, Dirigirse a la ruta_

```
http://localhost:8088/swagger-ui.html
```
![image](https://user-images.githubusercontent.com/19162592/145290053-2c38083a-8ae0-4c7d-9311-763e07957abf.png)

## Test 🧪

_POST:http://localhost:8088/api/add_

![image](https://user-images.githubusercontent.com/19162592/145290521-685863ab-494e-4f28-87e8-ff6e48e1309a.png)

_GET:http://localhost:8088/api/getUsers_

![image](https://user-images.githubusercontent.com/19162592/145290774-89c7b56d-d8b4-4002-b954-c1c28b7b60c1.png)

Postman ✉️

_POST:http://localhost:8088/api/add_
![image](https://user-images.githubusercontent.com/19162592/145292321-5d6d8bbc-8321-4a3b-93ce-5bfe7475c09a.png)


_GET:http://localhost:8088/api/getUsers_

![image](https://user-images.githubusercontent.com/19162592/145292575-6202ac8f-c954-4aa5-98b3-50bfab7ebd2c.png)

_DELETE:http://localhost:8088/api/delete/{id}_
![image](https://user-images.githubusercontent.com/19162592/145292904-a73b34f4-1827-4166-9c4a-6de300e6c603.png)

_PUT:http://localhost:8088/api/put_
![image](https://user-images.githubusercontent.com/19162592/145294261-6c14f506-c473-44ad-bb02-95e8b33d8989.png)


Workspace con test: https://go.postman.co/workspace/My-Workspace~b59d9eca-4714-4b09-8cce-966ac60096ca/collection/18589036-9bb55084-db0b-4de2-be49-95cfae2948e3

## Construido con 🛠️

* [Spring Boot 2.6.1](https://start.spring.io/) - El framework web usado
* [Java 1.8.0_161](https://www.oracle.com/mx/java/technologies/javase/javase8-archive-downloads.html) -Lenguaje usado
* [Neon.2 Release 4.6.2]-IDE usado
* [springdoc-openapi-ui 1.5.12](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui/1.5.12)- Documentación de API
* [Swagger-ui](https://swagger.io/specification/)-Notaciones para documentación de API
* [Postman](https://www.postman.com/downloads/) - Cliente HTTP 
* [Maven]() - Manejador de dependencias
* [apache 2.0](https://www.apachefriends.org/xampp-files/8.0.3/xampp-windows-x64-8.0.3-0-VS16-installer.exe) - Usado para servidor local HTTP



---
⌨️ por [MichelleEspinoza](https://github.com/MichelleEspinoza)

