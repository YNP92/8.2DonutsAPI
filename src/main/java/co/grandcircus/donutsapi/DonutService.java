package co.grandcircus.donutsapi;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DonutService {

    private RestTemplate request = new RestTemplate();

    public List<DonutDetails> getDonutResponse() {
        String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
        return request.getForObject(url, DonutResponse.class).getResults();
    }

    public DonutDetails getDonutbyID(Integer id) {
        String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
        return request.getForObject(url, DonutDetails.class);
    }
}
