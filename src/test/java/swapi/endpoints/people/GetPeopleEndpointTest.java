package swapi.endpoints.people;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import swapi.AbstractEndpointTest;

import static constants.Endpoints.PEOPLE;
import static io.restassured.RestAssured.when;

public class GetPeopleEndpointTest extends AbstractEndpointTest {
    @Test
    void when_GetPeople_then_ReturnsStatusOK() {
        when().get(PEOPLE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
