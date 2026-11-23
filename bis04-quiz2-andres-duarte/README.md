# BIS04 - Quiz 2: La jerarquía de cuentas

Proyecto Java con las clases `Cuenta`, `CuentaAhorro`, `CuentaCorriente` y
`Asociado`, además de `DemoCuentas`, según las etapas 1 a 4 del material.

## Ejecutar

Desde la carpeta raíz:

```bash
javac -d build src/coopetica/modelo/*.java src/coopetica/presentacion/*.java
java -cp build coopetica.presentacion.DemoCuentas
```

## Salida esperada

```text
Ahorro retira 400000:    false
Corriente retira 200000: true
Ahorro 001 - asociado 118450236 - saldo 350000.0 - interes mensual 1313
Corriente 002 - asociado 118450236 - saldo -80000.0 - sobregiro 100000.0
a.equals(c): true
a.equals(b): false
```

## Antes de entregar

- Abra/importa el proyecto en NetBeans y ejecute `DemoCuentas`.
- Tome una captura real de la consola y guárdela como `captura.png`.
- Cree un repositorio privado con el nombre solicitado por el curso:
  `bis04-quiz2-apellido1-nombre`.
- Agregue al docente como colaborador.
- Haga al menos tres commits en momentos distintos y suba el código.
- Pegue únicamente el enlace del repositorio en el buzón.

**Nota:** `Asociado.java` aquí es una clase mínima para permitir compilar este
ejemplo independiente. Si ya tiene la clase `Asociado` desarrollada en la
Semana 8, mantenga la versión de su proyecto original.

## Descripción del proyecto

Este proyecto simula un sistema de cuentas bancarias.
Se implementan cuentas de ahorro y cuentas corrientes,
aplicando herencia, encapsulamiento y sobrescritura de métodos.

## Pruebas realizadas

- Se probó el retiro de dinero en cuentas de ahorro.
- Se probó el retiro de dinero en cuentas corrientes.
- Se verificó el método equals entre cuentas.
- Se comprobó el funcionamiento de la herencia.
