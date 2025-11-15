package secao8;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {

        // Cria a tela
        JFrame janela = new JFrame();  
        JLabel labelUsuario = new JLabel("Usário: ");
        labelUsuario.setBounds(30,50,100,30);
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(30,80, 150,30);
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(30,180,150,30);
        JLabel labelSenha = new JLabel("Senha: ");
        labelSenha.setBounds(30,150,100,30);

        //Cria um botão
        JButton botalogar = new JButton("Login");
        botalogar.setBounds(30, 220, 80, 30);

        // Criando um método para o botão fazer alguma coisa
        botalogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha   = new String( campoSenha.getPassword());
                System.out.printf("Usuário: %S\nSenha: %S", usuario, senha );
                campoUsuario.setText(" ");
                campoSenha.setText("");
                
            }             
        });
                janela.add(botalogar);
                janela.setLayout(null);
                janela.add(labelUsuario);
                janela.add(campoUsuario);
                janela.add(campoSenha);
                janela.add(labelSenha);            
        

        // Definir o tamanho da tela e posição na tela
                janela.setBounds(400,400,400,500);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.setVisible(true);        
        }          
        
    }
 