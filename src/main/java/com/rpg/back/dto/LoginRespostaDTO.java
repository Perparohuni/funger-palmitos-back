package com.rpg.back.dto;

public class LoginRespostaDTO {
    private String token;
    private String login;
    private boolean mestre;

    public  LoginRespostaDTO(String t, String l, boolean m) {
        token = t;
        login = l;
        mestre = m;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
