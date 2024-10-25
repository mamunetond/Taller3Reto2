package com.mamunetond;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class NasaTest {

    private static final String API_KEY = System.getenv("fIuiAENRzFDd1pPbJ3BN9Ck9EhZS95PtgzUh29VZ");
    private static final String BASE_URL = "https://api.nasa.gov";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testApodEndpoint() {
        RestAssured
                .given()
                .queryParam("api_key", API_KEY)
                .when()
                .get("/planetary/apod")
                .then()
                .statusCode(200)
                .body("media_type", equalTo("image"))
                .log().ifValidationFails();  // Log solo si falla, mejora la claridad en resultados
    }

    @Test
    public void testMarsRoverPhotosEndpoint() {
        RestAssured
                .given()
                .queryParam("api_key", API_KEY)
                .queryParam("sol", 1000)
                .when()
                .get("/mars-photos/api/v1/rovers/curiosity/photos")
                .then()
                .statusCode(200)
                .body("photos.size()", greaterThan(0))
                .log().ifValidationFails();  // Log solo si falla
    }

    @Test
    public void testNeoFeedEndpoint() {
        RestAssured
                .given()
                .queryParam("api_key", API_KEY)
                .queryParam("start_date", "2023-01-01")
                .queryParam("end_date", "2023-01-02")
                .when()
                .get("/neo/rest/v1/feed")
                .then()
                .statusCode(200)
                .body("element_count", greaterThan(0))
                .log().ifValidationFails();  // Log solo si falla
    }
}
