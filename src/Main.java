import br.com.local.musica.methods.ListAudio;
import br.com.local.musica.methods.NewAudio;
import br.com.local.musica.methods.ScannerBugFit;

public class Main {
    public static void main(String[] args) {
        String opcao;
        while (true) {
            System.out.println("""
                    1-Adicionar
                    2-Deletar
                    3-Listar
                    4-Sair
                    """);
            opcao = ScannerBugFit.scannerBugFitString();
            if (opcao.equals("1")) {
                ListAudio.addAudio(NewAudio.registerAudio());
            }else if(opcao.equals("2")){
                NewAudio.selectAudio(ListAudio.getArrayAudio());
            }else if(opcao.equals("3")){
                ListAudio.listAudio();
            }else if(opcao.equals("4")){
                break;
            }else{
                System.out.println("Opção invalida");
            }
        }
    }
}
