#!/bin/bash

set -e

VERSION=$1

if [ -z "$VERSION" ]; then
    VERSION="1.0.0"
fi

echo "======================================"
echo " DESPLIEGUE EN AMBIENTE DE STAGING"
echo "======================================"

mkdir -p deploy/staging/current
mkdir -p deploy/staging/backup

if [ -f deploy/staging/current/app.jar ]; then
    echo "Guardando version actual como respaldo..."

    cp deploy/staging/current/app.jar \
       deploy/staging/backup/app.jar

    if [ -f deploy/staging/current/version.txt ]; then
        cp deploy/staging/current/version.txt \
           deploy/staging/backup/version.txt
    fi
fi

echo "Desplegando version $VERSION..."

cp target/inventario-automatizacion-1.0.0.jar \
   deploy/staging/current/app.jar

echo "$VERSION" > deploy/staging/current/version.txt

echo "Despliegue completado correctamente."
echo "Version activa: $VERSION"