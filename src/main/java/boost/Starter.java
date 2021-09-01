package boost;

import Request.Requester;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class Starter {

    private static Logger logger = LoggerFactory.getLogger(Starter.class);

    @RequestMapping(value="/starter", method=RequestMethod.GET, produces="application/json")//НОМЕР ОДИН
    public @ResponseBody String starter() throws IOException, InterruptedException {

        logger.info("получили запрос на стартере");

        String response = "{\n" +
                "\"request\": \"Starter\"," +
                "\"context\": \"/starter\"," +
                "}";

        //Requester req = new Requester(1000);
        Requester req = new Requester(5000);
        req.setBody("<xml>awdawdawdad</xml>");
        req.setUrl("http://localhost:9090/starter/checker");
        req.start();

        logger.info("искусственный запрос создан с таким телом "  + req.getBody());
        return response;
    }



    @RequestMapping(value="/starter/checker", method=RequestMethod.POST, produces="application/xml")
        public @ResponseBody String starterCheck(@RequestBody String RequestBody) throws InterruptedException{
            String response =
                    "<?xml version=\"1.0\"?>\n" +
                            "<Request>"+ RequestBody+"<Request>" +
                            "<Context>/starter/checker</Context>";

            logger.info("запрос запустили на /starter/checker, искусстенный запрос с таким телом " + RequestBody);
            return response;
    }


}