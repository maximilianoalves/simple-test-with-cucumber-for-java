package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by maximilianodacruz on 09/07/17.
 */
public class Hook extends BaseUtil{
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/maximilianodacruz/Documents/chromedriver");
        base.Driver = new ChromeDriver();
        base.Driver.manage().window().maximize();
    }
}
