package activity.contactos;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ConfirmationDialog {

    public Button allowButton;
    public ConfirmationDialog(){
        allowButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));
    }
}
