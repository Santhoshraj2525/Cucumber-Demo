/*
 * package stepDefinitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import junit.framework.Assert;
 * 
 * public class LoginStepDefinitions {
 * 
 * WebDriver driver;
 * 
 * @Given("^user is already on login page$") public void
 * user_is_already_on_login_page() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\hp\\eclipse-workspace\\FreeCRMwithBDD\\src\\main\\resources\\com\\qa\\drivers\\chromedriver.exe"
 * ); driver = new ChromeDriver(); driver.get("https://freecrm.com/");
 * driver.findElement(By.xpath("//a/span[text()='Log In']")).click(); }
 * 
 * @When("^title of the page is Free CRM$") public void
 * title_of_the_page_is_Free_CRM() { String title = driver.getTitle();
 * Assert.assertEquals("Cogmento CRM", title); }
 * 
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
 * user_enters_username_and_password(String userName, String Password) {
 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
 * }
 * 
 * 
 * @Then("^user clicks the login button$") public void
 * user_clicks_the_login_button() {
 * driver.findElement(By.xpath("//div[text()='Login']")).click(); }
 * 
 * @Then("^user is on home page$") public void user_is_on_home_page() { String
 * title =driver.getTitle(); System.out.println("Home Page title is " +title);
 * Assert.assertEquals("Cogmento CRM", title); }
 * 
 * @Then("^user moves to Contacts page$") public void
 * user_moves_to_Contacts_page() throws InterruptedException {
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//span[text()='Contacts']")).click(); }
 * 
 * @Then("^user click the new contacts$") public void
 * user_click_the_new_contacts() {
 * driver.findElement(By.xpath("//button[text()='New']")).click(); }
 * 
 * @Then("^user enters the \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
 * public void
 * user_enters_firstname_and_lastname_and_email_and_description(String
 * firstname, String lastname, String email, String desc) throws
 * InterruptedException { Thread.sleep(5000);
 * driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(
 * firstname);
 * driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname)
 * ; driver.findElement(By.xpath(
 * "//label[text()='Access']/following::button[contains(text(),'Public')]")).
 * click(); Thread.sleep(5000); driver.findElement(By.
 * xpath("//div[text()='Select users allowed access']/following::span[text()='Santhoshraj T']"
 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
 * "(//label[text()='Email']/following::input[@name='value'])[1]")).sendKeys(
 * email);
 * driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(desc
 * ); }
 * 
 * @Then("^user cliks the Save button$") public void
 * user_clicks_the_Save_buttons() {
 * driver.findElement(By.xpath("//button[text()='Save']")).click();
 * driver.quit(); }
 * 
 * }
 */