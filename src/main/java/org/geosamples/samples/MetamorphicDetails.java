/*
 * Copyright 2016 CIRDLES.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
 * See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
 * Any modifications to this file will be lost upon recompilation of the source schema. 
 * Generated on: 2016.03.03 at 09:06:25 AM EST 
*/


package org.geosamples.samples;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetamorphicDetails.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetamorphicDetails">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Calc-Silicate"/>
 *     &lt;enumeration value="Eclogite"/>
 *     &lt;enumeration value="Gneiss"/>
 *     &lt;enumeration value="Granofels"/>
 *     &lt;enumeration value="Granulite"/>
 *     &lt;enumeration value="MechanicallyBroken"/>
 *     &lt;enumeration value="Meta-Carbonate"/>
 *     &lt;enumeration value="Meta-Ultramafic"/>
 *     &lt;enumeration value="Metasedimentary"/>
 *     &lt;enumeration value="Metasomatic"/>
 *     &lt;enumeration value="Schist"/>
 *     &lt;enumeration value="Slate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetamorphicDetails")
@XmlEnum
public enum MetamorphicDetails {

    @XmlEnumValue("Calc-Silicate")
    CALC_SILICATE("Calc-Silicate"),
    @XmlEnumValue("Eclogite")
    ECLOGITE("Eclogite"),
    @XmlEnumValue("Gneiss")
    GNEISS("Gneiss"),
    @XmlEnumValue("Granofels")
    GRANOFELS("Granofels"),
    @XmlEnumValue("Granulite")
    GRANULITE("Granulite"),
    @XmlEnumValue("MechanicallyBroken")
    MECHANICALLY_BROKEN("MechanicallyBroken"),
    @XmlEnumValue("Meta-Carbonate")
    META_CARBONATE("Meta-Carbonate"),
    @XmlEnumValue("Meta-Ultramafic")
    META_ULTRAMAFIC("Meta-Ultramafic"),
    @XmlEnumValue("Metasedimentary")
    METASEDIMENTARY("Metasedimentary"),
    @XmlEnumValue("Metasomatic")
    METASOMATIC("Metasomatic"),
    @XmlEnumValue("Schist")
    SCHIST("Schist"),
    @XmlEnumValue("Slate")
    SLATE("Slate");
    private final String value;

    MetamorphicDetails(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetamorphicDetails fromValue(String v) {
        for (MetamorphicDetails c: MetamorphicDetails.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
