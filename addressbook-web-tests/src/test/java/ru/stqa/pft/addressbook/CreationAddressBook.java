package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreationAddressBook {
  private WebDriver wd;


  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    login("admin", "secret");
  }

  private void login(String username, String pass) {
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(pass);
    wd.findElement(By.id("LoginForm")).submit();
  }

  @Test
  public void testCreationAddressBook() throws Exception {

    goToNewGroup();
    fillGroupCreation(new ConactData("Марина", "Астрецова", "astrecova.marina@gmail.com", "санкт-петербург", "89110034406", "ул Федора Абрамова д.8", "mastretsova@rbc.ru", "1984");
    submitGroup();
    returnToPage();
  }

  private void returnToPage() {
    wd.findElement(By.linkText("Logout")).click();
  }

  private void submitGroup() {
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    wd.findElement(By.linkText("home page")).click();
  }

  private void fillGroupCreation(ConactData conactData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(conactData.getFirstname());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(conactData.getLastname());
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(conactData.getAddress());
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(conactData.getEmail());

    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys(conactData.getAddress2());

    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(conactData.getMobile());
    wd.findElement(By.name("email2")).click();
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys(conactData.getEmail2());
    wd.findElement(By.name("bday")).click();
    wd.findElement(By.name("bday")).click();
    wd.findElement(By.name("bmonth")).click();
    wd.findElement(By.name("bmonth")).click();
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(conactData.getByear());
  }

  private void goToNewGroup() {
    wd.findElement(By.linkText("add new")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }
}
