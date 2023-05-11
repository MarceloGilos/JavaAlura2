import java.io.IOException;

import br.com.local.musica.methods.Comandos;
import br.com.local.musica.methods.ListAudio;
import br.com.local.musica.methods.NewAudio;
import br.com.local.musica.methods.ScannerBugFit;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        String opcao;
        while (true) {
            Comandos.limparTela();
            System.out.println("""
                    1-Adicionar
                    2-Deletar
                    3-Listar
                    4-Sair
                    """);
            System.out.print("Opção:");
            opcao = ScannerBugFit.scannerBugFitString();
            Comandos.limparTela();
            if (opcao.equals("1")) {
                ListAudio.addAudio(NewAudio.registerAudio());
            }else if(opcao.equals("2")){
                NewAudio.selectAudio(ListAudio.getArrayAudio());
            }else if(opcao.equals("3")){
                ListAudio.listAudio();
                System.in.read();
            }else if(opcao.equals("4")){
                break;
            }else{
                System.out.println("Opção invalida");
            }
        }
    }

}
