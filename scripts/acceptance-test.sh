#!/bin/bash

set -e

echo "======================================"
echo " PRUEBAS DE ACEPTACION"
echo "======================================"

RESULTADO=$(java -cp deploy/staging/current/app.jar \
    cl.iplacex.inventario.Main)

echo "$RESULTADO"

if echo "$RESULTADO" | grep -q "Stock disponible: 13"; then
    echo "Acceptance Test: APROBADO"
    exit 0
else
    echo "Acceptance Test: FALLIDO"
    exit 1
fi