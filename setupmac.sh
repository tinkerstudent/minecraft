#!/bin/sh

echo "Setting up minecraft forge on Mac"

echo "Running ./gradlew setupDecompWorkspace"

./gradlew setupDecompWorkspace

if [ "$?" != "0" ]; then
    echo "[Error] ./gradlew setupDecompWorkspace failed" 1>&2
    exit 1
fi

echo "Running ./gradlew eclipse"

./gradlew eclipse

if [ "$?" != "0" ]; then
    echo "[Error] ./gradlew eclipse failed" 1>&2
    exit 1
fi

echo "Setup Successful"


