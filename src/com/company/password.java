package com.company;

import java.util.regex.Pattern;

public class password {
    private String name;
    private String mail;
    private String password;
    private String username;
    private String usernameUs;
    private String passwordPs;
    private int date;
    private int day;
    private int year;

    public password(String name, double age, String mail, String password, String username) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.username = username;
    }
    public boolean validemail (String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&-]+)@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email==null)
            return false;
        return pat.matcher(email).matches();
    }
}