package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailAddressTest {

    //These are worth 2 points each
    //TODO test that null email address is not valid
    @Test
    public void testValidateEmailAddressNull()
    {
        boolean isValidEmail = EmailAddress.validate(null);
        assertFalse(isValidEmail);
    }

    //TODO test that a normal email address is valid
    @Test
    public void testValidateEmailAddressRegular()
    {
        boolean isValidEmail = EmailAddress.validate("kapster05@gmail.com");
        assertTrue(isValidEmail);
        boolean isValidEmail1 = EmailAddress.validate("kapster05@gmail.com");
        assertTrue(isValidEmail1);
    }

    //TODO test that missing '@' in address is not valid
    @Test
    public void testValidateEmailAddressNoAt()
    {
        boolean isValidEmail = EmailAddress.validate("sgordon19.com");
        assertFalse(isValidEmail);
    }

    //TODO test that wrong ending of email address is not valid
    @Test
    public void testValidateEmailAddressWrongEnd()
    {
        boolean isValidEmail = EmailAddress.validate("kapster05@gmail.com.net");
        assertFalse(isValidEmail);
        boolean isValidEmail1 = EmailAddress.validate("kapster05@gmail.com");
        assertFalse(isValidEmail1);
        boolean isValidEmail2 = EmailAddress.validate("sg.comgordon@gmail");
        assertFalse(isValidEmail2);
    }
}