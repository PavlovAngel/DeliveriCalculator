package Web;

import Frame.StartingWindow.UrlTextField;
import org.jsoup.nodes.Document;

public class WebSite {
    private static boolean isRealUrl = true;
    private static String htmlElementOrderQuantity;
    public static String url = UrlTextField.urlTextField.getText().substring(38); //get text from url text field
    public static String deliveryNoteUrl = "http://192.168.0.57:3000/shipping/edit" + url;
    private String detailInfoUrl;
    public String htmlElementLine;
    private Document document;


    WebSite() {


      /* htmlElementLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tab" +
                "let mdc-layout-grid__cell--span-8-desktop";
         htmlElementOrderQuantity = "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet" +
               " mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right";
          */

    }

    public static String getHtmlElementOrderQuantity() {
        return htmlElementOrderQuantity;
    }

    public String getUrl() {

        return deliveryNoteUrl;
    }

    public String getHtmlElementMaterialNumber() {
        return htmlElementLine;
    }

    private void setHtmlElementMaterialNumber(String htmlElementLine) {
        this.htmlElementLine = htmlElementLine;
    }

    public Document getDocument() {

        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public static boolean getIsRealUrl() {
        return isRealUrl;
    }

    public void setIsRealUrl(boolean isRealUrl) {
        WebSite.isRealUrl = isRealUrl;
    }
}
