package boost;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.io.FileNotFoundException;

@RestController
public class UWSConsumerSubjectInfoGet27 {

//    static long numberOfEightSymbol = Long.parseLong((System.currentTimeMillis()+"").substring(5,(System.currentTimeMillis()+"").length()));
//    static long numberOfNineSymbol = Long.parseLong((System.currentTimeMillis()+"").substring(4,(System.currentTimeMillis()+"").length()));
//    static long numberOfTenSymbol = Long.parseLong((System.currentTimeMillis()+"").substring(3,(System.currentTimeMillis()+"").length()));
//    static long numberOfFive = Long.parseLong((System.currentTimeMillis()+"").substring(8,(System.currentTimeMillis()+"").length()));


    private static Logger logger = LoggerFactory.getLogger(UWSConsumerSubjectInfoGet27.class);

    @RequestMapping(value="/MDM/UWSConsumerSubjectInfoGet27/SOAP", method=RequestMethod.POST, produces={"text/xml; charset=utf-8"})
    public @ResponseBody String SOAP_UWSConsumerSubjectInfoGet27(@RequestBody String RequestBody) throws InterruptedException, FileNotFoundException {
//        numberOfEightSymbol++;
//        numberOfNineSymbol++;
//        numberOfTenSymbol++;
//        numberOfFive++;
        Thread.sleep(100);
        String cprPinSfa = StringUtils.substringBetween(RequestBody, "<pin>", "</pin>");//UWSConsumerSubjectInfoGetGetListResponse в теле
        String namePattern = StringUtils.substringBetween(RequestBody, "<name_pattern>", "</name_pattern>");
        logger.info("request to /MDM/UWSConsumerSubjectInfoGet27/SOAP");
        logger.debug("RequestBody " + RequestBody);
        //специальный namepattern
        if(namePattern!=null && namePattern.contains("КРЫМ") || namePattern!=null && namePattern.contains("крым")){

            logger.info("Special pattern Crimea, request number 1");
            String response =  "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                    "   <soapenv:Body>\n" +
                    "      <dlwmin:UWSConsumerSubjectInfoGetGetListResponse xmlns:dlwmin=\"http://UWSConsumerSubjectInfoGet27.MDM.ws.alfabank.ru\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                    "         <response xmlns:ns3=\"http://WSCommonTypes10.CS.ws.alfabank.ru\">\n" +
                    "            <outCommonParms>\n" +
                    "               <outCommonParmsExt>\n" +
                    "                  <name>logUID</name>\n" +
                    "                  <value>wststcmp.mdmws-210603-164610-27338</value>\n" +
                    "               </outCommonParmsExt>\n" +
                    "            </outCommonParms>\n" +
                    "            <outParms>\n" +
                    "               <subList>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>13913</idABS>\n" +
                    "                           <aBSCode>ABS_LM</aBSCode>\n" +
                    "                           <idSubABS>5404385</idSubABS>\n" +
                    "                           <idSub>2038988</idSub>\n" +
                    "                           <pin>3314215</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>12727042</idSubABS>\n" +
                    "                           <idSub>6814321</idSub>\n" +
                    "                           <pin>A6UJ9A00056L</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>1</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4188</idABS>\n" +
                    "                           <aBSCode>ABS_EQ</aBSCode>\n" +
                    "                           <idSubABS>139315289</idSubABS>\n" +
                    "                           <idSub>106668816</idSub>\n" +
                    "                           <pin>U31636</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>158597437</idSubABS>\n" +
                    "                           <idSub>119926168</idSub>\n" +
                    "                           <pin>0_31636</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1462807</idABS>\n" +
                    "                           <aBSCode>ABS_DWH</aBSCode>\n" +
                    "                           <idSubABS>228428381</idSubABS>\n" +
                    "                           <idSub>177249495</idSub>\n" +
                    "                           <pin>5525591017</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1492476</idABS>\n" +
                    "                           <aBSCode>ABS_AMS</aBSCode>\n" +
                    "                           <idSubABS>328942034</idSubABS>\n" +
                    "                           <idSub>262549036</idSub>\n" +
                    "                           <pin>5990594</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>367357531</idSubABS>\n" +
                    "                           <idSub>287565428</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3088210</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461770</idABS>\n" +
                    "                           <aBSCode>ABS_SFAQA</aBSCode>\n" +
                    "                           <idSubABS>374096688</idSubABS>\n" +
                    "                           <idSub>292895034</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-261222</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7122</idResType>\n" +
                    "                           <resTypeCode>ResidentType_30</resTypeCode>\n" +
                    "                           <idSub>29604961</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>9601069356</inn>\n" +
                    "                           <name>Компания  ия \"Крым\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>29604961</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <kPP>960101001</kPP>\n" +
                    "                           <oGRNDate>1900-01-01</oGRNDate>\n" +
                    "                           <regChamberDate>2001-05-28</regChamberDate>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>250435173</idSubABS>\n" +
                    "                           <idSub>209025020</idSub>\n" +
                    "                           <pin>10811979_NONE_4501210863</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idSub>209025020</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>4501210863</inn>\n" +
                    "                           <name>ОБЩЕСТВО  МОС КРЫМ\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>209025020</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <kPP>450101001</kPP>\n" +
                    "                           <oGRN>1164501057060</oGRN>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>250895693</idSubABS>\n" +
                    "                           <idSub>209325101</idSub>\n" +
                    "                           <pin>8968606_NONE_6147037385</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idSub>209325101</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>6147037385</inn>\n" +
                    "                           <name>ОБЩЕСТВО  ЕКС-КРЫМ\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>209325101</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <kPP>611401001</kPP>\n" +
                    "                           <oGRN>1136191001110</oGRN>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>11117633</idSubABS>\n" +
                    "                           <idSub>6015651</idSub>\n" +
                    "                           <pin>D-52224509</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>11873311</idSubABS>\n" +
                    "                           <idSub>6386460</idSub>\n" +
                    "                           <pin>ASLX7A007CZW</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>1</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4188</idABS>\n" +
                    "                           <aBSCode>ABS_EQ</aBSCode>\n" +
                    "                           <idSubABS>47326484</idSubABS>\n" +
                    "                           <idSub>30445212</idSub>\n" +
                    "                           <pin>UAMVCG</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>4186</idABS>\n" +
                    "                           <aBSCode>ABS_ODS</aBSCode>\n" +
                    "                           <idSubABS>150692601</idSubABS>\n" +
                    "                           <idSub>115418801</idSub>\n" +
                    "                           <pin>18-89591</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>13913</idABS>\n" +
                    "                           <aBSCode>ABS_LM</aBSCode>\n" +
                    "                           <idSubABS>150692603</idSubABS>\n" +
                    "                           <idSub>115418801</idSub>\n" +
                    "                           <pin>33698506</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>158240432</idSubABS>\n" +
                    "                           <idSub>120760897</idSub>\n" +
                    "                           <pin>18_89591</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1462807</idABS>\n" +
                    "                           <aBSCode>ABS_DWH</aBSCode>\n" +
                    "                           <idSubABS>228284939</idSubABS>\n" +
                    "                           <idSub>177280958</idSub>\n" +
                    "                           <pin>33253172981</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>249298984</idSubABS>\n" +
                    "                           <idSub>208373073</idSub>\n" +
                    "                           <pin>9493480_UAMVCG_9103003560</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>123754</idABS>\n" +
                    "                           <aBSCode>ABS_ALBO</aBSCode>\n" +
                    "                           <idSubABS>266053961</idSubABS>\n" +
                    "                           <idSub>224216712</idSub>\n" +
                    "                           <pin>1714983</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>374000561</idSubABS>\n" +
                    "                           <idSub>292814426</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3563871</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221434374</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>9103003560</inn>\n" +
                    "                           <name>Общество  арбрендс\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221434374</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <idOKOPF>160500</idOKOPF>\n" +
                    "                           <oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                    "                           <kPP>910301001</kPP>\n" +
                    "                           <oGRNDate>2014-08-25</oGRNDate>\n" +
                    "                           <regChamberDate>1900-01-01</regChamberDate>\n" +
                    "                           <oGRN>1149102034300</oGRN>\n" +
                    "                           <oKATO>35419000076</oKATO>\n" +
                    "                           <idTaxationSystem>1473434</idTaxationSystem>\n" +
                    "                           <taxationSystemCode>TaxationSystem_6</taxationSystemCode>\n" +
                    "                           <employeesNumber>12</employeesNumber>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>155864049</idSubABS>\n" +
                    "                           <idSub>118980621</idSub>\n" +
                    "                           <pin>ASLX7A00BFB1</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>138522</idABS>\n" +
                    "                           <aBSCode>ABS_SPARK</aBSCode>\n" +
                    "                           <idSubABS>243572863</idSubABS>\n" +
                    "                           <idSub>204389447</idSub>\n" +
                    "                           <pin>11373595</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>250289247</idSubABS>\n" +
                    "                           <idSub>208917924</idSub>\n" +
                    "                           <pin>11373595_NONE_7724401144</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>326407551</idSubABS>\n" +
                    "                           <idSub>260931491</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-1343853</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221697932</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>7724401144</inn>\n" +
                    "                           <name>ООО  КРЫМ</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221697932</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <idOKOPF>160500</idOKOPF>\n" +
                    "                           <oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                    "                           <kPP>772401001</kPP>\n" +
                    "                           <oGRN>1177746142518</oGRN>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>211095599</idSubABS>\n" +
                    "                           <idSub>161677265</idSub>\n" +
                    "                           <pin>ASLX8B004H4O</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>225370922</idSubABS>\n" +
                    "                           <idSub>174362931</idSub>\n" +
                    "                           <pin>D-290637451</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>225211615</idSubABS>\n" +
                    "                           <idSub>174402948</idSub>\n" +
                    "                           <pin>D-290495311</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>138522</idABS>\n" +
                    "                           <aBSCode>ABS_SPARK</aBSCode>\n" +
                    "                           <idSubABS>243576955</idSubABS>\n" +
                    "                           <idSub>204398832</idSub>\n" +
                    "                           <pin>11548163</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>249240337</idSubABS>\n" +
                    "                           <idSub>208337367</idSub>\n" +
                    "                           <pin>11548163_NONE_2311239028</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1492476</idABS>\n" +
                    "                           <aBSCode>ABS_AMS</aBSCode>\n" +
                    "                           <idSubABS>329703501</idSubABS>\n" +
                    "                           <idSub>263031001</idSub>\n" +
                    "                           <pin>6119546</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>372612506</idSubABS>\n" +
                    "                           <idSub>291839756</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-3462599</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221726619</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>2311239028</inn>\n" +
                    "                           <name>\"ООО  ЛЕКС\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221726619</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <idOKOPF>160500</idOKOPF>\n" +
                    "                           <oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                    "                           <kPP>231101001</kPP>\n" +
                    "                           <oGRN>1172375049032</oGRN>\n" +
                    "                           <employeesNumber>0</employeesNumber>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>11420158</idSubABS>\n" +
                    "                           <idSub>6155104</idSub>\n" +
                    "                           <pin>ASLX7A001R79</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>1</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4188</idABS>\n" +
                    "                           <aBSCode>ABS_EQ</aBSCode>\n" +
                    "                           <idSubABS>139168055</idSubABS>\n" +
                    "                           <idSub>106521566</idSub>\n" +
                    "                           <pin>UAH368</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>159781770</idSubABS>\n" +
                    "                           <idSub>120440365</idSub>\n" +
                    "                           <pin>0_28635807</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>138522</idABS>\n" +
                    "                           <aBSCode>ABS_SPARK</aBSCode>\n" +
                    "                           <idSubABS>162483663</idSubABS>\n" +
                    "                           <idSub>123065255</idSub>\n" +
                    "                           <pin>3769200</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>164662042</idSubABS>\n" +
                    "                           <idSub>124546103</idSub>\n" +
                    "                           <pin>D-133920736</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1462807</idABS>\n" +
                    "                           <aBSCode>ABS_DWH</aBSCode>\n" +
                    "                           <idSubABS>204759764</idSubABS>\n" +
                    "                           <idSub>155445759</idSub>\n" +
                    "                           <pin>29415425748</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>13913</idABS>\n" +
                    "                           <aBSCode>ABS_LM</aBSCode>\n" +
                    "                           <idSubABS>215305382</idSubABS>\n" +
                    "                           <idSub>165308848</idSub>\n" +
                    "                           <pin>59390430</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>250938589</idSubABS>\n" +
                    "                           <idSub>209362035</idSub>\n" +
                    "                           <pin>3769200_NONE_1903011559</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>257060094</idSubABS>\n" +
                    "                           <idSub>216520513</idSub>\n" +
                    "                           <pin>3769200_UAH368_1903011559</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1492476</idABS>\n" +
                    "                           <aBSCode>ABS_AMS</aBSCode>\n" +
                    "                           <idSubABS>293784811</idSubABS>\n" +
                    "                           <idSub>240001637</idSub>\n" +
                    "                           <pin>756932</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>295836440</idSubABS>\n" +
                    "                           <idSub>241283627</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-733512</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221861069</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>1903011559</inn>\n" +
                    "                           <name>ГОСУДАРСТВЕННОЕ  НАЯБЕЗОПАСНОСТЬ\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221861069</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <kPP>190301001</kPP>\n" +
                    "                           <oGRNDate>2003-01-08</oGRNDate>\n" +
                    "                           <regChamberDate>1999-11-04</regChamberDate>\n" +
                    "                           <oGRN>1031900696541</oGRN>\n" +
                    "                           <oKATO>95415000000</oKATO>\n" +
                    "                           <idTaxationSystem>1473433</idTaxationSystem>\n" +
                    "                           <taxationSystemCode>TaxationSystem_5</taxationSystemCode>\n" +
                    "                           <employeesNumber>9</employeesNumber>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>1</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4188</idABS>\n" +
                    "                           <aBSCode>ABS_EQ</aBSCode>\n" +
                    "                           <idSubABS>209096947</idSubABS>\n" +
                    "                           <idSub>159781177</idSub>\n" +
                    "                           <pin>UATW31</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1486629</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP</aBSCode>\n" +
                    "                           <idSubABS>209431447</idSubABS>\n" +
                    "                           <idSub>160091955</idSub>\n" +
                    "                           <pin>AO-428569</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1462807</idABS>\n" +
                    "                           <aBSCode>ABS_DWH</aBSCode>\n" +
                    "                           <idSubABS>209449330</idSubABS>\n" +
                    "                           <idSub>160106597</idSub>\n" +
                    "                           <pin>47227877897</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>209469377</idSubABS>\n" +
                    "                           <idSub>160117066</idSub>\n" +
                    "                           <pin>ASLX8B00484X</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>209803637</idSubABS>\n" +
                    "                           <idSub>160479385</idSub>\n" +
                    "                           <pin>6_1000181345</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>13913</idABS>\n" +
                    "                           <aBSCode>ABS_LM</aBSCode>\n" +
                    "                           <idSubABS>217066920</idSubABS>\n" +
                    "                           <idSub>166800001</idSub>\n" +
                    "                           <pin>57768554</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>4186</idABS>\n" +
                    "                           <aBSCode>ABS_ODS</aBSCode>\n" +
                    "                           <idSubABS>217066921</idSubABS>\n" +
                    "                           <idSub>166800001</idSub>\n" +
                    "                           <pin>6-1000181345</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>247573805</idSubABS>\n" +
                    "                           <idSub>207216430</idSub>\n" +
                    "                           <pin>0_37338683</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>249246817</idSubABS>\n" +
                    "                           <idSub>208341430</idSub>\n" +
                    "                           <pin>4398261_UATW31_7444038721</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>252417505</idSubABS>\n" +
                    "                           <idSub>210496660</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-175828</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>138522</idABS>\n" +
                    "                           <aBSCode>ABS_SPARK</aBSCode>\n" +
                    "                           <idSubABS>254925105</idSubABS>\n" +
                    "                           <idSub>212357582</idSub>\n" +
                    "                           <pin>4398261</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>256514042</idSubABS>\n" +
                    "                           <idSub>216152673</idSub>\n" +
                    "                           <pin>D-391402438</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1492476</idABS>\n" +
                    "                           <aBSCode>ABS_AMS</aBSCode>\n" +
                    "                           <idSubABS>294042890</idSubABS>\n" +
                    "                           <idSub>240171555</idSub>\n" +
                    "                           <pin>777944</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>1496268</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP_APP</aBSCode>\n" +
                    "                           <idSubABS>357509905</idSubABS>\n" +
                    "                           <idSub>280467694</idSub>\n" +
                    "                           <pin>A-1888424</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1486629</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP</aBSCode>\n" +
                    "                           <idSubABS>357509903</idSubABS>\n" +
                    "                           <idSub>280467694</idSub>\n" +
                    "                           <pin>UATW31</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221885937</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>7444038721</inn>\n" +
                    "                           <name>ОБЩЕСТВО  ЕЙФ-КРЫМ\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221885937</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <idOKOPF>160500</idOKOPF>\n" +
                    "                           <oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                    "                           <kPP>745501001</kPP>\n" +
                    "                           <oGRNDate>2003-04-15</oGRNDate>\n" +
                    "                           <regChamberDate>1900-01-01</regChamberDate>\n" +
                    "                           <oGRN>1037402052731</oGRN>\n" +
                    "                           <oKATO>75438369000</oKATO>\n" +
                    "                           <idTaxationSystem>1473433</idTaxationSystem>\n" +
                    "                           <taxationSystemCode>TaxationSystem_5</taxationSystemCode>\n" +
                    "                           <employeesNumber>20</employeesNumber>\n" +
                    "                           <inceptionDate>2003-04-15</inceptionDate>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>225711277</idSubABS>\n" +
                    "                           <idSub>174799032</idSub>\n" +
                    "                           <pin>D-292815380</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>226151674</idSubABS>\n" +
                    "                           <idSub>175222669</idSub>\n" +
                    "                           <pin>ASLX8B007RBG</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>1</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4188</idABS>\n" +
                    "                           <aBSCode>ABS_EQ</aBSCode>\n" +
                    "                           <idSubABS>227500415</idSubABS>\n" +
                    "                           <idSub>176542522</idSub>\n" +
                    "                           <pin>UAVUWH</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>4186</idABS>\n" +
                    "                           <aBSCode>ABS_ODS</aBSCode>\n" +
                    "                           <idSubABS>229144612</idSubABS>\n" +
                    "                           <idSub>176573743</idSub>\n" +
                    "                           <pin>18-150800</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>13913</idABS>\n" +
                    "                           <aBSCode>ABS_LM</aBSCode>\n" +
                    "                           <idSubABS>227544876</idSubABS>\n" +
                    "                           <idSub>176573743</idSub>\n" +
                    "                           <pin>67409921</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1462807</idABS>\n" +
                    "                           <aBSCode>ABS_DWH</aBSCode>\n" +
                    "                           <idSubABS>227854470</idSubABS>\n" +
                    "                           <idSub>176867539</idSub>\n" +
                    "                           <pin>52677386328</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1486629</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP</aBSCode>\n" +
                    "                           <idSubABS>228240659</idSubABS>\n" +
                    "                           <idSub>177225313</idSub>\n" +
                    "                           <pin>AO-537937</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>228539385</idSubABS>\n" +
                    "                           <idSub>177420097</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-87934</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>228763587</idSubABS>\n" +
                    "                           <idSub>177629746</idSub>\n" +
                    "                           <pin>18_150800</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>249880016</idSubABS>\n" +
                    "                           <idSub>208674686</idSub>\n" +
                    "                           <pin>9296425_UAVUWH_9102001271</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>1496268</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP_APP</aBSCode>\n" +
                    "                           <idSubABS>326607250</idSubABS>\n" +
                    "                           <idSub>261058659</idSub>\n" +
                    "                           <pin>A-1558185</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>1496268</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP_APP</aBSCode>\n" +
                    "                           <idSubABS>369688250</idSubABS>\n" +
                    "                           <idSub>261058659</idSub>\n" +
                    "                           <pin>A-2032650</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1486629</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP</aBSCode>\n" +
                    "                           <idSubABS>326607248</idSubABS>\n" +
                    "                           <idSub>261058659</idSub>\n" +
                    "                           <pin>UAVUWH</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1492476</idABS>\n" +
                    "                           <aBSCode>ABS_AMS</aBSCode>\n" +
                    "                           <idSubABS>338127728</idSubABS>\n" +
                    "                           <idSub>267951833</idSub>\n" +
                    "                           <pin>6799817</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>138522</idABS>\n" +
                    "                           <aBSCode>ABS_SPARK</aBSCode>\n" +
                    "                           <idSubABS>362457855</idSubABS>\n" +
                    "                           <idSub>284114476</idSub>\n" +
                    "                           <pin>9296425</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221899226</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>9102001271</inn>\n" +
                    "                           <name>Общество  КРИСТАЛЛ\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221899226</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <idOKOPF>160500</idOKOPF>\n" +
                    "                           <oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                    "                           <kPP>910201001</kPP>\n" +
                    "                           <oGRNDate>2014-04-25</oGRNDate>\n" +
                    "                           <regChamberDate>1900-01-01</regChamberDate>\n" +
                    "                           <oGRN>1149102001157</oGRN>\n" +
                    "                           <oKATO>35401000000</oKATO>\n" +
                    "                           <idTaxationSystem>1473433</idTaxationSystem>\n" +
                    "                           <taxationSystemCode>TaxationSystem_5</taxationSystemCode>\n" +
                    "                           <employeesNumber>98</employeesNumber>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <pinList>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>97106</idABS>\n" +
                    "                           <aBSCode>ABS_RK</aBSCode>\n" +
                    "                           <idSubABS>5159831</idSubABS>\n" +
                    "                           <idSub>1854037</idSub>\n" +
                    "                           <pin>10860377</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>13913</idABS>\n" +
                    "                           <aBSCode>ABS_LM</aBSCode>\n" +
                    "                           <idSubABS>5159833</idSubABS>\n" +
                    "                           <idSub>1854037</idSub>\n" +
                    "                           <pin>18553542</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>160473</idABS>\n" +
                    "                           <aBSCode>ABS_CRM_BMB</aBSCode>\n" +
                    "                           <idSubABS>8972632</idSubABS>\n" +
                    "                           <idSub>4898254</idSub>\n" +
                    "                           <pin>D-30166507</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4187</idABS>\n" +
                    "                           <aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "                           <idSubABS>11556290</idSubABS>\n" +
                    "                           <idSub>6224058</idSub>\n" +
                    "                           <pin>ASLX7A003MFN</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>1</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>4188</idABS>\n" +
                    "                           <aBSCode>ABS_EQ</aBSCode>\n" +
                    "                           <idSubABS>47282941</idSubABS>\n" +
                    "                           <idSub>30381799</idSub>\n" +
                    "                           <pin>UAKDCF</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1474118</idABS>\n" +
                    "                           <aBSCode>ABS_ODS_SKS</aBSCode>\n" +
                    "                           <idSubABS>159587990</idSubABS>\n" +
                    "                           <idSub>120615874</idSub>\n" +
                    "                           <pin>14_126142</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>138522</idABS>\n" +
                    "                           <aBSCode>ABS_SPARK</aBSCode>\n" +
                    "                           <idSubABS>162735151</idSubABS>\n" +
                    "                           <idSub>122960621</idSub>\n" +
                    "                           <pin>9552254</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1462807</idABS>\n" +
                    "                           <aBSCode>ABS_DWH</aBSCode>\n" +
                    "                           <idSubABS>228465007</idSubABS>\n" +
                    "                           <idSub>177335529</idSub>\n" +
                    "                           <pin>30906171527</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1461773</idABS>\n" +
                    "                           <aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "                           <idSubABS>237894849</idSubABS>\n" +
                    "                           <idSub>192748636</idSub>\n" +
                    "                           <pin>ABR-FW-SCRMFW-WORK-ACCOUNT ACB-114066</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1586512</idABS>\n" +
                    "                           <aBSCode>ABS_DWH4DM</aBSCode>\n" +
                    "                           <idSubABS>249240436</idSubABS>\n" +
                    "                           <idSub>208337399</idSub>\n" +
                    "                           <pin>9552254_UAKDCF_7017362724</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1492476</idABS>\n" +
                    "                           <aBSCode>ABS_AMS</aBSCode>\n" +
                    "                           <idSubABS>293893498</idSubABS>\n" +
                    "                           <idSub>240075708</idSub>\n" +
                    "                           <pin>761788</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>1496268</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP_APP</aBSCode>\n" +
                    "                           <idSubABS>359944306</idSubABS>\n" +
                    "                           <idSub>282108329</idSub>\n" +
                    "                           <pin>A-1919631</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>0</sysSource>\n" +
                    "                           <idABS>1496268</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP_APP</aBSCode>\n" +
                    "                           <idSubABS>360277491</idSubABS>\n" +
                    "                           <idSub>282108329</idSub>\n" +
                    "                           <pin>A-1929390</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <main>0</main>\n" +
                    "                           <sysSource>1</sysSource>\n" +
                    "                           <idABS>1486629</idABS>\n" +
                    "                           <aBSCode>ABS_Pega_ACC_OP</aBSCode>\n" +
                    "                           <idSubABS>359944304</idSubABS>\n" +
                    "                           <idSub>282108329</idSub>\n" +
                    "                           <pin>UAKDCF</pin>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </pinList>\n" +
                    "                     <subCommon>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idResType>7121</idResType>\n" +
                    "                           <resTypeCode>ResidentType_10</resTypeCode>\n" +
                    "                           <idSub>221988280</idSub>\n" +
                    "                           <idSubType>160479</idSubType>\n" +
                    "                           <subTypeCode>SubjectType_Company</subTypeCode>\n" +
                    "                           <inn>7017362724</inn>\n" +
                    "                           <name>Общество  РСУ-Крым\"</name>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCommon>\n" +
                    "                     <subCompany>\n" +
                    "                        <resultSetRow>\n" +
                    "                           <idCompany>221988280</idCompany>\n" +
                    "                           <idCompanyType>160571</idCompanyType>\n" +
                    "                           <companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "                           <idOKOPF>160500</idOKOPF>\n" +
                    "                           <oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                    "                           <kPP>701701001</kPP>\n" +
                    "                           <oGRNDate>2014-10-06</oGRNDate>\n" +
                    "                           <regChamberDate>1900-01-01</regChamberDate>\n" +
                    "                           <oGRN>1147017019742</oGRN>\n" +
                    "                           <oKATO>69401370000</oKATO>\n" +
                    "                           <idTaxationSystem>1473429</idTaxationSystem>\n" +
                    "                           <taxationSystemCode>TaxationSystem_1</taxationSystemCode>\n" +
                    "                           <employeesNumber>5</employeesNumber>\n" +
                    "                           <inceptionDate>2014-06-19</inceptionDate>\n" +
                    "                        </resultSetRow>\n" +
                    "                     </subCompany>\n" +
                    "                  </resultSetRow>\n" +
                    "               </subList>\n" +
                    "               <technicalManager>\n" +
                    "                  <resultSetRow>\n" +
                    "                     <count>10</count>\n" +
                    "                     <pageNumber>1</pageNumber>\n" +
                    "                  </resultSetRow>\n" +
                    "               </technicalManager>\n" +
                    "            </outParms>\n" +
                    "         </response>\n" +
                    "      </dlwmin:UWSConsumerSubjectInfoGetGetListResponse>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            logger.debug(response);
            return response;
        }
        //те ЦПР, которые мы нагенерили



        if (cprPinSfa.contains("ABR-FW-SCRMFW-WORK-ACCOUNT ACB")) {
            logger.info("Artificial request, because request no 2");
            //всегда статичное, спросить по ID SUB
            String subAnal = "<subAnal>\n" +
                    "<resultSetRow>\n" +
                    "<subAnalCommon>\n" +
                    "<resultSetRow>\n" +
                    "<idSubAnal>0</idSubAnal>\n" +
                    //"<idSub>"+numberOfEightSymbol+"</idSub>\n" +//TODO
                    "<idSub>"+rndlen(8)+"</idSub>\n" +//TODO
                    "<idDebtLevel>161574</idDebtLevel>\n" +
                    "<debtLevelCode>DebtLevel_MediumDL</debtLevelCode>\n" +
                    "<idFinCond>161552</idFinCond>\n" +
                    "<finCondCode>FinancialCondition_good</finCondCode>\n" +
                    "<idRating>161369</idRating>\n" +
                    "<ratingCode>Rating_New_B</ratingCode>\n" +
                    "<idSubAnalSt>161335</idSubAnalSt>\n" +
                    "<subAnalStCode>SubjectAnalyticsStatus_Prospect</subAnalStCode>\n" +
                    "<idSegEQSKS>148536</idSegEQSKS>\n" +
                    "<segEQSKSCode>ClientCategorySKS3</segEQSKSCode>\n" +
                    "<segEQSKSDate>2019-07-01T00:00:00</segEQSKSDate>\n" +
                    "</resultSetRow>\n" +
                    "</subAnalCommon>\n" +
                    "<subCompanyAnal>\n" +
                    "<resultSetRow>\n" +
                    "<idSubAnal>0</idSubAnal>\n" +
                    "<idBusBlock>161582</idBusBlock>\n" +
                    "<busBlockCode>DealBusinessBlock_BlockCB</busBlockCode>\n" +
                    "<idClSeg>1588599</idClSeg>\n" +
                    "<clSegCode>ClientSegment_10000</clSegCode>\n" +
                    "<idRatingCB>161374</idRatingCB>\n" +
                    "<ratingCBCode>Rating_New_E</ratingCBCode>\n" +
                    "<idSubCat>14224</idSubCat>\n" +
                    "<subCatCode>ClientCategory_VIP</subCatCode>\n" +
                    "</resultSetRow>\n" +
                    "</subCompanyAnal>\n" +
                    "</resultSetRow>\n" +
                    "</subAnal>\n";
            //@clientIdSub = число 9 знаков //id любой                            //
            //@clientInn = число 10 знаков //id любой     numberOfTenSymbol                         //
            //@clientName = string(256) //любой
            //@clientKpp = число 9 знаков // любой
            //@clientOgrn = число 13 знаков // любой
            //@clientAbbr = string(48) // любой
            //@clietnPinSlx = string(12) // уникальный нет маски
            //@clientPinEq = string(6) // уникальный МАСКА UAD45H pinEq
            //@clientPinSfaX из п.3 // тот что пришел                               //готово
            //@subAnal (в любой ответ можно совать один и тот же)                   //готово
            String response = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                    "<soapenv:Body>\n" +
                    "<dlwmin:UWSConsumerSubjectInfoGetGetGoldRecResponse xmlns:dlwmin=\"http://UWSConsumerSubjectInfoGet27.MDM.ws.alfabank.ru\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                    "<response xmlns:ns3=\"http://WSCommonTypes10.CS.ws.alfabank.ru\">\n" +
                    "<outCommonParms>\n" +
                    "<outCommonParmsExt>\n" +
                    "<name>logUID</name>\n" +
                    "<value>wststcmp.mdmws-210601-100834-92362</value>\n" +
                    "</outCommonParmsExt>\n" +
                    "</outCommonParms>\n" +
                    "<outParms>\n" +
                    "<subList>\n" +
                    "<resultSetRow>\n" +
                    "<subCommon>\n" +
                    "<resultSetRow>\n" +
                    "<isBankrupt>0</isBankrupt>\n" +
                    "<idResType>7121</idResType>\n" +
                    "<resTypeCode>ResidentType_10</resTypeCode>\n" +
                        //"<idSub>"+numberOfNineSymbol+"</idSub>\n" + //9 символов, можно и рандом
                        "<idSub>"+rndlen(9)+"</idSub>\n" + //9 символов, можно и рандом
                    "<idSubType>160479</idSubType>\n" +
                    "<subTypeCode>SubjectType_Company</subTypeCode>\n" +
                        //"<inn>"+numberOfTenSymbol+"</inn>\n" +//9 символов, можно и рандом
                        "<inn>"+rndlen(9)+"</inn>\n" +//9 символов, можно и рандом
                    //рандом, большой текст
                        "<name>"+rndlen(9) + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "+
                        //"<name>"+numberOfTenSymbol + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "+
                    "</name>\n" +
                    "</resultSetRow>\n" +
                    "</subCommon>\n" +
                    "<subCompany>\n" +
                    "<resultSetRow>\n" +
                    "<externalRels>0</externalRels>\n" +
                    "<oGRNDate>1900-01-01</oGRNDate>\n" +
                    "<regChamberDate>1900-01-01</regChamberDate>\n" +
                        //"<idCompany>"+numberOfNineSymbol+"</idCompany>\n" +//9 символов, можно любой
                        "<idCompany>"+rndlen(9)+"</idCompany>\n" +//9 символов, можно любой
                    "<idCompanyType>160571</idCompanyType>\n" +
                    "<companyTypeCode>SubjectCompanyType_Jur</companyTypeCode>\n" +
                    "<idOKOPF>160500</idOKOPF>\n" +
                    "<oKOPFCode>OKOPF_12300</oKOPFCode>\n" +
                        //"<kPP>"+numberOfNineSymbol+"</kPP>\n" +//9 символов, можно любой
                        "<kPP>"+rndlen(9)+"</kPP>\n" +//9 символов, можно любой
                    //"<oGRN>"+"123"+numberOfTenSymbol+"</oGRN>\n" + //13 символов, можно любой, сконкатенировал
                    "<oGRN>"+"123"+rndlen(10)+"</oGRN>\n" + //13 символов, можно любой, сконкатенировал
                    "<employeesNumber>0</employeesNumber>\n" +
                    "</resultSetRow>\n" +
                    "</subCompany>\n" +
                    "<subNameList>\n" +
                    "<resultSetRow>\n" +
                    //"<name>"+numberOfNineSymbol + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "+
                    "<name>"+rndlen(9) + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "+
                    "</name>\n" +
                    "<idSub>192757494</idSub>\n" +
                    "<idSubName>210386246</idSubName>\n" +
                    "<idSubNameType>160551</idSubNameType>\n" +
                    "<subNameTypeCode>SubjectNameType_FullName</subNameTypeCode>\n" +
                    "</resultSetRow>\n" +
                    "<resultSetRow>\n" +
                   // "<name>"+"Lorem ipsum dolor sit amet"+numberOfNineSymbol+"</name>\n" +
                    "<name>"+"Lorem ipsum dolor sit amet"+rndlen(9)+"</name>\n" +
                    "<idSub>192757494</idSub>\n" +
                    "<idSubName>210386247</idSubName>\n" +
                    "<idSubNameType>160552</idSubNameType>\n" +
                    "<subNameTypeCode>SubjectNameType_ShortName</subNameTypeCode>\n" +
                    "</resultSetRow>\n" +
                    "<resultSetRow>\n" +
                    //рандом, большой текст
                    //"<name>"+"Lorem "+numberOfNineSymbol+"ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "+
                    "<name>"+"Lorem "+rndlen(9)+"ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "+
                    "</name>\n" +
                    "<idSub>6438986</idSub>\n" +
                    "<idSubName>257866515</idSubName>\n" +
                    "<idSubNameType>160575</idSubNameType>\n" +
                    "<subNameTypeCode>SubjectNameType_Name</subNameTypeCode>\n" +
                    "</resultSetRow>\n" +
                    "</subNameList>\n" +
                    subAnal+
                    "<pinList>\n" +
                    "<resultSetRow>\n" +
                    "<main>0</main>\n" +
                    "<sysSource>1</sysSource>\n" +
                    "<idABS>4187</idABS>\n" +
                    "<aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "<idSubABS>11995664</idSubABS>\n" +
                    "<idSub>6438986</idSub>\n" +
                            //"<pin>"+"A"+numberOfFive+"A"+numberOfFive+"</pin>\n" +//12 символов, clienntPinSlx
                            "<pin>"+java.util.UUID.randomUUID().toString().substring(24).toUpperCase()+"</pin>\n" +//12 символов, clienntPinSlx
                    "</resultSetRow>\n" +
                    "<resultSetRow>\n" +
                    "<main>1</main>\n" +
                    "<sysSource>1</sysSource>\n" +
                    "<idABS>4188</idABS>\n" +
                    "<aBSCode>ABS_EQ</aBSCode>\n" +
                    "<idSubABS>237906832</idSubABS>\n" +
                    "<idSub>192757494</idSub>\n" +
                            //"<pin>"+"A"+numberOfFive+"</pin>\n" + //6 символов, clientPinEq
                            "<pin>"+java.util.UUID.randomUUID().toString().substring(30).toUpperCase()+"</pin>\n" + //6 символов, clientPinEq
                    "</resultSetRow>\n" +
                    "<resultSetRow>\n" +
                    "<main>0</main>\n" +
                    "<sysSource>1</sysSource>\n" +
                    "<idABS>1461773</idABS>\n" +
                    "<aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "<idSubABS>311839913</idSubABS>\n" +
                    "<idSub>251658004</idSub>\n" +
                    "<pin>"+cprPinSfa+"</pin>\n" +  //кидаем то, что пришло, то есть наши синтетические ЦПРы
                    "</resultSetRow>\n" +
                    "</pinList>\n" +
                    "</resultSetRow>\n" +
                    "</subList>\n" +
                    "</outParms>\n" +
                    "</response>\n" +
                    "</dlwmin:UWSConsumerSubjectInfoGetGetGoldRecResponse>\n" +
                    "</soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            logger.debug("response " + response);
            return response;
        }
        //те ЦПР, которые мы кидали через ЛР
        else {
            logger.info("Request from 2 prerequisites, form LR/SWAGGER");
            //Приходит SOAP с XML, а там
            // @idSubCpr = число 8 знаков //цифры уникальные - idSubCpr, фактически numberOfEightSymbol
            // @nameCpr = string(48), сделаем конкатенацию numberOfEightSymbol два раза
            // @pinOds = QD@@@@@@@@//цифры уникальные, маска + numberOfEightSymbol
            // @pinSlx = QSLX@@@@@@@@//цифры уникальные, макска + numberOfEightSymbol
            // @cprPinSfa из п.1
            String response =  "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                    "<soapenv:Body>\n" +
                    "<dlwmin:UWSConsumerSubjectInfoGetGetGoldRecResponse xmlns:dlwmin=\"http://UWSConsumerSubjectInfoGet27.MDM.ws.alfabank.ru\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                    "<response xmlns:ns3=\"http://WSCommonTypes10.CS.ws.alfabank.ru\">\n" +
                    "<outCommonParms>\n" +
                    "<outCommonParmsExt>\n" +
                    "<name>logUID</name>\n" +
                    "<value>wststcmp.mdmws-210531-174134-04044</value>\n" +
                    "</outCommonParmsExt>\n" +
                    "</outCommonParms>\n" +
                    "<outParms>\n" +
                    "<subList>\n" +
                    "<resultSetRow>\n" +
                    "<subCommon>\n" +
                    "<resultSetRow>\n" +
                   // "<idSub>" + numberOfEightSymbol + "</idSub>\n" +  //8 символов, уникальное
                    "<idSub>" + rndlen(8) + "</idSub>\n" +  //8 символов, уникальное
                    "<idSubType>160478</idSubType>\n" +
                    "<subTypeCode>SubjectType_Group</subTypeCode>\n" +
                    //"<name>" + "asdfghjklz" + numberOfEightSymbol + "asdfghjklz"+"asdfghjklz"+"asdfghjklz"+"</name>\n" +//STRING 48
                    "<name>" + "asdfghjklz" + rndlen(8) + "asdfghjklz"+"asdfghjklz"+"asdfghjklz"+"</name>\n" +//STRING 48
                    "</resultSetRow>\n" +
                    "</subCommon>\n" +
                    "<pinList>\n" +
                    "<resultSetRow>\n" +
                    "<main>0</main>\n" +
                    "<sysSource>0</sysSource>\n" +
                    "<idABS>4186</idABS>\n" +
                    "<aBSCode>ABS_ODS</aBSCode>\n" +
                    "<idSubABS>248620889</idSubABS>\n" +
                    "<idSub>140629816</idSub>\n" +
                       // "<pin>" + "QD" + numberOfEightSymbol + "</pin>\n" +  //маска + 8 символов
                        "<pin>" + "QD" + rndlen(8) + "</pin>\n" +  //маска + 8 символов
                    "</resultSetRow>\n" +
                    "<resultSetRow>\n" +
                    "<main>0</main>\n" +
                    "<sysSource>1</sysSource>\n" +
                    "<idABS>4187</idABS>\n" +
                    "<aBSCode>ABS_SalesLogix</aBSCode>\n" +
                    "<idSubABS>184465415</idSubABS>\n" +
                    "<idSub>140629816</idSub>\n" +
                       // "<pin>" + "QSLX" + numberOfEightSymbol + "</pin>\n" +//маска + 8 символов
                        "<pin>" + "QSLX" + rndlen(8) + "</pin>\n" +//маска + 8 символов
                    "</resultSetRow>\n" +
                    "<resultSetRow>\n" +
                    "<main>0</main>\n" +
                    "<sysSource>1</sysSource>\n" +
                    "<idABS>1461773</idABS>\n" +
                    "<aBSCode>ABS_SFAProd</aBSCode>\n" +
                    "<idSubABS>307500667</idSubABS>\n" +
                    "<idSub>248923571</idSub>\n" +
                    "<pin>" + cprPinSfa + "</pin>\n" + //то что пришло в SOAP-запросе
                    "</resultSetRow>\n" +
                    "</pinList>\n" +
                    "</resultSetRow>\n" +
                    "</subList>\n" +
                    "</outParms>\n" +
                    "</response>\n" +
                    "</dlwmin:UWSConsumerSubjectInfoGetGetGoldRecResponse>\n" +
                    "</soapenv:Body>\n" +
                    "</soapenv:Envelope>\n";
            logger.debug("response " + response);
            return response;
        }
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


