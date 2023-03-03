# Proyecto Piloto de Gradle con JaCoCo y SonarCloud

## Descripción
Aplicación Java de demostración basada en arquitectura por capas que administra productos y clientes.

## Tecnologias

    Java 11
    Gradle
    Lombok
    JUnit
    JaCoCo
    SonarCloud
    SonarLint
    Azure Pipelines IC
    Github


## Objetivos
1. Crear Test Unitarios hasta alcanzar cobertura 100%
2. Validar Código Limpio con Sonarlint y Refactorizar
3. Generación de reportes de cobertura con Gradle, JaCoCo y Sonar
4. Publicar resultados en Sonarcloud.
5. Ejecutar pipeline de Integración Continua en Azure Devops.

### Tareas del pipeline de Azure
1. Ejecutar pruebas unitarias
2. Publicar resultados en Test Plan de Azure
3. Construir el artefacto (Binario)
4. Validar Cobertura con JaCoCo
5. Validar Quality Gates con Sonar
6. Publicar los resultados en SonarCloud

Nota: El pipeline tiene apagado el modo trigger.


## Ejecutar proyecto

### Resultados con JaCoCo
    ./gradlew test
### Sonar
    ./gradlew sonar

### Resultados Sonarcloud
[Resultados](https://sonarcloud.io/organizations)






