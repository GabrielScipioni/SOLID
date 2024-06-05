<div align="center">

# Principio de Segregación de Interfaces (ISP)

El **Principio de Segregación de Interfaces** establece que:
### Los clientes no deberían estar forzados a depender de interfaces que no utilizan
Esto significa que una clase no debería estar obligada a implementar métodos que no necesita. En otras palabras, es mejor tener interfaces pequeñas y específicas en lugar de una sola interfaz grande y general.


---


Para demostrarlo, partimos de un proyecto con una sola interfaz llamada `IAve` que contenía métodos para `comer()`, `volar()` y `nadar()`. Sin embargo, las clases concretas `Loro` y `Paloma` no sabían nadar pero sí comer y volar, mientras que la clase `Pingüino` sabía comer y nadar pero no volar.

Para resolver este problema, se crearon diferentes interfaces específicas:

- `IAnimal`: con el método `comer()`
- `IAveVoladora`: con el método `volar()`
- `IAveNadadora`: con el método `nadar()`

De esta manera, cada clase concreta implementa solo las interfaces que necesita:

- `Loro` y `Paloma` implementan `IAnimal` e `IAveVoladora`.
- `Pingüino` implementa `IAnimal` e `IAveNadadora`.

Con este diseño, si se quieren agregar nuevas aves en el futuro, simplemente deben implementar las interfaces adecuadas sin verse obligadas a incluir métodos innecesarios.

</div>
