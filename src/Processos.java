import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * Denis Martins - github: denismarttins
 */
public class Processos {
    public static void main (String arguments[]){
        String nome_do_arquivo, numero_do_processo, requerente, requerido, descricao;
        nome_do_arquivo = JOptionPane.showInputDialog("Coloque o nome do arquivo");
        numero_do_processo = JOptionPane.showInputDialog("Insira o número do processo");
        requerente = JOptionPane.showInputDialog("Insira o nome do autor da ação");
        requerido = JOptionPane.showInputDialog("Nome da pessoa/órgão processado");
        descricao = JOptionPane.showInputDialog("Acrescente observações sobre o processo"); 
    
    //between lines 13 and 18, was declared how each variable will be show to the user. Each one has a question. The user will put the value for each variable. 
    try {
        File file = new File ("C:\\Users\\pc-hp\\Dropbox\\rapido\\processos" + nome_do_arquivo + ".txt");
        FileWriter writer = new FileWriter (new File(nome_do_arquivo + ".txt"));
        PrintWriter cadastro = new PrintWriter (writer);
        cadastro.println("Número do processo: " + numero_do_processo + "\r\r\n" + "Autor da ação: " + requerente + "\r\r\n" + "Nome da pessoa/órgão processado: " + requerido + "\r\r\n" + "Descrição do processo: " + descricao);
    cadastro.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro processo?") ==0);
    System.exit(0);
    }
    
}
