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
import org.apache.camel.component.google.drive.internal.DriveAppsApiMethod;

/**
 * Test class for com.google.api.services.drive.Drive$Apps APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class DriveAppsIntegrationTest extends AbstractGoogleDriveTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(DriveAppsIntegrationTest.class);
    private static final String PATH_PREFIX = GoogleDriveApiCollection.getCollection().getApiName(DriveAppsApiMethod.class).getName();

    // TODO provide parameter values for get
    @Ignore
    @Test
    public void testGet() throws Exception {
        // using String message body for single parameter "appId"
        final com.google.api.services.drive.Drive.Apps.Get result = requestBody("direct://GET", null);

        assertNotNull("get result", result);
        LOG.debug("get: " + result);
    }

    @Ignore
    @Test
    public void testList() throws Exception {
        final com.google.api.services.drive.Drive.Apps.List result = requestBody("direct://LIST", null);

        assertNotNull("list result", result);
        LOG.debug("list: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for get
                from("direct://GET")
                  .to("google-drive://" + PATH_PREFIX + "/get?inBody=appId");

                // test route for list
                from("direct://LIST")
                  .to("google-drive://" + PATH_PREFIX + "/list");

            }
        };
    }
}
