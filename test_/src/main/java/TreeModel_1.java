/*public class Main {
    static int x=1, y=1;
    static double  res1=x/2;
    static double res2=y/2.;
    static int[][] a = new int[3][3];
  // for(int i = 0; i < a.length; i++)
  //  {
  //      a[i] = new int[3];
  //  }

    public static void main(String[] args) {
        System.out.println("res1="+res1+"; res2="+res2);
        int[][] a = new int[3][3];
        a[0][0] = 1;
        int n=5;
        int g[][] = new int[n][n];
    }
}
*/


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.codehaus.jackson.JsonParser;

//import org.codehaus.jackson.JsonNode;
//import org.codehaus.jackson.JsonParser;
//import org.codehaus.jackson.map.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Example of TreeModel (write and read)
 *
 * Of 3 major processing modes that Jackson supports, Tree Model may be most familiar to developers with experience using XML
 * as the main data/transfer format. At conceptual level it has many similarities to DOM XML tree model; although there are
 * also many differences due to structural and semantic differences between JSON and XML.
 *
 * Created by vvedenin on 4/24/2016.
 */
public class TreeModel {

    static String s="{ \"atms\":{\n" +
            "   \"0\": {\n" +
            "      \"srcdvtype\": \"A\",\n" +
            "      \"srccity\": \"Алапаевск\"      \n" +
            "   },\n" +
            "   \"1\": {\n" +
            "      \"srcdvtype\": \"B\",\n" +
            "      \"srccity\": \"Арамиль\"\n" +
            "   }" +
            "  }" +
            "}";
  /*  public static void main(String[] args) throws IOException {
        System.out.print("readJson: ");
        readJson();
        System.out.println();
        System.out.print("writeJson: ");
      //  writeJson();
    }
*/
    /**
     *  Example to readJson using TreeModel
     */
    private static void readJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //JsonNode rootNode = mapper.readValue("{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}", JsonNode.class);
        JsonNode rootNode = mapper.readValue(s, JsonNode.class);
        String root = rootNode.get("atms").asText(); // get property message
        JsonNode atmNode =  rootNode.get("atms"); // get object Place
        String atm0 = atmNode.get("0").asText(); // get property message
        JsonNode childNode0 =  atmNode.get("0"); // get object Place
        String srcdvtype0 = childNode0.get("srcdvtype").asText(); // get property name
        String srccity0 = childNode0.get("srccity").asText(); // get property name
        String atm1 = atmNode.get("1").asText(); // get property message
        JsonNode childNode1 =  atmNode.get("1"); // get object Place
        String srcdvtype1 = childNode1.get("srcdvtype").asText(); // get property name
        String srccity1 = childNode1.get("srccity").asText(); // get property name
        System.out.println("root" +"\n"+ root+"\n"+
                " atm0" +"\n"+atm0 + "\n " +
                "polya"+"\n"+srcdvtype0+ " " +srccity0 + "\n\n"+
                " atm1" +"\n"+atm0 + "\n " +
                        "polya"+"\n"+srcdvtype1+ " " +srccity1); // print "Hi World!"

    }


    /**
     * Example to writeJson using TreeModel
     */
   /* private static void writeJson() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        rootNode.put("message", "Hi");
        ObjectNode childNode = rootNode.putObject("place");
        childNode.put("name", "World!");
        mapper.writeValue(outputStream, childNode);

        System.out.println(outputStream.toString()); // print "{"message":"Hi","place":{"name":"World!"}}"
    }*/
}