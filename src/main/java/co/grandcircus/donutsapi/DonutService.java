package co.grandcircus.donutsapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DonutService {

    private RestTemplate request = new RestTemplate();

    public DonutResponse getDonutResponse(){
        String url  = "https://grandcircusco.github.io/demo-apis/donuts.json";
        DonutResponse response = request.getForObject(url, DonutResponse.class);
        return response;
    }  
}
