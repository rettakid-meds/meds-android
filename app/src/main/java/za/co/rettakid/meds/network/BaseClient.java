package za.co.rettakid.meds.network;

import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class BaseClient {

    protected String baseUrl = "http://41.185.28.23/meds/meds-php/xml.php";
    protected RestTemplate restTemplate = new RestTemplate();

    public BaseClient(String localUrl) {
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        this.baseUrl = this.baseUrl + localUrl;
    }

    protected String createUrl()    {
        return baseUrl;
    }

    protected String createUrl(String url)    {
        return baseUrl + url;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

}
