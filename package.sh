#!/bin/sh

export MODS_HOME="$HOME/Library/Application Support/minecraft/mods/"
export JARS_SOURCE="$PWD/build/libs/"
./gradlew jar

mkdir -p "$MODS_HOME"
cp -R "$JARS_SOURCE"/*.jar "$MODS_HOME"