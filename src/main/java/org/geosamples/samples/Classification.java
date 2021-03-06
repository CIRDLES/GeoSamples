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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * {@code
 * <xml>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Biology">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Macrobiology" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="MacrobiologyType" type="{http://app.geosamples.org}MacrobiologyDetails" minOccurs="0"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Microbiology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Rock">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Igneous" type="{http://app.geosamples.org}IgneousType" minOccurs="0"/>
 *                   <element name="Metamorphic" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Ore" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="OreType" type="{http://app.geosamples.org}OreDetails" minOccurs="0"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Sedimentary" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="SedimentaryType" type="{http://app.geosamples.org}SedimentaryDetails" minOccurs="0"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Xenolithic" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="Igneous" type="{http://app.geosamples.org}IgneousType" minOccurs="0"/>
 *                             <element name="Metamorphic" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <choice>
 *                                       <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
 *                                     </choice>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Mineral" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="MineralType" type="{http://app.geosamples.org}MineralDetails" minOccurs="0"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Unknown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "biology",
    "rock",
    "mineral",
    "unknown"
})
@XmlRootElement(name = "classification")
public class Classification {

    @XmlElement(name = "Biology")
    protected Classification.Biology biology;
    @XmlElement(name = "Rock")
    protected Classification.Rock rock;
    @XmlElement(name = "Mineral")
    protected Classification.Mineral mineral;
    @XmlElement(name = "Unknown")
    protected String unknown;

    /**
     * Gets the value of the biology property.
     *
     * @return possible object is {@link Classification.Biology }
     *
     */
    public Classification.Biology getBiology() {
        return biology;
    }

    /**
     * Sets the value of the biology property.
     *
     * @param value allowed object is {@link Classification.Biology }
     *
     */
    public void setBiology(Classification.Biology value) {
        this.biology = value;
    }

    /**
     * Gets the value of the rock property.
     *
     * @return possible object is {@link Classification.Rock }
     *
     */
    public Classification.Rock getRock() {
        return rock;
    }

    /**
     * Sets the value of the rock property.
     *
     * @param value allowed object is {@link Classification.Rock }
     *
     */
    public void setRock(Classification.Rock value) {
        this.rock = value;
    }

    /**
     * Gets the value of the mineral property.
     *
     * @return possible object is {@link Classification.Mineral }
     *
     */
    public Classification.Mineral getMineral() {
        return mineral;
    }

    /**
     * Sets the value of the mineral property.
     *
     * @param value allowed object is {@link Classification.Mineral }
     *
     */
    public void setMineral(Classification.Mineral value) {
        this.mineral = value;
    }

    /**
     * Gets the value of the unknown property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUnknown(String value) {
        this.unknown = value;
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
     *         <element name="Macrobiology" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="MacrobiologyType" type="{http://app.geosamples.org}MacrobiologyDetails" minOccurs="0"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Microbiology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "macrobiology",
        "microbiology"
    })
    public static class Biology {

        @XmlElement(name = "Macrobiology")
        protected Classification.Biology.Macrobiology macrobiology;
        @XmlElement(name = "Microbiology")
        protected String microbiology;

        /**
         * Gets the value of the macrobiology property.
         *
         * @return possible object is
         *     {@link Classification.Biology.Macrobiology }
         *
         */
        public Classification.Biology.Macrobiology getMacrobiology() {
            return macrobiology;
        }

        /**
         * Sets the value of the macrobiology property.
         *
         * @param value allowed object is
         *     {@link Classification.Biology.Macrobiology }
         *
         */
        public void setMacrobiology(Classification.Biology.Macrobiology value) {
            this.macrobiology = value;
        }

        /**
         * Gets the value of the microbiology property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getMicrobiology() {
            return microbiology;
        }

        /**
         * Sets the value of the microbiology property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setMicrobiology(String value) {
            this.microbiology = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * {@code
         * <xml>
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <choice>
         *         <element name="MacrobiologyType" type="{http://app.geosamples.org}MacrobiologyDetails" minOccurs="0"/>
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
            "macrobiologyType"
        })
        public static class Macrobiology {

            @XmlElement(name = "MacrobiologyType")
            protected MacrobiologyDetails macrobiologyType;

            /**
             * Gets the value of the macrobiologyType property.
             *
             * @return possible object is {@link MacrobiologyDetails }
             *
             */
            public MacrobiologyDetails getMacrobiologyType() {
                return macrobiologyType;
            }

            /**
             * Sets the value of the macrobiologyType property.
             *
             * @param value allowed object is {@link MacrobiologyDetails }
             *
             */
            public void setMacrobiologyType(MacrobiologyDetails value) {
                this.macrobiologyType = value;
            }

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
     *         <element name="MineralType" type="{http://app.geosamples.org}MineralDetails" minOccurs="0"/>
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
        "mineralType"
    })
    public static class Mineral {

        @XmlElement(name = "MineralType")
        protected String mineralType;

        /**
         * Gets the value of the mineralType property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getMineralType() {
            return mineralType;
        }

        /**
         * Sets the value of the mineralType property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setMineralType(String value) {
            this.mineralType = value;
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
     *         <element name="Igneous" type="{http://app.geosamples.org}IgneousType" minOccurs="0"/>
     *         <element name="Metamorphic" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Ore" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="OreType" type="{http://app.geosamples.org}OreDetails" minOccurs="0"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Sedimentary" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="SedimentaryType" type="{http://app.geosamples.org}SedimentaryDetails" minOccurs="0"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Xenolithic" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="Igneous" type="{http://app.geosamples.org}IgneousType" minOccurs="0"/>
     *                   <element name="Metamorphic" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
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
    @XmlType(name = "", propOrder = {
        "igneous",
        "metamorphic",
        "ore",
        "sedimentary",
        "xenolithic"
    })
    public static class Rock {

        @XmlElement(name = "Igneous")
        protected IgneousType igneous;
        @XmlElement(name = "Metamorphic")
        protected Classification.Rock.Metamorphic metamorphic;
        @XmlElement(name = "Ore")
        protected Classification.Rock.Ore ore;
        @XmlElement(name = "Sedimentary")
        protected Classification.Rock.Sedimentary sedimentary;
        @XmlElement(name = "Xenolithic")
        protected Classification.Rock.Xenolithic xenolithic;

        /**
         * Gets the value of the igneous property.
         *
         * @return possible object is {@link IgneousType }
         *
         */
        public IgneousType getIgneous() {
            return igneous;
        }

        /**
         * Sets the value of the igneous property.
         *
         * @param value allowed object is {@link IgneousType }
         *
         */
        public void setIgneous(IgneousType value) {
            this.igneous = value;
        }

        /**
         * Gets the value of the metamorphic property.
         *
         * @return possible object is {@link Classification.Rock.Metamorphic }
         *
         */
        public Classification.Rock.Metamorphic getMetamorphic() {
            return metamorphic;
        }

        /**
         * Sets the value of the metamorphic property.
         *
         * @param value allowed object is
         *     {@link Classification.Rock.Metamorphic }
         *
         */
        public void setMetamorphic(Classification.Rock.Metamorphic value) {
            this.metamorphic = value;
        }

        /**
         * Gets the value of the ore property.
         *
         * @return possible object is {@link Classification.Rock.Ore }
         *
         */
        public Classification.Rock.Ore getOre() {
            return ore;
        }

        /**
         * Sets the value of the ore property.
         *
         * @param value allowed object is {@link Classification.Rock.Ore }
         *
         */
        public void setOre(Classification.Rock.Ore value) {
            this.ore = value;
        }

        /**
         * Gets the value of the sedimentary property.
         *
         * @return possible object is {@link Classification.Rock.Sedimentary }
         *
         */
        public Classification.Rock.Sedimentary getSedimentary() {
            return sedimentary;
        }

        /**
         * Sets the value of the sedimentary property.
         *
         * @param value allowed object is
         *     {@link Classification.Rock.Sedimentary }
         *
         */
        public void setSedimentary(Classification.Rock.Sedimentary value) {
            this.sedimentary = value;
        }

        /**
         * Gets the value of the xenolithic property.
         *
         * @return possible object is {@link Classification.Rock.Xenolithic }
         *
         */
        public Classification.Rock.Xenolithic getXenolithic() {
            return xenolithic;
        }

        /**
         * Sets the value of the xenolithic property.
         *
         * @param value allowed object is
         *     {@link Classification.Rock.Xenolithic }
         *
         */
        public void setXenolithic(Classification.Rock.Xenolithic value) {
            this.xenolithic = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * {@code
         * <xml>
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <choice>
         *         <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
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
            "metamorphicType"
        })
        public static class Metamorphic {

            @XmlElement(name = "MetamorphicType")
            protected MetamorphicDetails metamorphicType;

            /**
             * Gets the value of the metamorphicType property.
             *
             * @return possible object is {@link MetamorphicDetails }
             *
             */
            public MetamorphicDetails getMetamorphicType() {
                return metamorphicType;
            }

            /**
             * Sets the value of the metamorphicType property.
             *
             * @param value allowed object is {@link MetamorphicDetails }
             *
             */
            public void setMetamorphicType(MetamorphicDetails value) {
                this.metamorphicType = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * {@code
         * <xml>
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <choice>
         *         <element name="OreType" type="{http://app.geosamples.org}OreDetails" minOccurs="0"/>
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
            "oreType"
        })
        public static class Ore {

            @XmlElement(name = "OreType")
            protected OreDetails oreType;

            /**
             * Gets the value of the oreType property.
             *
             * @return possible object is {@link OreDetails }
             *
             */
            public OreDetails getOreType() {
                return oreType;
            }

            /**
             * Sets the value of the oreType property.
             *
             * @param value allowed object is {@link OreDetails }
             *
             */
            public void setOreType(OreDetails value) {
                this.oreType = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * {@code
         * <xml>
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <choice>
         *         <element name="SedimentaryType" type="{http://app.geosamples.org}SedimentaryDetails" minOccurs="0"/>
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
            "sedimentaryType"
        })
        public static class Sedimentary {

            @XmlElement(name = "SedimentaryType")
            protected SedimentaryDetails sedimentaryType;

            /**
             * Gets the value of the sedimentaryType property.
             *
             * @return possible object is {@link SedimentaryDetails }
             *
             */
            public SedimentaryDetails getSedimentaryType() {
                return sedimentaryType;
            }

            /**
             * Sets the value of the sedimentaryType property.
             *
             * @param value allowed object is {@link SedimentaryDetails }
             *
             */
            public void setSedimentaryType(SedimentaryDetails value) {
                this.sedimentaryType = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * {@code
         * <xml>
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <choice>
         *         <element name="Igneous" type="{http://app.geosamples.org}IgneousType" minOccurs="0"/>
         *         <element name="Metamorphic" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "igneous",
            "metamorphic"
        })
        public static class Xenolithic {

            @XmlElement(name = "Igneous")
            protected IgneousType igneous;
            @XmlElement(name = "Metamorphic")
            protected Classification.Rock.Xenolithic.Metamorphic metamorphic;

            /**
             * Gets the value of the igneous property.
             *
             * @return possible object is {@link IgneousType }
             *
             */
            public IgneousType getIgneous() {
                return igneous;
            }

            /**
             * Sets the value of the igneous property.
             *
             * @param value allowed object is {@link IgneousType }
             *
             */
            public void setIgneous(IgneousType value) {
                this.igneous = value;
            }

            /**
             * Gets the value of the metamorphic property.
             *
             * @return possible object is
             *     {@link Classification.Rock.Xenolithic.Metamorphic }
             *
             */
            public Classification.Rock.Xenolithic.Metamorphic getMetamorphic() {
                return metamorphic;
            }

            /**
             * Sets the value of the metamorphic property.
             *
             * @param value allowed object is
             *     {@link Classification.Rock.Xenolithic.Metamorphic }
             *
             */
            public void setMetamorphic(Classification.Rock.Xenolithic.Metamorphic value) {
                this.metamorphic = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * {@code
             * <xml>
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <choice>
             *         <element name="MetamorphicType" type="{http://app.geosamples.org}MetamorphicDetails" minOccurs="0"/>
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
                "metamorphicType"
            })
            public static class Metamorphic {

                @XmlElement(name = "MetamorphicType")
                protected MetamorphicDetails metamorphicType;

                /**
                 * Gets the value of the metamorphicType property.
                 *
                 * @return possible object is {@link MetamorphicDetails }
                 *
                 */
                public MetamorphicDetails getMetamorphicType() {
                    return metamorphicType;
                }

                /**
                 * Sets the value of the metamorphicType property.
                 *
                 * @param value allowed object is {@link MetamorphicDetails }
                 *
                 */
                public void setMetamorphicType(MetamorphicDetails value) {
                    this.metamorphicType = value;
                }

            }

        }

    }

}
