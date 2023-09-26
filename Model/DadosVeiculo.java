package Model;
import Control.VeiculoDAO;

public class DadosVeiculo {
private String marca_veic;
private String modelo_veic;
private double valor_veic;
private double revenda_veic;

    public String getMarca_veic() {
        return marca_veic;
    }

    public void setMarca_veic(String marca_veic) {
        this.marca_veic = marca_veic;
    }

    public String getModelo_veic() {
        return modelo_veic;
    }

    public void setModelo_veic(String modelo_veic) {
        this.modelo_veic = modelo_veic;
    }

    public double getValor_veic() {
        return valor_veic;
    }

    public void setValor_veic(double valor_veic) {
        this.valor_veic = valor_veic;
        this.revenda_veic = valor_veic - (valor_veic * 0.10);
    }

    public double getRevenda_veic() {
        return revenda_veic;
    }

    public void setRevenda_veic(double revenda_veic) {
        this.revenda_veic = revenda_veic;
    }
    public static void enviarDados(DadosVeiculo dados){
        VeiculoDAO enviar = new VeiculoDAO();
        enviar.cadastrarDadosVeiculo(dados);
    }
    }
