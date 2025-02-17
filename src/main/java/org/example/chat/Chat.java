package org.example.chat;

public class Chat {

    public static void main(String[] args) {
        MediadorChat mediador = new MediadorChat();

        Usuario usuario1 = new Usuario("Alice", mediador);
        Usuario usuario2 = new Usuario("Bob", mediador);

        mediador.registrarUsuario(usuario1);
        mediador.registrarUsuario(usuario2);

        JanelaChat janelaAlice = new JanelaChat(mediador, usuario1);

        JanelaChat janelaBob = new JanelaChat(mediador, usuario2);

        usuario1.enviarMensagem("Bob", "Oi, Bob! Como vai?");
        usuario2.enviarMensagem("Alice", "Oi, Alice! Tudo bem?");
    }
}
