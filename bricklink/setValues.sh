#!/usr/bin/env bash

java -cp target/bricklink-0.8.1-jar-with-dependencies.jar -DconfigurationFile=bricklink.properties -Dbrowser=firefox org.kleini.bricklink.DetermineSetValues $@

