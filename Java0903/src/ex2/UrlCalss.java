package ex2;

// @author kosta, 2015. 9. 3 , 오후 3:35:51 , UrlCalss 

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UrlCalss {
    public static void main(String[] args) throws IOException {
        String path = "http://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
        URL url;
        try {
            url = new URL(path);
        System.out.println("url.getAuthority() : "+url.getAuthority());
        System.out.println("url.getContent() : "+url.getContent());
        System.out.println("url.getDefaultPort() : "+url.getDefaultPort());
        System.out.println("url.getPort() : "+url.getPort());
        System.out.println("url.getFile() : "+url.getFile());
        System.out.println("url.getHost() : "+url.getHost());
        System.out.println("url.getPath() : "+url.getPath());
        System.out.println("url.getProtocol() : "+url.getProtocol());
        System.out.println("url.getQuery() : "+url.getQuery());
        System.out.println("url.getRef() : "+url.getRef());
        System.out.println("url.getUserInfo() : "+url.getUserInfo());
        System.out.println("url.toExternalForm() : "+url.toExternalForm());
        System.out.println("rl.toURI() : "+url.toURI());
        
        
        } catch (MalformedURLException ex) {
            Logger.getLogger(UrlCalss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(UrlCalss.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}
