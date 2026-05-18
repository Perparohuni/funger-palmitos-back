package com.rpg.back.dto;

public class UsuarioDTO {
    private String login;
    private String token;
    private boolean mestre;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isMestre() {
        return mestre;
    }

    public void setMestre(boolean mestre) {
        this.mestre = mestre;
    }
}
