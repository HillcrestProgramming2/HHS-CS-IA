import io.github.mivek.exception.ParseException;
import io.github.mivek.model.Metar;
import io.github.mivek.service.MetarService;

import java.io.IOException;
import java.net.URISyntaxException;

public class MetarCommandsTester {
    public static void main(String[] args) throws ParseException, IOException, URISyntaxException, InterruptedException {
        String icao = "KSLC";
        Metar metar = MetarService.getInstance().retrieveFromAirport(icao);

        System.out.println(metar);
    }
}
