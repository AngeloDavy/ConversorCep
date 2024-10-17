package teste.converter.cep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GeocodeController {

    @Autowired
    private GeocodeService geocodeService;

    @GetMapping("/get-coordinates/{cep}")
    public Map<String, Double> getCoordinates(@PathVariable String cep) {
        return geocodeService.getCoordinates(cep);
    }

}
