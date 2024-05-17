package org.cysecurity.cspf.jvl.controller;

public class users {
    int VerifyAdmin(String password) {
        if (!password.equals("Meow!")) {
        return(0);
        }
        //new vuln without breaking build
        return(1);
        }
}
