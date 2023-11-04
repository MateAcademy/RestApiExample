import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serhii Klunniy
 */
// потребитель:
// будем делать запросы к сторонним рест сервисам
public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://translate.google.ru/translate_a/t?client=x&text=world&hl=en&sl=en&tl=ru";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);


//        String url = "https://reqres.in/api/users/2";
//        String forObject = restTemplate.getForObject(url, String.class);
//        System.out.println(forObject);

//        String str = "{\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"leader\"\n" +
//                "}";
//
//
//        Map<String, String> jsonToSend = new HashMap<>();
//        jsonToSend.put("name", "morpheus");
//        jsonToSend.put("job", "leader");
//        HttpEntity<Map<String, String>> resp = new HttpEntity<>(jsonToSend);
//
//        String str = restTemplate.postForObject("https://reqres.in/api/users", resp, String.class);
//        System.out.println(str);


    }
}
