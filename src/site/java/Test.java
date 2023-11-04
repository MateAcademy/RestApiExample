import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serhii Klunniy
 */
public class Test {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
//        String url ="https://reqres.in/api/users/2";

//        String response = restTemplate.getForObject(url, String.class);
//        System.out.println(response);

        String url ="https://reqres.in/api/users/2";
        Map<String, String> map = new HashMap<>();
        map.put("name", "morpheus");
        map.put("job", "leader");

        HttpEntity<Map<String,String>> httpEntity = new HttpEntity<>(map);

        String response = restTemplate.postForObject(url, httpEntity, String.class);
        System.out.println(response);
    }
}
