#!/bin/bash -e
echo "Using JAVA_OPTS=$JAVA_OPTS"
echo "APP PARAMS=$@"
exec java $JAVA_OPTS -jar "/standalone-1.0.0-SNAPSHOT.jar" "$@"
