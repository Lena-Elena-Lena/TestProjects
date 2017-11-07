package logic;

import com.sap.document.sap.soap.functions.mc_style.ZSIBPAIRPIN;
import com.sap.document.sap.soap.functions.mc_style.ZSIBPAIRPIN_Service;
import com.sap.document.sap.soap.functions.mc_style.ZfmShanAirpinSoapServHead;
import com.sap.document.sap.soap.functions.mc_style.ZfmShanAirpinSoapServHeadResponse;
import org.apache.log4j.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Created by razgulyaeva on 29.09.2017.
 */
public class Client {
    Logger logger = Logger.getLogger(String.valueOf(Client.class));


    private static ZfmShanAirpinSoapServHeadResponse response = new ZfmShanAirpinSoapServHeadResponse();
    private String readProperties(String pro) {
        Properties properties = new Properties();
        String propFileName = "config.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        logger.info("Reading inputStream");
        try {
            properties.load(inputStream);
            logger.info("Reading config");
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("Error" + e.getMessage());
        }
        return properties.getProperty(pro);
    }
    public String tryConnection(String phoneNumber, String cardNum) {
        Boolean connect = false;
        try {
            System.out.println("STEP 1");
            URL wsdlLocation = new URL(readProperties("service_url"));
            System.out.println("STEP 2"+ wsdlLocation.toString());
            logger.info("WSDL_URL: " + wsdlLocation.toString());
            ZSIBPAIRPIN_Service service = new ZSIBPAIRPIN_Service(wsdlLocation);

            ZSIBPAIRPIN port = service.getZsiBpAirpin();

            System.out.println("STEP 3");
          //  ZfmShanAirpinSoapServHead request = new ZfmShanAirpinSoapServHead();
           // request.setIvTelNum(phoneNumber);
          //  request.setIvCardNum(cardNum);
            Holder<String> EvGuidCadr=new Holder<>();
            Holder<String> EvRezult=new Holder<>();
            System.out.println("STEP 4");
           // BindingProvider prov = (BindingProvider)port;
        //    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "myusername");
        //    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "mypassword");

            port.zfmShanAirpinSoapServHead(cardNum, phoneNumber, EvGuidCadr, EvRezult);
            System.out.println("STEP 5"+EvGuidCadr.value);
            String evGuidCadr=EvGuidCadr.value;
          //  String evRezult=EvRezult.value;
            logger.info("Error code: " + "");
            System.out.println("STEP 6");
            if (evGuidCadr==null||evGuidCadr.equals("")) {
               return null;
            }
            return evGuidCadr;

        } catch (Exception e) {
            return null;
        }
    }
}
