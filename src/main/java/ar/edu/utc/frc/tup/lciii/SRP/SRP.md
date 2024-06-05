<div align="center">

# Single Responsibility principle


Este principio indica que una **clase, interfaz o modulo** debe tener una **unica responsabilidad.**
eso quiere decir que una clase no debe de servir para dos acciones diferentes.

---

# Registro de Usuarios

Este proyecto trata sobre el registro de usuarios en un sistema. La funcionalidad principal es permitir que los usuarios se registren proporcionando un nombre de usuario y una contraseña. El sistema verifica si el nombre de usuario ya está en uso y, si no lo está, registra al usuario en el sistema.

## Clases y Responsabilidades

### [User](src/main/java/ar/edu/utn/frc/tup/lciii/User.java)

La clase `User` representa la información de un usuario en el sistema. Contiene los campos de nombre de usuario y contraseña, y proporciona métodos para acceder y establecer estos valores.

### [UserInteraction](src/main/java/ar/edu/utn/frc/tup/lciii/UserInteraction.java)
La clase UserInteraction maneja la interacción con el usuario para el proceso de registro. Utiliza el UserValidator para verificar si un usuario ya está registrado y el UserRepository para guardar nuevos usuarios en el sistema.

### [UserValidator](src/main/java/ar/edu/utn/frc/tup/lciii/UserValidator.java)

La clase `UserValidator` se encarga de validar si un nombre de usuario ya está en uso en el sistema. Utiliza el `UserRepository` para acceder a la lista de usuarios y verificar si el nombre de usuario ya está presente.

### [UserRepository](src/main/java/ar/edu/utn/frc/tup/lciii/UserRepository.java)

La clase `UserRepository` maneja la carga y listado de usuarios desde un archivo de datos. Utiliza los hijose del `FileHandler` para acceder al archivo y leer/escribir los datos de los usuarios. Proporciona métodos para guardar nuevos usuarios y obtener la lista de todos los usuarios registrados.

### [FileHandler](src/main/java/ar/edu/utn/frc/tup/lciii/FileHandler.java)

El `FileHandler` es una abstraccion del acceso del txt.

### [FileHandlerReader](src/main/java/ar/edu/utn/frc/tup/lciii/FileHandlerReader.java)

El `FileHandlerReader` se encarga de acceder y leer el txt.

### [FileHandlerWriter](src/main/java/ar/edu/utn/frc/tup/lciii/FileHandlerWriter.java)

El `FileHandlerWriter` se encarga de acceder y escribir sobre el txt

### [Users.Txt](src/main/java/ar/edu/utn/frc/tup/lciii/Users.txt)

es un archivo de texto plano donde se almacenan los datos de los usuarios registrados en el sistema. Cada línea del archivo representa un usuario y contiene su información, como el nombre de usuario y la contraseña, separados por un delimitador, como una coma.

### [Main](src/main/java/ar/edu/utn/frc/tup/lciii/Main.java)

La clase `Main` es el punto de entrada del programa. Se encarga de coordinar las operaciones de registro de usuarios. Utiliza el `UserValidator` para verificar si un usuario ya está registrado, y el `UserRepository` para guardar nuevos usuarios en el sistema.

## Principio de Responsabilidad Única
Cada clase en este proyecto sigue el principio de responsabilidad única, lo que significa que cada clase tiene una única responsabilidad bien definida:

- La clase `User` se encarga únicamente de representar la información de un usuario.
- La clase `UserInteraction` maneja la interacción con el usuario para el proceso de registro.
- La clase `UserValidator` tiene la responsabilidad de validar si un usuario ya está registrado.
- La clase `UserRepository` maneja la carga y listado de usuarios.
- El `FileHandler` es una abstraccion de el acceso del txt.
- El `FileHandlerReader` se encarga de acceder y leer el txt.
- El `FileHandlerWriter` se encarga de acceder y escribir sobre el txt

- La clase `Main` coordina las operaciones de registro de usuarios, pero delega las responsabilidades específicas a otras clases.

Este diseño facilita la modularidad, la mantenibilidad y la extensibilidad del sistema, ya que cada clase tiene una única razón para cambiar y es fácil de entender y modificar por separado.


</div>