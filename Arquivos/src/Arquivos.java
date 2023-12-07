import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
    public static void main(String[] args) throws Exception {
    
        try {
            
            //criando objeto do tipo arquivo
            File arquivo = new File("exemplo.txt");

            //criar um objeto do tipo "escritor"
            FileWriter escritor = new FileWriter(arquivo);

            //escrever no arquivo
            escritor.write("Este é um arquivo de exemplo do Java");

            //fechar o arquivo
            escritor.close();

            System.out.println("Dados foram gravados com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo!!");
            e.printStackTrace();
        }

    }
}
