package Request;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import java.io.IOException;


public class Requester {
    private String url;
    private String body;
    private HttpClient client;
    private String type;
    private int delay;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public Requester(int delay) {
        this.delay = delay;
    }

    public String getBody() {
        return body;
    }

    public Requester(String url, String body, String type) {
        this.url = url;
        this.body = body;
    }

    public Requester(String url) {
        this.url = url;
    }
    public Requester() {
        super();
    }

    public String executeQueryPOST() throws IOException, InterruptedException {
        Thread.sleep(delay);
        client = new DefaultHttpClient();
        HttpPost request = new HttpPost(url);
        HttpEntity entity = new ByteArrayEntity(body.getBytes("UTF-8"));
        request.setEntity(entity);
        HttpResponse response = client.execute(request);
        return EntityUtils.toString(response.getEntity());
    }

    public String executeQueryGET() throws IOException, InterruptedException {
        Thread.sleep(delay);
        client = new DefaultHttpClient();
        HttpPost request = new HttpPost(url);
        HttpResponse response = client.execute(request);
        return EntityUtils.toString(response.getEntity());
    }
}
