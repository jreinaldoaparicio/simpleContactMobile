package test;

import activity.contactos.ConfirmationDialog;
import activity.contactos.ContactActivity;
import activity.contactos.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ContactTest {

    ConfirmationDialog confirmationDialog = new ConfirmationDialog();
    MainActivity mainActivity = new MainActivity();
    ContactActivity contactActivity = new ContactActivity();

    @Test
    public void verifyCreateContact() throws MalformedURLException {
        String firstName="Juan Jose";
        String surname="Perez";
        String nameContact=firstName+" "+surname;

        confirmationDialog.allowButton.click();
        mainActivity.addContactButton.click();
        contactActivity.firstName.type(firstName);
        contactActivity.surName.type(surname);
        contactActivity.phoneNumber.type("591 55557755");
        contactActivity.contactEmail.type("correo@remove.com");
        contactActivity.typeButton.click();
        contactActivity.emailType.click();
        contactActivity.addressContact.type("Av. Siempre Viva 7992");
        contactActivity.saveButton.click();

        // Verificacion
        Assert.assertTrue("ERROR, el contacto no esta creado",mainActivity.isDisplayedContact(nameContact));
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
