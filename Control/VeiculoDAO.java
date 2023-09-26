package Control;
import BancoDados.ConexaoBanco;
import Model.DadosVeiculo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VeiculoDAO {
    private Connection conecta;
    public VeiculoDAO(){
        this.conecta = new ConexaoBanco().getConnection();
    }
public void cadastrarDadosVeiculo(DadosVeiculo dados){
        try{
            String sql = "INSERT INTO veiculo(modelo_veic,marca_veic,valor_veic,revenda_veic) VALUES"
                    +"(?,?,?,?)";
            PreparedStatement inserir = conecta.prepareStatement(sql);
            inserir.setString(1,dados.getModelo_veic());
            inserir.setString(2,dados.getMarca_veic());
            inserir.setDouble(3,dados.getValor_veic());
            inserir.setDouble(4,dados.getRevenda_veic());
            inserir.execute();
            inserir.close();
            JOptionPane.showMessageDialog(null,"CADASTRO COM ÊXITO ");
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ERRO NO CADASTRO ");
        }
        }
        }
