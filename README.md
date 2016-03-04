# GeoSamples

This library consists of java class files compiled from the samplev2.xsd schema (http://app.geosamples.org/samplev2.xsd) 
using JAXB : https://jaxb.java.net/

This code snippet is an example of using this library to unmarshall a Samples object from an XML document that validates to the schema,
and code to marshall the same object back to a XML document conformant with the schema..

```java
File file = new File(/* put your file path and name here */);

        File file = new File("/*your file*/.xml");

        Samples samples = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Samples.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            samples = (Samples) jaxbUnmarshaller.unmarshal(file);
            System.out.println(samples.getSample().get(0).getUserCode());
            System.out.println(samples.getSample().get(0).getName());
            System.out.println(samples.getSample().get(0).getIgsn());
        } catch (JAXBException jAXBException) {
        }

        try {
            JAXBContext jc = JAXBContext.newInstance(Samples.class);
            Marshaller m = jc.createMarshaller();
            m.marshal(samples, System.out);
        } catch (JAXBException jbe) {
            // ...
        }
```
