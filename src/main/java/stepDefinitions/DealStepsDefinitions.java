/*
 * package stepDefinitions;
 * 
 * import java.util.List; import java.util.Map;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When; import
 * junit.framework.Assert;
 * 
 * public class DealStepsDefinitions { WebDriver driver;
 * 
 * @Given("^user is already on login page$") public void
 * user_is_already_on_login_page() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\hp\\eclipse-workspace\\FreeCRMwithBDD\\src\\main\\resources\\com\\qa\\drivers\\chromedriver.exe"
 * ); driver = new ChromeDriver(); driver.get("https://freecrm.com/");
 * driver.manage().window().maximize();
 * driver.findElement(By.xpath("//a/span[text()='Log In']")).click(); }
 * 
 * @When("^title of the page is Free CRM$") public void
 * title_of_the_page_is_Free_CRM() { String title = driver.getTitle();
 * Assert.assertEquals("Cogmento CRM", title); }
 * 
 * 
 * @Then("^user enters username and password$") public void
 * user_enters_username_and_password(DataTable data) { List<List<String>>
 * datas=data.raw();
 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(datas.get(0).
 * get(0));
 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(datas.get(
 * 0).get(1)); }
 * 
 * @Then("^user clicks the login button$") public void
 * user_clicks_the_login_button() {
 * driver.findElement(By.xpath("//div[text()='Login']")).click(); }
 * 
 * @Then("^user is on home page$") public void user_is_on_home_page() { String
 * title =driver.getTitle(); System.out.println("Home Page title is " +title);
 * Assert.assertEquals("Cogmento CRM", title); }
 * 
 * @Then("^user moves to Deals page$") public void user_moves_to_Deals_page()
 * throws InterruptedException { Thread.sleep(5000);
 * driver.findElement(By.xpath("//span[text()='Deals']")).click(); }
 * 
 * @Then("^user click the new deals$") public void user_click_the_new_deals() {
 * driver.findElement(By.xpath("//button[text()='New']")).click(); }
 * 
 * @Then("^user enters the Title and Description and Propability$") public void
 * user_enters_Title_and_Description_and_Propability(DataTable td) throws
 * InterruptedException { List<Map<String,String>> str = td.asMaps(String.class,
 * String.class); for(Map<String, String> map : str) { Thread.sleep(5000);
 * driver.findElement(By.xpath("//input[@name='title']")).sendKeys(map.get(
 * "Title"));
 * driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(map.
 * get("Description"));
 * driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(map.get
 * ("Propability"));
 * driver.findElement(By.xpath("//button[text()='Save']")).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//span[text()='Deals']")).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//button[text()='New']")).click();
 * Thread.sleep(3000); }
 * 
 * }
 * 
 * 
 * @Then("^user cliks the Save button$") public void
 * user_clicks_the_Save_buttons() {
 * driver.findElement(By.xpath("//button[text()='Save']")).click(); }
 * 
 * 
 * @Then("^user again navigate to Deals page$") public void
 * user_again_navigate_Deals_page() throws InterruptedException {
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//span[text()='Deals']")).click();
 * Thread.sleep(5000); driver.quit(); } }
 */