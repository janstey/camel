/*
 * Camel Api Route test generated by camel-component-util-maven-plugin
 * Generated on: Thu Jul 03 16:04:18 NDT 2014
 */
package org.apache.camel.component.google.drive;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.camel.component.google.drive.internal.GoogleDriveApiCollection;
import org.apache.camel.component.google.drive.internal.DrivePropertiesApiMethod;

/**
 * Test class for com.google.api.services.drive.Drive$Properties APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class DrivePropertiesIntegrationTest extends AbstractGoogleDriveTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(DrivePropertiesIntegrationTest.class);
    private static final String PATH_PREFIX = GoogleDriveApiCollection.getCollection().getApiName(DrivePropertiesApiMethod.class).getName();

    // TODO provide parameter values for delete
    @Ignore
    @Test
    public void testDelete() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelGoogleDrive.fileId", null);
        // parameter type is String
        headers.put("CamelGoogleDrive.propertyKey", null);

        final com.google.api.services.drive.Drive.Properties.Delete result = requestBodyAndHeaders("direct://DELETE", null, headers);

        assertNotNull("delete result", result);
        LOG.debug("delete: " + result);
    }

    // TODO provide parameter values for get
    @Ignore
    @Test
    public void testGet() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelGoogleDrive.fileId", null);
        // parameter type is String
        headers.put("CamelGoogleDrive.propertyKey", null);

        final com.google.api.services.drive.Drive.Properties.Get result = requestBodyAndHeaders("direct://GET", null, headers);

        assertNotNull("get result", result);
        LOG.debug("get: " + result);
    }

    // TODO provide parameter values for insert
    @Ignore
    @Test
    public void testInsert() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelGoogleDrive.fileId", null);
        // parameter type is com.google.api.services.drive.model.Property
        headers.put("CamelGoogleDrive.content", null);

        final com.google.api.services.drive.Drive.Properties.Insert result = requestBodyAndHeaders("direct://INSERT", null, headers);

        assertNotNull("insert result", result);
        LOG.debug("insert: " + result);
    }

    // TODO provide parameter values for list
    @Ignore
    @Test
    public void testList() throws Exception {
        // using String message body for single parameter "fileId"
        final com.google.api.services.drive.Drive.Properties.List result = requestBody("direct://LIST", null);

        assertNotNull("list result", result);
        LOG.debug("list: " + result);
    }

    // TODO provide parameter values for patch
    @Ignore
    @Test
    public void testPatch() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelGoogleDrive.fileId", null);
        // parameter type is String
        headers.put("CamelGoogleDrive.propertyKey", null);
        // parameter type is com.google.api.services.drive.model.Property
        headers.put("CamelGoogleDrive.content", null);

        final com.google.api.services.drive.Drive.Properties.Patch result = requestBodyAndHeaders("direct://PATCH", null, headers);

        assertNotNull("patch result", result);
        LOG.debug("patch: " + result);
    }

    // TODO provide parameter values for update
    @Ignore
    @Test
    public void testUpdate() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelGoogleDrive.fileId", null);
        // parameter type is String
        headers.put("CamelGoogleDrive.propertyKey", null);
        // parameter type is com.google.api.services.drive.model.Property
        headers.put("CamelGoogleDrive.content", null);

        final com.google.api.services.drive.Drive.Properties.Update result = requestBodyAndHeaders("direct://UPDATE", null, headers);

        assertNotNull("update result", result);
        LOG.debug("update: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for delete
                from("direct://DELETE")
                  .to("google-drive://" + PATH_PREFIX + "/delete");

                // test route for get
                from("direct://GET")
                  .to("google-drive://" + PATH_PREFIX + "/get");

                // test route for insert
                from("direct://INSERT")
                  .to("google-drive://" + PATH_PREFIX + "/insert");

                // test route for list
                from("direct://LIST")
                  .to("google-drive://" + PATH_PREFIX + "/list?inBody=fileId");

                // test route for patch
                from("direct://PATCH")
                  .to("google-drive://" + PATH_PREFIX + "/patch");

                // test route for update
                from("direct://UPDATE")
                  .to("google-drive://" + PATH_PREFIX + "/update");

            }
        };
    }
}
