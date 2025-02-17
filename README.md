# ChatMediator

Este projeto simula um sistema de chat entre usuários utilizando os padrões de design **Mediator** e **Command**. Em vez de os usuários se comunicarem diretamente entre si, o projeto centraliza a comunicação por meio de um mediador, que é responsável por:

- **Registrar usuários no chat**: Apenas usuários registrados podem enviar e receber mensagens.
- **Encaminhar mensagens para os destinatários corretos**: Quando um usuário envia uma mensagem, o mediador garante que ela será entregue ao destinatário correto.
- **Garantir que usuários só enviem mensagens se estiverem registrados**: O sistema impede que usuários não registrados enviem ou recebam mensagens.

### Funcionalidade

Este projeto simula um chat entre dois usuários, `Alice` e `Bob`, e usa uma interface gráfica simples feita com **Swing**, onde eles podem enviar e receber mensagens. Cada usuário tem sua própria janela para interagir com o sistema de chat, e a comunicação é centralizada por um **mediador** que cuida do processo de registro e entrega das mensagens.

### Como Funciona

1. **Usuário registra-se no chat**: Cada usuário é registrado no mediador antes de poder enviar ou receber mensagens.
2. **Envio e recebimento de mensagens**: Usuários podem enviar mensagens para outros usuários registrados no sistema. O mediador encaminha as mensagens para o destinatário correto.
3. **Interface gráfica com Swing**: O chat é implementado com uma interface gráfica simples usando **Swing**, permitindo uma interação direta entre os usuários.

### Tecnologias Utilizadas

- Java
- Swing (para a interface gráfica)
- Padrões de design: **Mediator** e **Command**

### Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/ChatMediator.git
   ```

2. Navegue até o diretório do projeto e compile:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn exec:java -Dexec.mainClass="com.exemplo.chat.Chat"
   ```

Ao executar, duas janelas de chat serão abertas, uma para **Alice** e outra para **Bob**, e eles poderão trocar mensagens entre si.
