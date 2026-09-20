#!/bin/bash

set -e

echo "======================================"
echo " EJECUTANDO ROLLBACK"
echo "======================================"

if [ ! -f deploy/staging/backup/app.jar ]; then
    echo "ERROR: No existe una version anterior para restaurar."
    exit 1
fi

cp deploy/staging/backup/app.jar \
   deploy/staging/current/app.jar

if [ -f deploy/staging/backup/version.txt ]; then
    cp deploy/staging/backup/version.txt \
       deploy/staging/current/version.txt
fi

echo "Rollback ejecutado correctamente."

if [ -f deploy/staging/current/version.txt ]; then
    echo "Version restaurada:"
    cat deploy/staging/current/version.txt
fi