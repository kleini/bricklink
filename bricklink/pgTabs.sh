#!/usr/bin/env bash

java -cp target/bricklink-0.8.0-jar-with-dependencies.jar -DconfigurationFile=bricklink.properties -Dbrowser=firefox -DnumTabs=10 org.kleini.bricklink.PriceGuideTabs $@

