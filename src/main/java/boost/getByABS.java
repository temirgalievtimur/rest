package boost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class getByABS {
    static String pin="";
    static String relation="";
    static long requestCounter = 0; //счетчик количества вызывов
    static Map<String, String> pinsMap = new HashMap<String,String>();
    //static long numberOfNineSymbol = 200000000;
   // static long numberOfNineSymbol = Long.parseLong((System.currentTimeMillis()+"").substring(4,(System.currentTimeMillis()+"").length()));
    private static Logger logger = LoggerFactory.getLogger(getByABS.class);

    @RequestMapping(value="/mdm/relationinfo/v10/rest/getByABS", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody String getByABSGET(@RequestParam("pin") String xmlInput) throws InterruptedException {
        logger.info("request to /mdm/relationinfo/v10/rest/getByABS, pin " + xmlInput);
        Thread.sleep(100);
        //1
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3088210")) {
            logger.info("Default mapping for ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3088210, for 1 STUB");
            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 0\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": null,\n" +
                    "                    \"requiredSubRoleCode\": null,\n" +
                    "                    \"requiredSubPin\": null,\n" +
                    "                    \"requiredSubAbsCode\": null,\n" +
                    "                    \"relatedSubRoleCode\": null,\n" +
                    "                    \"relatedSubPin\": null,\n" +
                    "                    \"relatedSubAbsCode\": null,\n" +
                    "                    \"open\": null,\n" +
                    "                    \"close\": null,\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": null\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
            logger.debug("response " + response);
            return response;
        }
        //2
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3563871")) {
            logger.info("Default mapping 2 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3563871 , for 1 STUB");
            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 1\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": 95827902,\n" +
                    "                    \"requiredSubRoleCode\": \"SubjectRelationRole_HeadCompanyCPR\",\n" +
                    "                    \"requiredSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3563871\",\n" +
                    "                    \"requiredSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"relatedSubRoleCode\": \"SubjectRelationRole_CPR\",\n" +
                    "                    \"relatedSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACC-103608\",\n" +
                    "                    \"relatedSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"open\": \"2020-12-14 20:18:27\",\n" +
                    "                    \"close\": \"2100-01-01 00:00:00\",\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": \"ABS_SFAProd\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";

            logger.debug("response " + response);
            return response;
        }
        //3
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-1343853")) {
            logger.info("Default mapping 3 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-1343853, for 1 STUB");

            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 0\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": null,\n" +
                    "                    \"requiredSubRoleCode\": null,\n" +
                    "                    \"requiredSubPin\": null,\n" +
                    "                    \"requiredSubAbsCode\": null,\n" +
                    "                    \"relatedSubRoleCode\": null,\n" +
                    "                    \"relatedSubPin\": null,\n" +
                    "                    \"relatedSubAbsCode\": null,\n" +
                    "                    \"open\": null,\n" +
                    "                    \"close\": null,\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": null\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
            logger.debug("response " + response);
            return response;
        }
        //4
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3462599")) {
            logger.info("Default mapping 4 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3462599, for 1 STUB");
            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 1\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": 95597538,\n" +
                    "                    \"requiredSubRoleCode\": \"SubjectRelationRole_CompanyCPR\",\n" +
                    "                    \"requiredSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3462599\",\n" +
                    "                    \"requiredSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"relatedSubRoleCode\": \"SubjectRelationRole_CPR\",\n" +
                    "                    \"relatedSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACC-44424\",\n" +
                    "                    \"relatedSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"open\": \"2020-12-06 11:03:12\",\n" +
                    "                    \"close\": \"2100-01-01 00:00:00\",\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": \"ABS_SFAProd\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
            logger.debug("response " + response);
            return response;
        }
        //5
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-733512")) {
            logger.info("Default mapping 5 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-733512, for 1 STUB");

            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 1\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": 95571863,\n" +
                    "                    \"requiredSubRoleCode\": \"SubjectRelationRole_CompanyCPR\",\n" +
                    "                    \"requiredSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACB-733512\",\n" +
                    "                    \"requiredSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"relatedSubRoleCode\": \"SubjectRelationRole_CPR\",\n" +
                    "                    \"relatedSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACC-98209\",\n" +
                    "                    \"relatedSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"open\": \"2020-12-06 05:18:25\",\n" +
                    "                    \"close\": \"2100-01-01 00:00:00\",\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": \"ABS_SFAProd\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";

            logger.debug("response " + response);
            return response;
        }
        //6
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-175828")) {
            logger.info("Default mapping 6 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-175828, for 1 STUB");

            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 1\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [{\n" +
                    "                    \"idRelation\": 95754914,\n" +
                    "                    \"requiredSubRoleCode\": \"SubjectRelationRole_HeadCompanyCPR\",\n" +
                    "                    \"requiredSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACB-175828\",\n" +
                    "                    \"requiredSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"relatedSubRoleCode\": \"SubjectRelationRole_CPR\",\n" +
                    "                    \"relatedSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACC-99464\",\n" +
                    "                    \"relatedSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"open\": \"2020-12-12T08:17:54.030\",\n" +
                    "                    \"close\": \"2100-01-01T00:00:00\",\n" +
                    "                    \"absCode\": \"ABS_SFAProd\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n";

            logger.debug("response " + response);
            return response;
        }
        //7
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-87934")) {
            logger.info("Default mapping 7 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-87934, for 1 STUB");
            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 1\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": 95753066,\n" +
                    "                    \"requiredSubRoleCode\": \"SubjectRelationRole_HeadCompanyCPR\",\n" +
                    "                    \"requiredSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACB-87934\",\n" +
                    "                    \"requiredSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"relatedSubRoleCode\": \"SubjectRelationRole_CPR\",\n" +
                    "                    \"relatedSubPin\": \"ABR-FW-SCRMFW-WORK-ACCOUNT ACC-40417\",\n" +
                    "                    \"relatedSubAbsCode\": \"ABS_SFAProd\",\n" +
                    "                    \"open\": \"2020-12-12 07:52:59\",\n" +
                    "                    \"close\": \"2100-01-01 00:00:00\",\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": \"ABS_SFAProd\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";

            logger.debug("response " + response);
            return response;
        }
        //8
        if(xmlInput.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB-114066")) {
            logger.info("Default mapping 8 ABR-FW-SCRMFW-WORK-ACCOUNT ACB-114066, for 1 STUB");
            String response = "{\n" +
                    "    \"outParms\": {\n" +
                    "        \"pageManager\": {\n" +
                    "            \"pageNumber\": 1,\n" +
                    "            \"pageLength\": 100,\n" +
                    "            \"totalNumber\": 0\n" +
                    "        },\n" +
                    "        \"relations\": {\n" +
                    "            \"relation\": [\n" +
                    "                {\n" +
                    "                    \"idRelation\": null,\n" +
                    "                    \"requiredSubRoleCode\": null,\n" +
                    "                    \"requiredSubPin\": null,\n" +
                    "                    \"requiredSubAbsCode\": null,\n" +
                    "                    \"relatedSubRoleCode\": null,\n" +
                    "                    \"relatedSubPin\": null,\n" +
                    "                    \"relatedSubAbsCode\": null,\n" +
                    "                    \"open\": null,\n" +
                    "                    \"close\": null,\n" +
                    "                    \"positionCode\": null,\n" +
                    "                    \"typeCode\": null,\n" +
                    "                    \"description\": null,\n" +
                    "                    \"statusCode\": null,\n" +
                    "                    \"absCode\": null\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
            logger.debug("response " + response);
            return response;
        }
        else
         {
             //инкрементируем 9 значное число
             //numberOfNineSymbol++;
                if(pinsMap.containsKey(xmlInput)){//если такой пин уже приходил, то не меняй тело
                    logger.info("No default mapping, request NO " + requestCounter + "Pin " + xmlInput+" is the same, size same pins " + pinsMap.size());
                    String response = pinsMap.get(xmlInput);
                    logger.debug("response " + response);
                    return response;
                }
                else{
                    //если такого пина не было, то нужно поменять пин вызовом метода relationMaker
                    //метод принимает xmlInput и количество вызовов всего, чтобы определить нужно ли вернуть массив аж из 700 вызовов
                    relation = relationMaker(xmlInput);
                    String response = "{\n" +
                            "\"outParms\": {\n" +
                            "\"pageManager\": {\n" +
                            "\"pageNumber\": 1,\n" +
                            "\"pageLength\": 100,\n" +
                            "\"totalNumber\": 8\n" +
                            "},\n" +
                            "\"relations\": {\n" +
                            "\"relation\": [" +
                                relation.substring(1,relation.length())
                            +
                            "]\n" +
                            "}\n" +
                            "}\n" +
                            "}";

                    pinsMap.put(xmlInput,response);
                    logger.debug("response " + response);
                    return response;
             }
         }
    }
    static String relationMaker(String pinSfa){
        //инкрементируем количество интересных нам вызывов
        requestCounter ++;
        int countOfBlocks = 0;
        int i = 0;
        String requested = "";
        if(requestCounter == 5000 || requestCounter == 500){//TODO поменять на 5000 вызовов, если 5000 вызовов, то делаем большой блок, иначе обойдемся блоками от 5 до 20
            countOfBlocks = 700;
            logger.info("700 блоков");
        }
        else{
            countOfBlocks = 5 + (int)(15.0 * Math.random());
        }
        logger.info("No default mapping, request NO " + requestCounter+ " ,count blocks  " + countOfBlocks);
        //numberOfNineSymbol++;
        while(i<countOfBlocks){
            //@idRelationX = число 9 знаков
            //@clientPinSfaX = ABR-FW-SCRMFW-WORK-ACCOUNT ACB-@@@@@@@@@
            //@cprPinSfa = ABR-FW-SCRMFW-WORK-ACCOUNT ACC-@@@@@@@@@ - из самого GET-запроса
                requested = requested +","+
                        "{\n"+
                       // "\"idRelation\":" +numberOfNineSymbol+",\n" +
                        "\"idRelation\":" +rndlen(9)+",\n" +
                        "\"requiredSubRoleCode\": \"SubjectRelationRole_CPR\",\n" +
                        "\"requiredSubPin\": \""+pinSfa+"\",\n" +
                        "\"requiredSubAbsCode\": \"ABS_SFAProd\",\n" +
                        "\"relatedSubRoleCode\": \"SubjectRelationRole_CompanyCPR\",\n" +
                        "\"relatedSubPin\": \""+"ABR-FW-SCRMFW-WORK-ACCOUNT ACB-"+rndlen(9)+"\",\n" +
                        "\"relatedSubAbsCode\": \"ABS_SFAProd\",\n" +
                        "\"open\": \"2020-10-18 15:14:06\",\n" +
                        "\"close\": \"2100-01-01 00:00:00\",\n" +
                        "\"positionCode\": null,\n" +
                        "\"typeCode\": null,\n" +
                        "\"description\": null,\n" +
                        "\"statusCode\": null,\n" +
                        "\"absCode\": \"ABS_SFAProd\"\n" +
                        "}\n";
            //numberOfNineSymbol++;
            i++;
        }
        return requested;
    }

    public static String rndlen(int length)    {

        if(length==8){
            int max = 100000000;
            int min = 10000000;
            max -= min;
            return (int) (Math.random() * ++max) + min+"";
        }
        if(length==9){
            int max = 1000000000;
            int min = 100000000;
            max -= min;
            return (int) (Math.random() * ++max) + min+"";
        }
        if(length==10){
            int max = 1000000000;
            int min = 100000000;
            max -= min;
            return (int) ((Math.random() * ++max) + min) +"" + "0";
        }
        else{
            return "";
        }
    }
}


