package ru.arrowin;

import ru.arrowin.exception.NotCorrectEmailException;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        this.login = login;
        setEmail(email);
    }

    private void setEmail(String email) {
        if (email.contains("@") && email.contains(".") && !(email.endsWith("@") || email.endsWith("."))) {
            this.email = email;
            return;
        }
        throw new NotCorrectEmailException();
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
