package boost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Example {

    private static Logger logger = LoggerFactory.getLogger(Example.class);

    @RequestMapping(value="/example/Date", method=RequestMethod.GET, produces= MediaType.TEXT_HTML_VALUE)
    public @ResponseBody String CMWebServiceGET(@RequestParam("name") String name,@RequestParam("sex") String sex ) throws InterruptedException{

        Thread.sleep(100);

        String a = "";
        if(sex.equals("M")){
            a = "Мужчина";
        }
        String response = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  <title>Приветсвие</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <h1>Добрый день,"+a+" сегодня" + new Date().toString() + "</h1>\n" +
                "  <!-- Комментарий -->\n" +
                "  <p>"+name+"</p>\n" +
                "  <p>Второй абзац.</p>\n" +
                " </body>\n" +
                "</html>";
        logger.info("Date");
        return response;
    }


    @RequestMapping(value="/example/Date/awd", method=RequestMethod.POST)
    public @ResponseBody String sfefesf(@RequestBody String RequestBody ) throws InterruptedException{
        Thread.sleep(100);

        String response = RequestBody;
        logger.info("Date");
        return response;
    }

}