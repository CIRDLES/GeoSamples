# GeoSamples

[![Build Status](https://travis-ci.org/CIRDLES/GeoSamples.svg?branch=master)](https://travis-ci.org/CIRDLES/GeoSamples)

This library consists of java class files compiled from the samplev2.xsd schema (http://app.geosamples.org/samplev2.xsd) 
using JAXB : https://jaxb.java.net/  and modified to add parent, children, and siblings that are provided when http GET is invoked
at one of geosamples.org services.  

Three de-serialization methods are provided - one for each of the three working versions of the services.

Two serializing methods to XML strings are provided - plain and pretty-print.

One method for validating a Sample object for upload is provided.

[JavaDocs in browser](https://jitpack.io/com/github/cirdles/GeoSamples/v.1.0.4/javadoc/)


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
        <version>v.1.0.4</version>
      </dependency>
```
