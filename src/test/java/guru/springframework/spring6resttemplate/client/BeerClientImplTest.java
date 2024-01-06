package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClientImpl beerClient;

    @Test
    void listBeersNoBeerName() {

        beerClient.listBeers(null);
    }

    @Test
    void listBeers() {
        Page<BeerDTO> beerDTOS = beerClient.listBeers("ALE", null, false, null, null );
        System.out.println(beerDTOS);
    }
}