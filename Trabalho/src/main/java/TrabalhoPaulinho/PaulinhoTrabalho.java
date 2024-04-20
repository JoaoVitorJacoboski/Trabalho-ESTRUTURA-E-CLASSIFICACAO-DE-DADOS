package TrabalhoPaulinho;
import javax.swing.JOptionPane;

/**
 *
 * @author jjoao
 */
public class PaulinhoTrabalho {

    public static void main(String[] args) {
        
        int opcao = -1;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog
                            ("Selecione uma Ordenação:\n"
                            + "1 - Oredenação Bolha \n"
                            + "2 - Ordenação seleção \n"
                            + "3 - Ordenação Incerção\n"
                            + "0 - Sair"));
            
            if(opcao == 1){
               executaOpcao01();
            }
            if(opcao == 2){
               executaOpcao02();
            }
            if(opcao == 3){
               executaOpcao03();
            }
            
        }while(opcao != 0);
    }
    
    public static void executaOpcao01() {
        
        String tmInput = JOptionPane.showInputDialog("Insira o tamanho do vetor:");
        int tamanho = Integer.parseInt(tmInput);
        
        int[] vetor = new int[tamanho];
        
        
        String inputElementos = JOptionPane.showInputDialog("Insira os elementos do vetor (separados por espaço):");
        String[] elementosString = inputElementos.split(" ");
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(elementosString[i]);
        }
        long inicio = System.currentTimeMillis();
        boolean houveTroca = true;
        
        while(houveTroca){
            houveTroca = false;
            
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] > vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    houveTroca = true;
                }
            }
        }
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        
        StringBuilder msg = new StringBuilder(
                " Vetor Original : " + "[" + tamanho + "]"+ "\n Elementos sem ordenação :" + "["+inputElementos+"]"+
                "\n Vetor ordenado:\n");
        for (int i = 0; i < vetor.length; i++) {
            msg.append("posicao [").append(i).append("] = ").append(vetor[i]).append("\n");
        }
        
        msg.append("Tempo de execução: ").append(tempoExecucao).append(" milissegundos");
        JOptionPane.showMessageDialog(null, msg.toString());
    }
    public static void executaOpcao02(){
       
        
        String tmInput = JOptionPane.showInputDialog("Insira o tamanho do vetor:");
        int tamanho = Integer.parseInt(tmInput);
        
      
        int[] vetor = new int[tamanho];
        
        
        String inputElementos = JOptionPane.showInputDialog("Insira os elementos do vetor (separados por espaço):");
        String[] elementosString = inputElementos.split(" ");
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(elementosString[i]);
        }
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < vetor.length - 1; i++) {
            int menorPosicao = i;
            
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorPosicao]) {
                    menorPosicao = j;
                }
            }
            
            if (menorPosicao != i) {
                int aux = vetor[i];
                vetor[i] = vetor[menorPosicao];
                vetor[menorPosicao] = aux;
            }
        }
        
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        StringBuilder msg = new StringBuilder(
                " Vetor Original : " + "[" + tamanho + "]"+ "\n Elementos sem ordenação :" + "["+inputElementos+"]"+
                "\n Vetor ordenado:\n");
        for (int i = 0; i < vetor.length; i++) {
            msg.append("posicao ["+i+"] = ").append(vetor[i]).append("\n");
        }
        
        
       msg.append("Tempo de execução: ").append(tempoExecucao).append(" milissegundos"); 
        JOptionPane.showMessageDialog(null, msg.toString());
    }
   
    public static void executaOpcao03(){
        
     String tmInput = JOptionPane.showInputDialog("Insira o tamanho do vetor:");
        int tamanho = Integer.parseInt(tmInput);
        
        
        int[] vetor = new int[tamanho];
        
       
        String inputElementos = JOptionPane.showInputDialog("Insira os elementos do vetor (separados por espaço):");
        String[] elementosString = inputElementos.split(" ");
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(elementosString[i]);
        }
        
       long inicio = System.currentTimeMillis();
        int chave;  
        int j;  
        
        for (int i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            for (j = i - 1; (j >= 0 && vetor[j] > chave); j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = chave;
        }
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        StringBuilder msg = new StringBuilder(
                " Vetor Original : " + "[" + tamanho + "]"+ "\n Elementos sem ordenação :" + "["+inputElementos+"]"+
                "\n Vetor ordenado:\n");
        for (int i = 0; i < vetor.length; i++) {
            msg.append(vetor[i]);
            if (i < vetor.length - 1) {
                msg.append(" - ");
            }
        }
        msg.append("Tempo de execução: ").append(tempoExecucao).append(" milissegundos"); 
        
        JOptionPane.showMessageDialog(null, msg.toString());
    }
}
    
    
    
