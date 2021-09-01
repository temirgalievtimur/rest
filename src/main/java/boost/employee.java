package boost;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class employee {
    static String pin="";
    static String relation="";
    static long requestCounter = 0; //счетчик количества вызывов
    static Map<String, String> pinsMap = new HashMap<String,String>();
    //static long numberOfNineSymbol = 200000000;
   // static long numberOfNineSymbol = Long.parseLong((System.currentTimeMillis()+"").substring(4,(System.currentTimeMillis()+"").length()));
    private static Logger logger = LoggerFactory.getLogger(employee.class);

    @RequestMapping(value="/edo-employee-api.edo-lt.svc.cluster.local/**", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody String employeeGet() throws InterruptedException {
        logger.info("/edo-employee-api.edo-lt.svc.cluster.local");

        return "{\n" +
                "    \"employee\": {\n" +
                "        \"userId\": \"U_M13A5\",\n" +
                "        \"firstName\": \"Евгений\",\n" +
                "        \"lastName\": \"Кузнецов\",\n" +
                "        \"middleName\": \"Александрович\",\n" +
                "        \"fullName\": \"Кузнецов Евгений Александрович\",\n" +
                "        \"position\": \"Ведущий системный аналитик\",\n" +
                "        \"email\": \"EKuznetsov2@alfabank.ru\",\n" +
                "        \"workPhoneNumber\": \"0503309\",\n" +
                "        \"snils\": null,\n" +
                "        \"roles\": [],\n" +
                "        \"productTypes\": [],\n" +
                "        \"groups\": [\n" +
                "            \"CN=Users-IT,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=CD-DVD_MIIS_DENY,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-odata-read-test,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-read-test,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=SEB-SOZ,OU=Groups,OU=SB,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_Stash,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=iPhones,OU=Connectra,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=SGSA - Читатели,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_CP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp dev,OU=SLX,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_ConfluenceRO,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-read-live,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=PIL2_BRN,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=AlfaConnectUsers,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=knbrb_read_oo_zpp_corp,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=pim_users_external,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_Confluence,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=sp_ord_it,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Кредитный конвейер - Write,OU=Блок Информационные технологии,OU=ITFS,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=PURMS2 Staff Users,OU=PURMS2,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Role_LRS_Extended,OU=LRS Print Management,OU=Roles,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Матрица доступа FIM - ЦО NEW,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=edo-read-live,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=TermBC_Std_Med_SN_FH_IT_MSK_FIM,OU=BC_FIM_GROUP,OU=BlueCoatProxy,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=edo-read-test,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Users-Moscow-region,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-odata-read-live,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=USB_MIIS_DENY,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\"\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }

    @RequestMapping(value="/edo-employee-api.edo-lt.svc.cluster.local/**", method=RequestMethod.POST, produces="application/json")
    public @ResponseBody String employeePOST() throws InterruptedException {
        logger.info("/edo-employee-api.edo-lt.svc.cluster.local");

        return "{\n" +
                "    \"employee\": {\n" +
                "        \"userId\": \"U_M13A5\",\n" +
                "        \"firstName\": \"Евгений\",\n" +
                "        \"lastName\": \"Кузнецов\",\n" +
                "        \"middleName\": \"Александрович\",\n" +
                "        \"fullName\": \"Кузнецов Евгений Александрович\",\n" +
                "        \"position\": \"Ведущий системный аналитик\",\n" +
                "        \"email\": \"EKuznetsov2@alfabank.ru\",\n" +
                "        \"workPhoneNumber\": \"0503309\",\n" +
                "        \"snils\": null,\n" +
                "        \"roles\": [],\n" +
                "        \"productTypes\": [],\n" +
                "        \"groups\": [\n" +
                "            \"CN=Users-IT,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=CD-DVD_MIIS_DENY,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-odata-read-test,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-read-test,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=SEB-SOZ,OU=Groups,OU=SB,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_Stash,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=iPhones,OU=Connectra,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=SGSA - Читатели,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_CP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp dev,OU=SLX,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_ConfluenceRO,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-read-live,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=PIL2_BRN,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=AlfaConnectUsers,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=knbrb_read_oo_zpp_corp,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=pim_users_external,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira_Confluence,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=sp_ord_it,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Кредитный конвейер - Write,OU=Блок Информационные технологии,OU=ITFS,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=PURMS2 Staff Users,OU=PURMS2,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Role_LRS_Extended,OU=LRS Print Management,OU=Roles,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Матрица доступа FIM - ЦО NEW,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=edo-read-live,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=TermBC_Std_Med_SN_FH_IT_MSK_FIM,OU=BC_FIM_GROUP,OU=BlueCoatProxy,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Jira,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=edo-read-test,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=Users-Moscow-region,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=skp-odata-read-live,OU=UPBP,OU=Группы,OU=Центральный Офис,DC=moscow,DC=alfaintra,DC=net\",\n" +
                "            \"CN=USB_MIIS_DENY,OU=MIISGroups,OU=MIIS,DC=moscow,DC=alfaintra,DC=net\"\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }


    ///////
    @RequestMapping(value="/CheckClientKB_TEST/Check_KB", method=RequestMethod.POST, produces="application/soap+xml; charset=utf-8")
    public @ResponseBody String employeePOSTSOAP(@RequestBody String RequestBody) throws InterruptedException {
        logger.info("employeePOSTSOAP");
        String id;
        id = ""+(int)(Math.random()*100000);
        if(RequestBody.contains("<ID>")) {
            id = StringUtils.substringBetween(RequestBody, "<ID>", "</ID>");
        }
        return "<S:Envelope xmlns:S=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "<S:Body>\n" +
                "<ns0:CheckULResponse xmlns:ns0=\"http://checkclient/\">\n" +
                "<return>\n" +
                "<IOException>OK</IOException>\n" +
                "<requestID>"+id+"</requestID>\n" +
                "</return>\n" +
                "</ns0:CheckULResponse>\n" +
                "</S:Body>\n" +
                "</S:Envelope>";
    }
}


