#!/bin/sh

mvn exec:java -Dexec.mainClass=org.kleini.bricklink.CSVExport -DconfigurationFile=src/main/resources/bricklink.properties

