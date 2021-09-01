package boost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Cmfs {

    private static Logger logger = LoggerFactory.getLogger(Cmfs.class);

    @RequestMapping(value="/CMBSpecificWebService_mtom/services/CMWebService", method=RequestMethod.GET, produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String CMWebServiceGET() throws InterruptedException{
        String response = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <s:Header xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" />\n" +
                "  <soapenv:Body>\n" +
                "    <ns1:CreateItemReply xmlns=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\" xmlns:ns1=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\">\n" +
                "      <ns1:RequestStatus success=\"true\">\n" +
                "</ns1:RequestStatus>\n" +
                " \n" +
                "<ns1:Item URI=\"http://cmfs.moscow.alfaintra.net:9121/CMBSpecificWebService/CMBGetPIDUrl?pid=95 3 ICM8 icmnlsdb15 SME_K_CredContr59 26 A1001001A19F04B10910I0609018 A19F04B10910I060901 14 2912&server=icmnlsdb&dsType=ICM\" /></ns1:CreateItemReply>\n" +
                "  </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        logger.info("CMWebService GET");
        return response;
    }

    @RequestMapping(value="/CMBSpecificWebService_mtom/services/CMWebService", method=RequestMethod.POST, produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String CMWebServicePOST(@RequestBody String RequestBody) throws InterruptedException{
        String response = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "<s:Header xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" />\n" +
                "<soapenv:Body>\n" +
                "<ns1:CreateItemReply xmlns=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\" xmlns:ns1=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\">\n" +
                "<ns1:RequestStatus success=\"true\">\n" +
                "</ns1:RequestStatus>\n" +
                "<ns1:Item URI=\"http://cmfs.moscow.alfaintra.net:9121/CMBSpecificWebService/CMBGetPIDUrl?pid=95 3 ICM8 icmnlsdb15 SME_K_CredContr59 26 A1001001A19F04B10910I0609018 A19F04B10910I060901 14 2912&server=icmnlsdb&dsType=ICM\" /></ns1:CreateItemReply>\n" +
                "</soapenv:Body>\n" +
                "</soapenv:Envelope>";
        logger.info("CMWebService POST");
        logger.debug("RequestBody " + RequestBody);
        return response;
    }
    @RequestMapping(value="/CMBSpecificWebService_mtom/services/CMWebService", method=RequestMethod.PUT, produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String CMWebServicePUT(@RequestBody String RequestBody) throws InterruptedException{
        String response = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <s:Header xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" />\n" +
                "  <soapenv:Body>\n" +
                "    <ns1:CreateItemReply xmlns=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\" xmlns:ns1=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\">\n" +
                "      <ns1:RequestStatus success=\"true\">\n" +
                "</ns1:RequestStatus>\n" +
                "<ns1:Item URI=\"http://cmfs.moscow.alfaintra.net:9121/CMBSpecificWebService/CMBGetPIDUrl?pid=95 3 ICM8 icmnlsdb15 SME_K_CredContr59 26 A1001001A19F04B10910I0609018 A19F04B10910I060901 14 2912&server=icmnlsdb&dsType=ICM\" /></ns1:CreateItemReply>\n" +
                "  </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        logger.info("CMWebService PUT");
        logger.debug("RequestBody " + RequestBody);
        return response;
    }

}