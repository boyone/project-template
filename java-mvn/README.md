# Java Maven Project

## Prerequisite

* JDK
  * [Oracle](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  * [Zulu](https://www.azul.com/downloads/zulu/)
  * [Amazon](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)
* [Set JAVA_HOME](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)
* [Maven](https://maven.apache.org/download.cgi)
* Set MVN_HOME

## Basic Maven Command

* Clean Project

```sh
mvn clean
```

* Test Project

```sh
mvn test
```

* Package Project

```sh
mvn package
```

## Start Java App

```sh
java -jar target/[project-name].jar
```