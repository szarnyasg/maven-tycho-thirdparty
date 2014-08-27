#!/bin/bash

cd build01
mvn clean install
cd ..

cd build02
mvn clean install
cd ..
