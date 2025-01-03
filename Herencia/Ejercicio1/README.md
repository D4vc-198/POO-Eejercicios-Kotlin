# Ejercicio 1

## Descripción del ejercicio

### Paso 1: Crear la clase base
Define una clase `Vehiculo` que representa las características generales de un vehículo. La clase debe incluir las siguientes propiedades:

- `marca` (tipo `String`): La marca del vehículo.
- `modelo` (tipo `String`): El modelo del vehículo.
- `anio` (tipo `Int`): El año de fabricación del vehículo.

Además, incluye una función `mostrarDetalles` que imprime la información del vehículo en un formato legible.

### Paso 2: Crear una clase derivada
Define una `clase` Coche que herede de `Vehiculo` y agregue una nueva propiedad:

- `tipoCombustible` (tipo `String`): Especifica el tipo de combustible que utiliza el coche (por ejemplo, "Gasolina", "Diésel", "Eléctrico").

Sobrescribe el método `mostrarDetalles` en Coche para incluir la información del combustible junto con los detalles del vehículo.

### Paso 3: Crear y probar un objeto
En la función `main`, crea una instancia de la clase `Coche`, inicializa sus propiedades y llama al método `mostrarDetalles` para verificar el resultado.

### Resultado:
```bash
Marca: CHEVROLET
Modelo: Chevrolet Onix
Año: 2022
Combustible: Gasolina
```

> [!NOTE]
> [Puedes ver la solución del ejercicio aqui](solution.kt)
