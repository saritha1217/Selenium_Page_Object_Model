#!/bin/bash
javadoc -docletpath target/MEDABLE_Test-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet MEDABLE_Automation.MEDABLE_Test.Doclet "$@"
