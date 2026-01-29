package secao28;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginControler {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if (usuario.equals("gerson") && senha.equals("123456")) {
            System.out.println("Fez login com sucesso!");
        } else {
            System.out.println("Usuário ou senha inválidos!");
            
        }
        
    }

}
