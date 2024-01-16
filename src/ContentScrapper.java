
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ContentScrapper {
    public static void main(String[] args) throws IOException{
        String url = "https://www.flipkart.com/thomson-alpha-80-cm-32-inch-hd-ready-led-smart-linux-tv-2022-30-w-sound-output-bezel-less-design/p/itmbbd33333c58bb?pid=TVSGEMQV7R4CMTGA&lid=LSTTVSGEMQV7R4CMTGAODWDFI&marketplace=FLIPKART&store=ckf%2Fczl&srno=b_1_2&otracker=browse&fm=organic&iid=en_OTh6JgKwXCLmM_oGjwGitjpCn1zArQ0B4AdQZz4R1QdxJEBpaAJHZ9Zcnb_BOy8AZ6L6BkLKEkOpVcdycOaAzw%3D%3D&ppt=clp&ppn=mobile-phones-republic-day-sale-store&ssid=r8g0evdayo0000001705389245049";
        Document doc = Jsoup.connect(url).get();
        
        Elements img = doc.select(".CXW8mj._3nMexc img");
        System.out.println("Image :\n" + img.attr("src"));
        
        Elements title = doc.select(".B_NuCI");
        System.out.println("Title :\n" + title.text());
        
        Elements desc = doc.select("._1mXcCf.RmoJUa p");
        System.out.println("Description : " + desc.text());
        
        Elements price = doc.select("div._25b18c div._30jeq3._16Jk6d");
        System.out.println("Price : " + price.text()); 
        
        Elements discount = doc.select("._3Ay6Sb._31Dcoz");
        System.out.println("Discount : " + discount.text());
        
        Elements warranty = doc.select("div._352bdz");
        System.out.println("Warranty on Product : " + warranty.text());
        
        Elements rating = doc.select("#productRating_LSTTVSGEMQV7R4CMTGAODWDFI_TVSGEMQV7R4CMTGA_ div._3LWZlK");
        System.out.println("Rating of product : " + rating.text());
        
        Elements reviews = doc.select("._2_R_DZ span");
        System.out.println("Total reviews: " + reviews.text());
        
         
 
       
    }
}