package PagePatory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs
{  

    
    WebDriver driver;
    @FindBy(id="email")
    WebElement email_contact;
    
    @FindBy(id="id_order")
    WebElement OrderRefer;
    
    @FindBy(id="message")
    WebElement message;
  
    @FindBy(id="fileUpload")
    WebElement UploadBtn; 
    
    @FindBy(id="id_contact")
    WebElement SubjHeading; 
    @FindBy(id="submitMessage")
    WebElement submitMessage; 
    
    public ContactUs(WebDriver driver){
        
        this.driver = driver;
 
        //This initElements method will create all WebElements
 
        PageFactory.initElements(driver, this);
 
    }
    public void SetHeading(String StrHeading)
    {
        new Select(SubjHeading).selectByVisibleText(StrHeading);      
    }
    public void SetEmail(String StrEmail)
    {
                this.email_contact.sendKeys(StrEmail);        
    }
    public void SetOrderRefer(String StrOrderRefer)
    {
                this.OrderRefer.sendKeys(StrOrderRefer);        
    }
    public void clickUpload()
    {
                this.UploadBtn.click();        
    }
    
    public void setmessage(String strmsg)
    {
                this.message.sendKeys(strmsg);        
    }
    
    public void clickSubmit()
    {
                this.submitMessage.click();        
    }
    public void selectFileUpload() throws AWTException
    {
        StringSelection ss = new StringSelection("C:\\Users\\diuttm\\Desktop\\5_63647.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        //Paste the file's absolute path into the File name field of the File Upload dialog box

        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
    
    public void sendEmail(String StrHeading, String StrEmail, String StrOrderRefer, String strmsg) throws AWTException{
   
        this.SetHeading(StrHeading);
        this.SetEmail(StrEmail);
        this.SetOrderRefer(StrOrderRefer);
        this.setmessage(strmsg);  
        this.clickUpload();       
        this.selectFileUpload();        
        this.clickSubmit();
    }
}
