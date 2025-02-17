package org.example.chat;
import org.example.chat.MediadorChat;

public class Usuario {

    private String nome;
    private MediadorChat mediador;

    public Usuario(String nome, MediadorChat mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(String para, String mensagem) {
        mediador.enviarMensagem(this.nome, para, mensagem);
    }

    public void receberMensagem(String de, String mensagem) {
        System.out.println("Mensagem de " + de + " para " + this.nome + ": " + mensagem);
    }
}
