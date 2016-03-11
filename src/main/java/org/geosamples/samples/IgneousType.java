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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IgneousType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * {@code
 * <xml>* <pre>
 * <complexType name="IgneousType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Plutonic" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="PlutonicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Volcanic" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="VolcanicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </xml>
 * }
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IgneousType", propOrder = {
    "plutonic",
    "volcanic"
})
public class IgneousType {

    @XmlElement(name = "Plutonic")
    protected IgneousType.Plutonic plutonic;
    @XmlElement(name = "Volcanic")
    protected IgneousType.Volcanic volcanic;

    /**
     * Gets the value of the plutonic property.
     *
     * @return possible object is {@link IgneousType.Plutonic }
     *
     */
    public IgneousType.Plutonic getPlutonic() {
        return plutonic;
    }

    /**
     * Sets the value of the plutonic property.
     *
     * @param value allowed object is {@link IgneousType.Plutonic }
     *
     */
    public void setPlutonic(IgneousType.Plutonic value) {
        this.plutonic = value;
    }

    /**
     * Gets the value of the volcanic property.
     *
     * @return possible object is {@link IgneousType.Volcanic }
     *
     */
    public IgneousType.Volcanic getVolcanic() {
        return volcanic;
    }

    /**
     * Sets the value of the volcanic property.
     *
     * @param value allowed object is {@link IgneousType.Volcanic }
     *
     */
    public void setVolcanic(IgneousType.Volcanic value) {
        this.volcanic = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * {@code
     * <xml>
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="PlutonicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </xml>
     * }
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "plutonicType"
    })
    public static class Plutonic {

        @XmlElement(name = "PlutonicType")
        protected IgneousDetails plutonicType;

        /**
         * Gets the value of the plutonicType property.
         *
         * @return possible object is {@link IgneousDetails }
         *
         */
        public IgneousDetails getPlutonicType() {
            return plutonicType;
        }

        /**
         * Sets the value of the plutonicType property.
         *
         * @param value allowed object is {@link IgneousDetails }
         *
         */
        public void setPlutonicType(IgneousDetails value) {
            this.plutonicType = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * {@code
     * <xml>
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="VolcanicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </xml>
     * }
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "volcanicType"
    })
    public static class Volcanic {

        @XmlElement(name = "VolcanicType")
        protected IgneousDetails volcanicType;

        /**
         * Gets the value of the volcanicType property.
         *
         * @return possible object is {@link IgneousDetails }
         *
         */
        public IgneousDetails getVolcanicType() {
            return volcanicType;
        }

        /**
         * Sets the value of the volcanicType property.
         *
         * @param value allowed object is {@link IgneousDetails }
         *
         */
        public void setVolcanicType(IgneousDetails value) {
            this.volcanicType = value;
        }

    }

}
