/*
 * Copyright 2006-2016 CIRDLES.org.
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
 */
package org.geosamples.results;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.geosamples.samples.Samples;
import org.geosamples.XMLDocumentInterface;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})

@XmlRootElement(name = "results")
public class Results implements XMLDocumentInterface{

    public Results() {
        this.sample = new ArrayList<>();
    }

    @XmlElement(required = false)
    protected List<Samples.Sample> sample;

    /**
     * Gets the value of the sample property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sample property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSample().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Samples.Sample }
     *
     *
     * @return
     */
    public List<Samples.Sample> getSample() {
        if (sample == null) {
            sample = new ArrayList<>();
        }
        return this.sample;
    }

    @XmlElement(required = false)
    protected List<String> error;

    /**
     * Gets the value of the error property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sample property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSample().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Samples.Sample }
     *
     *
     * @return
     */
    public List<String> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

    @XmlElement(name = "valid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String valid;

    /**
     * @return the valid
     */
    public String getValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

}
