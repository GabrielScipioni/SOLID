<div align="center">

# Liskov Substitution Principle (LSP)

El **Principio de Sustitución de Liskov** establece que:
### Una clase derivada debe ser sustituible por su clase base
Esto significa que los objetos de una clase derivada deben poder reemplazar a los objetos de su clase base sin alterar el comportamiento correcto del programa. En otras palabras, si S es una subclase de T, los objetos de T deben poder ser reemplazados por objetos de S sin que el usuario del programa se dé cuenta.

El LSP es uno de los principios más importantes en la programación orientada a objetos y es clave para garantizar la solidez y la extensibilidad del código.

---

para demostrarlo tendremos diferentes clases
concretas: `Cuadrado`, `Rectangulo`, `TrianguloRectangulo`. A las que deberemos sacarles él `Area` y su `Perimetro`.
El problema es que el día de mañana yo quiero agregar nuevas figuras geometricas. Debere de abstraerme para esperar una clase abstracta que abarque todos estos objetos, de ahi nace la abstraccion `Forma` que implementa los metodos de Área y Perimetro.

De esta manera si quiero añadir Paralelogramos lo unico que deberia hacer es que la clase herede de Forma para luego en el Main poder utilizar sus metodos 

</div>