#!/usr/bin/env bash

wsimport -J-Djavax.xml.accessExternalSchema=all -s src/main/generated -d build/classes/main -keep \
    -p de.dhl.onlinefrankierung.webservice \
    https://cig.dhl.de/cig-wsdls/com/dpdhl/wsdl/privatkundenversand-api/2.0/privatkundenversand-api-2.0.wsdl \
    -b https://cig.dhl.de/cig-wsdls/com/dpdhl/wsdl/privatkundenversand-api/popws/2.0/popws-2.0.xsd \
    -b https://cig.dhl.de/cig-wsdls/com/dpdhl/wsdl/privatkundenversand-api/poppdb/2.0/poppdb-2.0.xsd \
    -Xnocompile

