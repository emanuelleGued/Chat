package org.example.chat;
import org.example.chat.MediadorChat;
import org.example.chat.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChat extends JFrame {

    private JTextArea textArea;
    private JTextField textField;
    private MediadorChat mediador;
    private Usuario usuario;

    public JanelaChat(MediadorChat mediador, Usuario usuario) {
        this.mediador = mediador;
        this.usuario = usuario;

        setTitle("Chat - " + usuario.getNome());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        textField = new JTextField();
        add(textField, BorderLayout.SOUTH);

        JButton enviarButton = new JButton("Enviar");
        add(enviarButton, BorderLayout.EAST);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagem = textField.getText();
                if (!mensagem.isEmpty()) {
                    textArea.append("Você: " + mensagem + "\n");
                    usuario.enviarMensagem("Bob", mensagem);
                    textField.setText("");
                }
            }
        });

        setVisible(true);
    }

    public void mostrarMensagem(String mensagem) {
        textArea.append(mensagem + "\n");
    }
}
