# pelias-client-library-demo [![Build Status](https://travis-ci.org/CUTR-at-USF/pelias-client-library-demo.svg?branch=master)](https://travis-ci.org/CUTR-at-USF/pelias-client-library-demo)
A demo project showing how to use the [https://github.com/CUTR-at-USF/pelias-client-library](https://github.com/CUTR-at-USF/pelias-client-library) to call the [Mapzen Pelias Search API](https://mapzen.com/documentation/search/search/)

### Requirements

You'll need [JDK 7 or higher](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

### Including this library in your application

To add this library to your project using Maven, add the following to your `pom.xml` file:
~~~
<dependencies>
  <!-- Pelias Client Library -->
  <dependency>
      <groupId>edu.usf.cutr.pelias</groupId>    
      <artifactId>pelias-client-library</artifactId>    
      <version>1.0.0</version>
      <type>pom</type>
  </dependency>
</dependencies>
~~~

If you're using Gradle and Android Studio, here's what your `build.gradle` should look like:

~~~
...
repositories {
    jcenter()
}

android {
    ...

    // http://stackoverflow.com/questions/20673625/gradle-0-7-0-duplicate-files-during-packaging-of-apk
    packagingOptions {
        exclude 'META-INF/LICENSE'
        exclude 'META-INF/NOTICE'
        exclude 'META-INF/services/com.fasterxml.jackson.core.JsonFactory'
        exclude 'META-INF/services/com.fasterxml.jackson.core.ObjectCodec'
    }
...

dependencies {
    ...
    // Pelias Client library
    compile 'edu.usf.cutr.pelias:pelias-client-library:1.0.0'
}
~~~


### Usage

The below example shows how to call the Pelias Search API - this same code is in the `PeliasClientDemo` file in this project:

~~~
String apiKey = "search-YOUR-KEY_HERE";
String text = "London";
SearchResponse response = new SearchRequest.Builder(apiKey, text).build().call();
System.out.println(response.toString());
~~~

## Compiling the code yourself

### Setting up your environment

This project was created in [IntelliJ](https://www.jetbrains.com/idea/).  You can also compile it from the command line using [Maven](https://maven.apache.org/).

### Getting the code

To get started with this project, use a Git client to clone this repository to your local computer.  Then, in IntelliJ import the project as a Maven project.

### Dependencies

Managed via Maven:

* [**Pelias Client Library**](https://github.com/CUTR-at-USF/pelias-client-library) - For calling the Mapzen Pelias Search API.

### Build the project

* IntelliJ - Clean and build the project
* Maven - `mvn install` 