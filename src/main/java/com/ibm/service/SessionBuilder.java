package com.ibm.service;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

public class SessionBuilder {

    private static Session session = null;

    public static Session getInstance(){

        Properties emailProp = PropertyBuilder.buildEmailProperties();
        Properties appProp = PropertyBuilder.loadPropFile();

        if (session == null){
            session = Session.getInstance(emailProp, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(appProp.getProperty("username"),appProp.getProperty("password"));
                }
            });
        }else {
            return session;
        }
        return session;
    }

    public SessionBuilder() {
        throw new Error("No New Object is Allowed for Session Type");
    }
}
