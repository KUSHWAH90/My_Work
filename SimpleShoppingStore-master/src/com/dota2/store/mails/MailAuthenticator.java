package com.dota2.store.mails;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator{

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication ("santoshkumar021990@gmail.com", "Hafiza@143");
      }
}
