package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

/**
 * Created by maximilianodacruz on 09/07/17.
 */
public class PesquisaStep extends BaseUtil {
    private BaseUtil base;

    public PesquisaStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^que eu navego até o google$")
    public void queEuNavegoAteOGoogle() throws Throwable {
        base.Driver.navigate().to("http://www.google.com.br");
    }

    @And("^eu entro com a pesquisa \"([^\"]*)\"$")
    public void euEntroComAPesquisa(String arg0) throws Throwable {
        WebElement fieldSearch = base.Driver.findElement(By.className("gsfi"));
        fieldSearch.sendKeys(arg0);
    }

    @And("^clico no botão pesquisar$")
    public void clicoNoBotãoPesquisar() throws Throwable {
        WebElement buttonSearch = base.Driver.findElement(By.className("sbico-c"));
        buttonSearch.click();
    }

    @Then("^Eu devo estar com a pesquisa realizada e o primeiro resultado deve ser \"([^\"]*)\"$")
    public void euDevoEstarComAPesquisaRealizadaEOPrimeiroResultadoDeveSer(String arg0) throws Throwable {
        WebDriverWait wait = new WebDriverWait(base.Driver, 20);
        WebElement elementAssert = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div > h3 > a")));//base.Driver.findElement(By.cssSelector("div > h3 > a"));
        assertEquals(elementAssert.getText(), arg0);
        base.Driver.close();
    }
}
