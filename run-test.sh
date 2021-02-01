#!/bin/bash

mvn test -DskipTests=false -B -P '!oss-release,!travis-ci'