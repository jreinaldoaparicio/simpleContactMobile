package activity.contactos;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.Label;
import appiumControl.TextBox;
import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;

public class ContactActivity {

    public TextBox firstName;
    public TextBox surName;
    public TextBox phoneNumber;
    public TextBox contactEmail;
    public Button typeButton;
    public CheckBox emailType;
    public TextBox addressContact;
    public Button saveButton;

    public ContactActivity(){
        firstName   = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_first_name"));
        surName     = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_surname"));
        phoneNumber = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_number"));
        contactEmail= new TextBox(By.id("com.simplemobiletools.contacts:id/contact_email"));
        typeButton  = new Button(By.id("com.simplemobiletools.contacts:id/contact_email_type"));
        emailType   = new CheckBox(By.xpath("//android.widget.RadioButton[@text='Trabajo']"));
        addressContact= new TextBox(By.id("com.simplemobiletools.contacts:id/contact_address"));
        saveButton  = new Button(By.id("com.simplemobiletools.contacts:id/save"));
    }

}
