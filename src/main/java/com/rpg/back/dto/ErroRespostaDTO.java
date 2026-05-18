package com.rpg.back.dto;

public class ErroRespostaDTO {
    private String mensagem;
    private int status;

    public ErroRespostaDTO(String mensagem, int status) {
        this.mensagem = mensagem;
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getStatus() {
        return status;
    }
}
