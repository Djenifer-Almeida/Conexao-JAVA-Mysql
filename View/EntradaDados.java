package View;
import Model.DadosVeiculo;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        DadosVeiculo dados = new DadosVeiculo();
        System.out.print("Digite marca do veículo: ");
        dados.setMarca_veic(tc.nextLine());
        System.out.print("Digite modelo do veículo: ");
        dados.setModelo_veic(tc.nextLine());
        System.out.print("Digite valor veículo: ");
        dados.setValor_veic(tc.nextDouble());
        DadosVeiculo.enviarDados(dados);
    }
    }
