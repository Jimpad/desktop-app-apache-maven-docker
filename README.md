<!--
    Author: Jimpad
    Date: 20/10/2022
 >

<!-- begin:ProjectShields -->
<!--
    I'm using markdown "reference style" links for readability.
    Reference links are enclosed in brackets [ ] instead of parentheses ( ).
    See the bottom of this document for the declaration of the reference variables
    for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
    https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

<a name="readme-top"></a>

<div align="center">
  <!-- begin:Icons-->
  
  [![Contributors][contributors-shield]][contributors-url]
  [![Stargazers][stars-shield]][stars-url]
  [![MIT License][license-shield]][license-url]
  [![LinkedIn][linkedin-shield]][linkedin-url]
  
  <!-- end:Icons-->
  
  <!-- begin:Logo -->
  <a>
    <img src="./src/media/assets/logo.svg" alt="Logo" width="80" height="80">
  </a>
  <!-- end:Logo >
  
  <!-- begin:ShortDescription -->
  <p align="center">
    Powered by   
    <br>
    Apache Maven & Docker
    <br>
    <a href="https://github.com/Jimpad/desktop-app-apache-maven-docker"><strong>Explore the docs »</strong></a>
  </p>
  <!-- end:ShortDescription -->
</div>
<!-- end:ProjectShields -->

# Desktop Application Apache Maven Docker

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

# Artifacts

In order to run the artifact (out/artifacts/MyApp_jar/MyApp.jar), you will need to install the latest [Java Runtime Environment](https://www.java.com/en/download/).

Afterwards, set the preferred "Open With" option and point to the java installation directory (/bin/java.exe).

## Docker service

Make sure you have downloaded and installed the latest version of Docker Desktop.

Start up the container service (Docker-daemon service) and proceed to the project in your favorite IDE.

Now search for Services window (here is [how it looks](https://ibb.co/McMn08N) in my case), and proceed to configure your deployment strategy.

<!-- begin:Contributing -->
# Contributing

<p>Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.</p>

<p>If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".</p>
<p>Don't forget to give the project a star! Thanks again!</p>
<ul align="left">
  <li>
  Fork the Project
  </li>
  <li>
  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
  </li>
  <li>
  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
  </li>
  <li>
  Push to the Branch (`git push origin feature/AmazingFeature`)
  </li>
  <li>
  Open a Pull Request
  </li>
</ul>
<!-- end:Contributing-->

<!-- begin:License -->
# License

Distributed under the MIT License. See `LICENSE.txt` for more information.
<!-- end:License -->

<!-- begin:Footer -->
<div align="center">
    <a href="https://github.com/Jimpad/desktop-app-apache-maven-docker/issues">Request Feature</a>
    ·
    <a href="https://github.com/Jimpad/desktop-app-apache-maven-docker/issues">Report Bug</a>
    ·
    <a href="#readme-top">Back to Top</a>
</div>
<!-- end:Footer-->

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/Jimpad/desktop-app-apache-maven-docker.svg?style=for-the-badge
[contributors-url]: https://github.com/Jimpad/desktop-app-apache-maven-docker/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Jimpad/desktop-app-apache-maven-docker.svg?style=for-the-badge
[forks-url]: https://github.com/Jimpad/desktop-app-apache-maven-docker/network/members
[stars-shield]: https://img.shields.io/github/stars/Jimpad/desktop-app-apache-maven-docker.svg?style=for-the-badge
[stars-url]: https://github.com/Jimpad/desktop-app-apache-maven-docker/stargazers
[issues-shield]: https://img.shields.io/github/issues/Jimpad/desktop-app-apache-maven-docker.svg?style=for-the-badge
[issues-url]: https://github.com/Jimpad/desktop-app-apache-maven-docker/issues
[license-shield]: https://img.shields.io/github/license/Jimpad/desktop-app-apache-maven-docker.svg?style=for-the-badge
[license-url]: https://github.com/Jimpad/desktop-app-apache-maven-docker/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/Jimpad
