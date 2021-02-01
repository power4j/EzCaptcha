#!/bin/bash

mvn release:clean -P 'oss-release' && \
mvn release:prepare -P 'oss-release' && \
mvn release:perform -P 'oss-release'