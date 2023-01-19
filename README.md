# Proyecto Piloto de Gradle con JaCoCo y SonarCloud

1. Aplicación básica de Java basada en arquitectura por capas para probar la generación de reportes de cobertura con JaCoCo y Sonar , ademas publicar los resultados en la nube de Sonarqube.

2. Cuenta con pipelines de ejemplo para Integración Continua en Azure Devops. 

Tareas del pipeline 
   1. Ejecutar pruebas unitarias
   2. Publicar resultados en Test Plan de Azure
   3. Construir el artefacto (Binario)
   4. Validar Cobertua con JaCoCo
   5. Validar Quality Gates con Sonar
   6. Publicar los resultados en SonarCloud


## Ejecutar proyecto

### JaCoCo
    ./gradlew test
### Sonar
    ./gradlew sonar

### Resultados Sonarcloud
[Resultados](https://sonarcloud.io/organizations/piloto-gradle-jacoco)






