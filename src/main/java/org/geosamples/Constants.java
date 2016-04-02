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
package org.geosamples;

/**
 *
 * @author James F. Bowring <bowring at gmail.com>
 */
public class Constants {

    public static String GEOSAMPLES_PRODUCTION_SERVER = "https://app.geosamples.org/";

    public static String GEOSAMPLES_TEST_SAMPLES_SERVER = "https://sesardev.geosamples.org/";

    public static String GEOSAMPLES_TEST_FEATURES_SERVER = "https://sesar3.geosamples.org/";

    public static String GEOSAMPLES_SAMPLE_IGSN_WEBSERVICE_NAME = "sample/IGSN/";

    public static String GEOSAMPLES_CREDENTIALS_WEBSERVICE_NAME = "webservices/credentials_service.php";

    public static String GEOSAMPLES_SAMPLE_UPLOAD_WEBSERVICE_NAME = "webservices/upload.php";
    
    public static String GEOSAMPLES_SAMPLE_LIST_PER_USERCODE_WEBSERVICE_NAME = "samples/user_code/";
    
    public static String GEOSAMPLES_SAMPLE_UPDATE_IGSN_WEBSERVICE_NAME = "webservices/update.php";

    public static String GEOSAMPLES_COMPLIANT_XML_HEADER_SAMPLES = "<samples xmlns=\"http://app.geosamples.org\" \n"
            + "           xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n"
            + "           xsi:schemaLocation=\"http://app.geosamples.org\n"
            + "                                http://app.geosamples.org/samplev2.xsd \">";

}
