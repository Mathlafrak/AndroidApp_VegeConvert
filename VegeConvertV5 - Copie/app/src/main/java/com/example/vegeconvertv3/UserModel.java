package com.example.vegeconvertv3;

import android.widget.EditText;

public class UserModel {
    public String firstname, familyname, email;

    public UserModel(String familyName, String firstName, String email) {
        this.firstname = firstName;
        this.familyname = familyName;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
