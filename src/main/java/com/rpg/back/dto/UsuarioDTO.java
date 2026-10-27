package com.rpg.back.dto;

public class UsuarioDTO extends AbstractDTO {
    private String login;
    private String token;
    private String senha;
    private boolean mestre;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
