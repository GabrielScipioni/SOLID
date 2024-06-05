<div align="center">

# Open - Closed principle


Este principio indica que una **clase** esta
### Abierta -> Extencion
### Cerrada -> Modificacion
esto quiere decir que esta _abierta_ agregar nuevas **funcionalidades** pero _cerrado_ para agregar estas funcionalidades **dentro de la clase**, de esta forma evitamos que el codigo se alargue, pero aún más importante, que el codigo en el que estemos trabajando no le afecte al usuario de forma significativa (no poder usar la app durante el proceso de modificacion).

---

en este proyecto veremos de manera simple un ejemplo del principio, armaremos una calculadora, tendra diferentes clases

- Calculadora
- Suma
- Resta
- Multiplicacion
- Divicion

para mejorar la ejemplificacion la clase Divicion no existira, y se debera crear, luego integrarla a la clase calculadora

</div>