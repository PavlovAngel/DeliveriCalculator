package Web;


import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;


public class User {
    User user = new User();
    private static final String login = "shipping:shipping";
    public static final WebSite site = new WebSite();

    // TODO: 8/28/2022 Try to login 192.168.1.0 and print html
    public static void loginToSite() throws IOException {
        try {
            String base64login = new String(Base64.encodeBase64(login.getBytes()));
            Connection.Response response = Jsoup
                    .connect(site.getUrl())
                    .timeout(30000)
                    .method(Connection.Method.GET)
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0")
                    .header("Authorization", "Basic " + base64login)
                    .execute();
            site.setDocument(response.parse());


        } catch (org.jsoup.HttpStatusException ex) {
            site.setIsRealUrl(false);
            ex.printStackTrace();


        }
    }
//Copy lite to clipboard

    /*public static void write() {
        StringSelection stringSelection = new StringSelection(TextFieldPanel.textField.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }*/

    //Find order quantity and material number from Html Line

    /* public static String getOrderQuantity() throws IOException {
         int lines = impulse.getDocument()
                 .body()
                 .getElementsByClass(impulse.getHtmlElementMaterialNumber())
                 .size();
         String quantity;
         int currentOrderQuantity;
         System.out.println(impulse.getDocument().body()
                 .getElementsByClass(impulse.getHtmlElementMaterialNumber()).text());
         String line = impulse.getDocument().body()
                 .getElementsByClass(impulse.getHtmlElementMaterialNumber())
                 .eq(lines - 1)
                 .text();
         System.out.println(line);
         String[] matNum = line.split(" ");
         String materialNumber = matNum[0].substring(1); // 1-9 (1)/ 10-99 (2)
         for (int i = 1; i < lines; i++) {
             String lastLine = impulse.getDocument().body()
                     .getElementsByClass(impulse.getHtmlElementMaterialNumber())
                     .eq(lines - i).text();
             String[] lastMatNum = lastLine.split(" ");
             String lastMaterialNumber = lastMatNum[0].substring(2);
             if (materialNumber.equals(lastMaterialNumber)) {
                 quantity = impulse.getDocument()
                         .body()
                         .getElementsByClass(Web.WebSite.getHtmlElementOrderQuantity())
                         .eq(lines - i)
                         .text();
                 currentOrderQuantity = Integer.parseInt(quantity);
             }
         }
         return null;
     }*/
    public static void printHtml() {

    }

}