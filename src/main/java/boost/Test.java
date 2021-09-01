package boost;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Test {

    public void init() throws IOException {
        String requestBodyText = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope/%22%3E/n" +
                " <soap12:Body>\n" +
                " <Login xmlns=\"http://tempuri.org//%22%3E/n" +
                "<FRONT_ID> sd </FRONT_ID>" +
                " </Login>\n" +
                " </soap12:Body>\n" +
                "</soap12:Envelope>";
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/xml"), requestBodyText);

        Request request = new Request.Builder().method("POST",requestBody)
                .url("localhost:8090/starter")
                .build();

        OkHttpClient httpClient = new OkHttpClient();

        Response response = httpClient.newCall (request).execute();

    }
}