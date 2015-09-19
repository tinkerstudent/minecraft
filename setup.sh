#!/bin/sh

echo "Setting up minecraft forge on Mac"

DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )

echo "Running gradlew setupDecompWorkspace"

cd $DIR

./gradlew setupDecompWorkspace

if [ "$?" != "0" ]; then
    echo "[Error] gradlew setupDecompWorkspace failed" 1>&2
    sleep 10
    exit 1
fi

echo "Running gradlew eclipse"

./gradlew eclipse

if [ "$?" != "0" ]; then
    echo "[Error] gradlew eclipse failed" 1>&2
    sleep 10
    exit 1
fi

echo "Setup Successful"

read -p "Press any key to continue"


