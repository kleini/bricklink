#!/bin/sh

mvn exec:java -Dexec.mainClass=org.kleini.bricklink.PartOut -DconfigurationFile=src/main/resources/bricklink.properties -Dexec.args="$1 $2"

