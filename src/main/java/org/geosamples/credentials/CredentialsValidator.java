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
package org.geosamples.credentials;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import static org.geosamples.Constants.GEOSAMPLES_CREDENTIALS_WEBSERVICE_NAME_V2;
import static org.geosamples.Constants.GEOSAMPLES_PRODUCTION_SERVER;
import static org.geosamples.Constants.GEOSAMPLES_TEST_FEATURES_SERVER;
import static org.geosamples.Constants.GEOSAMPLES_TEST_SAMPLES_SERVER;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CredentialsValidator {

    private CredentialsValidator() {
    }

    /**
     * Validates user credentials for use with GeoPass from SESAR using
     * <a href="https://app.geosamples.org/webservices/credentials_service.php">Production
     * Service v.2</a>. Only one user_code will be returned in the ArrayList.
     *
     * @see
     * <a href="http://www.iedadata.org/services/sesar_api#2.sesarusercredential">SESAR
     * credential POST API</a>
     * @param userName =
     * <a href="https://geopass.iedadata.org/josso/">GeoPass</a> username
     * @param password =
     * <a href="https://geopass.iedadata.org/josso/">GeoPass</a> password
     * @return ArrayList of user codes for this user
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     */
    public static ArrayList<String> validateUserCredentialsProductionServiceV2(String userName, String password)
            throws IOException, ParserConfigurationException, SAXException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        return validateUserCredentials(userName, password, GEOSAMPLES_PRODUCTION_SERVER + GEOSAMPLES_CREDENTIALS_WEBSERVICE_NAME_V2);
    }

    /**
     * Validates user credentials for use with GeoPass from SESAR using
     * <a href="https://sesardev.geosamples.org/webservices/credentials_service.php">Development
     * Service 1</a>. Only one user_code will be returned in the ArrayList.
     *
     * @see
     * <a href="http://www.iedadata.org/services/sesar_api#2.sesarusercredential">SESAR
     * credential POST API</a>
     * @param userName =
     * <a href="https://geopass.iedadata.org/josso/">GeoPass</a> username
     * @param password =
     * <a href="https://geopass.iedadata.org/josso/">GeoPass</a> password
     * @return ArrayList of user codes for this user
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     */
    public static ArrayList<String> validateUserCredentialsDevelopmentService1(String userName, String password)
            throws IOException, ParserConfigurationException, SAXException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        return validateUserCredentials(userName, password, GEOSAMPLES_TEST_SAMPLES_SERVER + GEOSAMPLES_CREDENTIALS_WEBSERVICE_NAME_V2);
    }

    /**
     * Validates user credentials for use with GeoPass from SESAR using
     * <a href="https://sesar3.geosamples.org/webservices/credentials_service_v2.php">Development
     * Service 2</a>. ArrayList first element will be requestor's user code (if
     * any) followed by all accessible user codes, which are those does whose
     * owners have given permissions to the requestor. Future versions will
     * provide these permissions to caller.
     *
     * @see
     * <a href="http://www.iedadata.org/services/sesar_api#2.sesarusercredential">SESAR
     * credential POST API</a>
     * @param userName =
     * <a href="https://geopass.iedadata.org/josso/">GeoPass</a> username
     * @param password =
     * <a href="https://geopass.iedadata.org/josso/">GeoPass</a> password
     * @return ArrayList of user codes for this user
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     */
    public static ArrayList<String> validateUserCredentialsDevelopmentService2(String userName, String password)
            throws IOException, ParserConfigurationException, SAXException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        return validateUserCredentials(userName, password, GEOSAMPLES_TEST_FEATURES_SERVER + GEOSAMPLES_CREDENTIALS_WEBSERVICE_NAME_V2);
    }

    /**
     * Validates user credentials for use with GeoPass from SESAR.
     *
     * @see
     * <a href="http://www.iedadata.org/services/sesar_api#2.sesarusercredential">SESAR
     * credential POST API</a>
     * @param userName
     * @param password
     * @param credentialsService
     * @return ArrayList of user codes for this user
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     */
    private static ArrayList<String> validateUserCredentials(String userName, String password, String credentialsService)
            throws IOException, ParserConfigurationException, SAXException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        ArrayList<String> userCodes = new ArrayList<>();

        Map<String, String> dataToPost = new HashMap<>();
        dataToPost.put("username", userName);
        dataToPost.put("password", password);

        org.apache.http.client.methods.HttpPost httpPost = new HttpPost(credentialsService);
        List<NameValuePair> nameValuePairs = new ArrayList<>();
        nameValuePairs.add(new BasicNameValuePair("username", userName));
        nameValuePairs.add(new BasicNameValuePair("password", password));

        httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

        CloseableHttpClient httpClient = org.geosamples.utilities.HTTPClient.clientWithNoSecurityValidation();

        Document doc;
        try (CloseableHttpResponse httpResponse = httpClient.execute(httpPost)) {
            HttpEntity myEntity = httpResponse.getEntity();
            InputStream response = myEntity.getContent();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(false);
            doc = factory.newDocumentBuilder().parse(response);
            EntityUtils.consume(myEntity);
        }

        if (doc != null) {
            if (doc.getElementsByTagName("valid").getLength() > 0) {
                if (doc.getElementsByTagName("valid").item(0).getTextContent().trim().equalsIgnoreCase("yes")) {
                    NodeList userCodesList = doc.getElementsByTagName("user_code");
                    for (int i = 0; i < userCodesList.getLength(); i++) {
                        userCodes.add(userCodesList.item(i).getTextContent().trim());
                    }
                }
            }
        }

        return userCodes;
    }
}
