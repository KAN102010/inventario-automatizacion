# Sistema de Inventario - Automatización de Pruebas

## Descripción del proyecto

Este proyecto fue desarrollado como parte del examen final de la asignatura Automatización de Pruebas.

El objetivo principal es implementar un proyecto Java administrado con Maven, incorporando control de versiones mediante Git, pruebas automatizadas y pipelines de integración y despliegue continuo.

La aplicación corresponde a un sistema básico de inventario que permite calcular el stock disponible después de realizar una venta.

## Tecnologías utilizadas

- Java 17
- Maven
- JUnit 5
- Git
- GitHub
- GitHub Actions
- Bash

## Estrategia de versionado

Para el proyecto se utilizó una estrategia Trunk-Based simplificada.

La rama principal es:

`main`

Para el desarrollo de nuevas funcionalidades se utilizó:

`feature/inventario`

Los cambios son desarrollados y probados en la rama de funcionalidad antes de ser incorporados a la rama principal.

## Estructura del proyecto

```text
inventario-automatizacion/
├── .github/
│   └── workflows/
│       ├── ci.yml
│       └── deployment.yml
├── scripts/
│   ├── acceptance-test.sh
│   ├── deploy.sh
│   └── rollback.sh
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
├── pom.xml
├── .gitignore
├── .gitattributes
└── README.md