package comp3111.webscraper;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.util.Vector;

public class WebScraper {

	private static final String DEFAULT_URL = "https://newyork.craigslist.org/";
	private WebClient client;

	public WebScraper() {
		client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
	}

	public List<Item> scrape(String keyword) {

		try {
			String searchUrl = DEFAULT_URL + "search/sss?sort=rel&query=" + URLEncoder.encode(keyword, "UTF-8");
			HtmlPage page = client.getPage(searchUrl);

			List<HtmlElement> items = ((List<HtmlElement>) (Object) page.getByXPath("//li[@class='result-row']"));
			
			Vector<Item> result = new Vector<Item>();
			for (HtmlElement htmlItem : items) {
				HtmlAnchor itemAnchor = ((HtmlAnchor) htmlItem.getFirstByXPath(".//p[@class='result-info']/a"));
				HtmlElement spanPrice = ((HtmlElement) htmlItem.getFirstByXPath(".//a/span[@class='result-price']"));

				// It is possible that an item doesn't have any price, we set the price to 0.0
				// in this case
				String itemPrice = spanPrice == null ? "0.0" : spanPrice.asText();

				Item item = new Item();
				item.setTitle(itemAnchor.asText());
				item.setUrl(DEFAULT_URL + itemAnchor.getHrefAttribute());

				item.setPrice(new BigDecimal(itemPrice.replace("$", "")));

				result.add(item);
			}
			client.close();
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
