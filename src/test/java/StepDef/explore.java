package StepDef;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class explore {
    WebDriver driver;
    @Given("User Open browser")

    @Before
    public void SetupBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("=== iOpenBrowser ===");
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver = new ChromeDriver();
    }


    @When("Open website Sahabat Pegadaian")
    public void openWebsiteSahabatPegadaian(){
        driver.get("https://sahabat.pegadaian.co.id/");
    }

    @When("User click menu {string}")
    public void clickMenu(String value)  throws InterruptedException{
        driver.findElement(By.xpath("//*[text()='"+value+"']")).click();
        Thread.sleep(1000); // waiting after transaition page
    }

    @When("User click menu modal")
    public void clickModal()  throws InterruptedException{
        driver.findElement(By.xpath("//div[@id='close']")).click();
        Thread.sleep(3000);
    }

    @When("User click checkbox Tnc")
    public void clickCheckbox()  throws InterruptedException{
        driver.findElement(By.cssSelector("#myModal .checkmark")).click();
    }

    @When("User click donwload simulasi modal button")
    public void clickBtnDonwload()  throws InterruptedException{
        driver.findElement(By.cssSelector("#myModal button")).click();
    }

    @When("User input berat {string} gram")
    public void inputGram(String value){
        driver.findElement(By.cssSelector("#berat_perhiasan")).click();
        driver.findElement(By.cssSelector("#berat_perhiasan")).sendKeys(value);
    }

    @Then("User can see item jaminan")
    public void verifyItemJaminan() {
        driver.findElement(By.cssSelector(".item-jaminan")).isDisplayed();
    }

    @When("User click dropdown {string}")
    public void clickDropdown(String value)  throws InterruptedException{
        driver.findElement(By.xpath("//*[text()='"+value+"']")).click();
        Thread.sleep(1000); // waiting after transaition page
    }

    @Then("User can see total uang muka")
    public void verifyTotalUangMuka() {
        driver.findElement(By.cssSelector("#display_total_uang_muka")).isDisplayed();
    }

    @Then("User success donwload simulasi")
    public void verifySuccessDownloadSimulasi() {
        driver.findElement(By.cssSelector("#modal-thank-you .succes-tittle")).isDisplayed();
    }

    @When("User input email {string}")
    public void inputEmail(String value){
        driver.findElement(By.cssSelector("#input-email")).click();
        driver.findElement(By.cssSelector("#input-email")).sendKeys(value);
    }

    @After
    public void closeBrowser(){
        System.out.println("=== Close Browser ===");
        driver.close();
        driver.quit();
    }
}
