package org.example.chat;
import org.example.chat.Usuario;


import java.util.HashMap;
import java.util.Map;

public class MediadorChat {

    private Map<String, Usuario> usuarios;

    public MediadorChat() {
        this.usuarios = new HashMap<>();
    }

    // Registrar usuários
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNome(), usuario);
    }

    // Enviar mensagem para o destinatário
    public void enviarMensagem(String de, String para, String mensagem) {
        Usuario destinatario = usuarios.get(para);
        if (destinatario != null) {
            destinatario.receberMensagem(de, mensagem);
        } else {
            System.out.println("Usuário " + para + " não encontrado.");
        }
    }
}
