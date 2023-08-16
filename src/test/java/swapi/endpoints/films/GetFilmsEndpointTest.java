package swapi.endpoints.films;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import swapi.AbstractEndpointTest;

import static constants.Endpoints.FILMS;
import static io.restassured.RestAssured.when;

public class GetFilmsEndpointTest extends AbstractEndpointTest {
    @Test
    void when_GetFilms_then_ReturnsStatusOK() {
        when().get(FILMS)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
