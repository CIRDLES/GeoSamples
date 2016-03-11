# GeoSamples

[![Build Status](https://travis-ci.org/CIRDLES/GeoSamples.svg?branch=master)](https://travis-ci.org/CIRDLES/GeoSamples)[![](https://jitpack.io/v/cirdles/GeoSamples.svg)](https://jitpack.io/#cirdles/GeoSamples)

This library consists of java class files compiled from the samplev2.xsd schema (http://app.geosamples.org/samplev2.xsd) 
using JAXB : https://jaxb.java.net/  and modified to add parent, children, and siblings that are provided when http GET is invoked
at one of geosamples.org services.  Three deserialization methods are provided to cover each of the working versions of the services.

This is a work-in-progress, so please contribute ideas, code, docs, etc.

For use with Maven, add to your pom.xml file this repository:
```xml
      <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
      </repository>
```
and this reference to GeoSamples:
```xml
      <dependency>
        <groupId>com.github.cirdles</groupId>
        <artifactId>GeoSamples</artifactId>
        <version>v1.0.1</version>
      </dependency>
```
http://www.javadoc.io/doc/org.cirdles/GeoSamples/v1.0.1
