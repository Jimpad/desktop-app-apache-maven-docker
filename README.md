# Docker Maven App Boilerplate

## Commands
```bash
# Compile
$ mvn clean compile

# Test
$ mvn clean test

# Run
$ mvn clean compile && mvn -q exec:java -Dexec.mainClass=com.example.app.AppDriver -Djava.util.logging.config.file=src/main/resources/logging.properties

# Package
$ mvn assembly:single

# Generate javadoc
$ mvn javadoc:javadoc

# Generate javadoc without Maven
$ javaDoc -version -author -private -classpath src -d target/javadoc src/main/java/com/example/**/*.java

# FindBugs
$ mvn findbugs:check
$ mvn findbugs:gui

# Checkstyle
$ mvn checkstyle:check

# Generate Reports
$ mvn clean compile site

# Generated from
$ mvn archetype:generate -DinteractiveMode=false \
                         -DarchetypeArtifactId=maven-archetype-quickstart \
                         -DgroupId=com.example -DartifactId=MyApp \
                         -Dversion='01' \
                         -Dpackage=com.example
```

## Artifacts

In order to run the artifact (out/artifacts/MyApp_jar/MyApp.jar), you will need to install the latest [Java Runtime Environment](https://www.java.com/en/download/).

Afterwards, set the preferred "Open With" option and point to the java installation directory (/bin/java.exe).

## Docker service

Make sure you have downloaded and installed the latest version of Docker Desktop.

Start up the container service (Docker-daemon service) and proceed to the project in your favorite IDE.

Now search for Services window (here is [how it looks](https://ibb.co/McMn08N) in my case), and proceed to configure your deployment strategy.

#### Kind regards, Jimpad.

#### Happy Coding!
