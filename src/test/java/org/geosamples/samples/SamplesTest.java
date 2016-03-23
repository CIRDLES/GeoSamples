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
package org.geosamples.samples;

import org.apache.http.conn.HttpHostConnectException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author James F. Bowring <bowring at gmail.com>
 */
public class SamplesTest {

    public SamplesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of deserializeProductionSesar3IGSN method, of class Samples.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeProductionSesar3IGSN() throws Exception {
        System.out.println("deserializeProductionSesar3IGSN");
        String igsn = "ODP000002";
        String expResult = "ODP000002";
        Samples result = null;

        try {
            result = Samples.deserializeProductionSesar3IGSN(igsn);
        } catch (HttpHostConnectException httpHostConnectException) {
            //  server is often down for maintenance
            assert (true);
        }
        if (result != null) {
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        }

        System.out.println("deserializeProductionSesar3IGSN");
        igsn = "X";
        expResult = null;
        try {
            result = Samples.deserializeProductionSesar3IGSN(igsn);
        } catch (HttpHostConnectException httpHostConnectException) {
            //  server is often down for maintenance
            assert (true);
        }
        if (result != null) {
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        }
    }

    /**
     * Test of deserializeProductionSesar2IGSN method, of class Samples.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeProductionSesar2IGSN() throws Exception {
        System.out.println("deserializeProductionSesar2IGSN");
        String igsn = "ODP000002";
        String expResult = "ODP000002";
        Samples result = null;
        try {
            result = Samples.deserializeProductionSesar2IGSN(igsn);
        } catch (HttpHostConnectException httpHostConnectException) {
            //  server is often down for maintenance
            assert (true);
        }
        if (result != null) {
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        }

        System.out.println("deserializeProductionSesar2IGSN");
        igsn = "X";
        expResult = null;
        try {
            result = Samples.deserializeProductionSesar2IGSN(igsn);
        } catch (HttpHostConnectException httpHostConnectException) {
            //  server is often down for maintenance
            assert (true);
        }
        if (result != null) {
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        }
    }

    /**
     * Test of deserializeTestIGSN method, of class Samples.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeTestIGSN() throws Exception {
        System.out.println("deserializeTestIGSN");
        String igsn = "ODP000002";
        String expResult = "ODP000002";
        Samples result = null;
        try {
            result = Samples.deserializeTestIGSN(igsn);
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        } catch (HttpHostConnectException httpHostConnectException) {
            // test server is often down for maintenance
            assert (true);
        }
        if (result != null) {
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        }

        System.out.println("deserializeTestIGSN");
        igsn = "X";
        expResult = null;
        result = null;
        try {
            result = Samples.deserializeTestIGSN(igsn);
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        } catch (HttpHostConnectException httpHostConnectException) {
            // test server is often down for maintenance
            assert (true);
        }
        if (result != null) {
            assertEquals(expResult, result.getSample().get(0).getIgsn());
        }
    }

}
