package com.rpg.back.dto;

public class RespostaDTO<T> {
    private boolean sucesso;
    private String mensagem;
    private T dados;

    public RespostaDTO(boolean s, String m, T d){
        sucesso = s;
        mensagem = m;
        dados = d;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }
}
