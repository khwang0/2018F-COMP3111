/**
 * 
 */
package comp3111.webscraper;


/**
 * Sample Skeleton for 'Untitled' Controller Class
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.util.List;

public class Controller {

    @FXML 
    private Label labelCount; 

    @FXML 
    private Label labelPrice; 

    @FXML 
    private Label labelMin; 

    @FXML 
    private Label labelLatest; 

    @FXML
    private TextField textFieldKeyword;
    
    @FXML
    private TextArea textAreaConsole;
    
    private WebScraper scraper;
    
    public Controller() {
    	scraper = new WebScraper();
    }

    @FXML
    private void initialize() {
    	
    }
    
    @FXML
    private void actionSearch() {
    	System.out.println("actionSearch: " + textFieldKeyword.getText());
    	List<Item> result = scraper.scrape(textFieldKeyword.getText());
    	String output = "";
    	for (Item item : result) {
    		output += item.getTitle() + "\t" + item.getPrice() + "\t" + item.getUrl() + "\n";
    	}
    	textAreaConsole.setText(output);
    	
    	
    }
    
    @FXML
    private void actionNew() {
    	System.out.println("actionNew");
    }
}

