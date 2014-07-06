#!/bin/sh

mvn exec:java -Dexec.mainClass=org.kleini.bricklink.Pricing -DconfigurationFile=src/main/resources/bricklink.properties -Dexec.args=$1

