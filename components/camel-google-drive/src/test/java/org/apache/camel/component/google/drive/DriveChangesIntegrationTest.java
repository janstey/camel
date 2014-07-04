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
import org.apache.camel.component.google.drive.internal.DriveChangesApiMethod;

/**
 * Test class for com.google.api.services.drive.Drive$Changes APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class DriveChangesIntegrationTest extends AbstractGoogleDriveTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(DriveChangesIntegrationTest.class);
    private static final String PATH_PREFIX = GoogleDriveApiCollection.getCollection().getApiName(DriveChangesApiMethod.class).getName();

    // TODO provide parameter values for get
    @Ignore
    @Test
    public void testGet() throws Exception {
        // using String message body for single parameter "changeId"
        final com.google.api.services.drive.Drive.Changes.Get result = requestBody("direct://GET", null);

        assertNotNull("get result", result);
        LOG.debug("get: " + result);
    }

    @Ignore
    @Test
    public void testList() throws Exception {
        final com.google.api.services.drive.Drive.Changes.List result = requestBody("direct://LIST", null);

        assertNotNull("list result", result);
        LOG.debug("list: " + result);
    }

    // TODO provide parameter values for watch
    @Ignore
    @Test
    public void testWatch() throws Exception {
        // using com.google.api.services.drive.model.Channel message body for single parameter "contentChannel"
        final com.google.api.services.drive.Drive.Changes.Watch result = requestBody("direct://WATCH", null);

        assertNotNull("watch result", result);
        LOG.debug("watch: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for get
                from("direct://GET")
                  .to("google-drive://" + PATH_PREFIX + "/get?inBody=changeId");

                // test route for list
                from("direct://LIST")
                  .to("google-drive://" + PATH_PREFIX + "/list");

                // test route for watch
                from("direct://WATCH")
                  .to("google-drive://" + PATH_PREFIX + "/watch?inBody=contentChannel");

            }
        };
    }
}
