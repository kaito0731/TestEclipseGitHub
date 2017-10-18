package test;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Emotion 
{
    public static void main(String[] args) 
    {
        HttpClient httpclient = HttpClients.createDefault();

        try
        {
            URIBuilder builder = new URIBuilder("https://api.projectoxford.ai/emotion/v1.0/recognize");
            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);
            request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            request.setHeader("Ocp-Apim-Subscription-Key", "6d89b218aa454e39941f643971d458ea");
            
            // Request body
            StringEntity reqEntity = new StringEntity("{\"url\": \"https://rr.img.naver.jp/mig?src=http%3A%2F%2Fimgcc.naver.jp%2Fkaze%2Fmission%2FUSER%2F20151111%2F57%2F5765517%2F5%2F600x646x76d3a208f00f7b46831a0572.jpg%2F300%2F600&twidth=300&theight=600&qlt=80&res_format=jpg&op=r\"}");
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) 
            {
                System.out.println(EntityUtils.toString(entity));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}