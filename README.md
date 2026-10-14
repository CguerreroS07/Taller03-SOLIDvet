# ClinicaVeterinaria

Proyecto Java Maven para practicar refactoring con principios SOLID en un taller colaborativo.

El sistema funciona desde el inicio, pero contiene violaciones intencionales de SRP, OCP, LSP, ISP y DIP. La idea es que cada integrante refactorice una zona del código sin romper la ejecución.

## Setup en 5 minutos


Compilar con Maven. Salida esperada:

```text
=== ClinicaVeterinaria funcionando ===
```

## Estructura del proyecto

```text
src/main/java/clinicaveterinaria/
├── Main.java
├── interfaces/
│   ├── IAnimal.java
│   ├── IBaseDatos.java
│   ├── IServicioClinica.java
│   ├── ITratamiento.java
│   └── IVeterinarioService.java
├── model/
│   ├── Mascota.java
│   ├── Veterinario.java
│   ├── Cita.java
│   ├── Tratamiento.java
│   ├── Factura.java
│   └── clases auxiliares para animales y enums
├── repository/
│   ├── BaseDatos.java
│   └── DirectoBaseDatos.java
└── service/
    ├── ReservaService.java
    ├── DiagnosticoService.java
    ├── FacturacionService.java
    ├── ReporteService.java
    └── servicios CRUD y clases con violaciones intencionales
```

## Trabajo del taller

- Integrante 1: refactorizar SRP.
- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.


## Integrante 1:

Preguntas de discusión:

- ¿Cuántas razones para cambiar tenía `Veterinario` antes del refactoring?


    La clase tenía al menos cinco razones para cambiar, ya que además de guardar los datos del modelo, realizaba tambien las operaciones de reservar citas, diagnosticar pacientes, facturar y generar reportes. 



- ¿Qué ganamos al separar modelo y servicios?


    Logramos cumplir con SRP, garantizando que el modelo Veterinario solo se dedique a la gestión de sus atributos. Y dejando que las clases de servicios se encarguen unicamente de sus comportamientos.

- ¿Qué clase debería cambiar si mañana cambia el formato del reporte?

    
    La unica clase que debe cambiar seria ReporteService, ya que esta asume toda la responsabilidad sobre la lógica y salida de los reportes tras el refactoring. 

## Integrante 2:
- ¿Por qué los condicionales repetidos hacen más caro el cambio?
    Porque la misma decision por tipa esta copiada en varios lugares. Cada cambio olbiga a encontrar y editar todo esos puntos. 
- ¿Qué pasaría si agregamos Odontologia como tratamiento?
    Se crea un oslo archivo nuevo, con sus cuatro reglas. No se toca ninguna clase existente.
- ¿Cuándo una interfaz ayuda a extender el sistema?
    Ayuda cuando hay varias variantes de un mismo comportamiento y el codigo que las usa no debe saber cual es cual.
## Integrante 3:

Preguntas de discusión:
- ¿Por qué lanzar UnsupportedOperationException puede ser señal de mal diseño?

    Porque indica que la subclase no puede cumpolir lo que promete la clase base. El código compila pero falla al ejecutarse

- ¿Qué contrato estaba prometiendo Animal?

    Prometía que todo animal podía volar, caminar y nadar y dada esa promesa lanzaba excepciones.

- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?

    Cada animal implementa únicamete los métodos que lógcamente es capaz de realizar.