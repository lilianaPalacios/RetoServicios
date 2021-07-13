package io.swagger.petstore.certification.utils;

import cucumber.api.PendingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static io.swagger.petstore.certification.utils.enums.URLReqRes.URI_BASE;


public class InternetConection {

    private static final Logger  LOGGER = LogManager.getLogger(InternetConection.class.getName());

    public void internetConection() throws MalformedURLException {

        try {
            URL url = new URL(URI_BASE.getValue());
            HttpURLConnection huc =( HttpURLConnection) url.openConnection();
            huc.connect();
        }catch (IOException e) {
            LOGGER.error("Check your internet connection");
            throw new PendingException("Check your internet connection");
        } finally {
            return;
        }
    }

}
