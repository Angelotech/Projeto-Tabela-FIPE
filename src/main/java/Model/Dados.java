package Model;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonAlias;

public class Dados {
    private String valor;
    private String marca;
    private String modelo;
    private int ano;
    private String combustivel;
    private String codigoFipe;
    private String mesDeReferencia;
    private String sigla;


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCodigoFipe() {
        return codigoFipe;
    }

    public void setCodigoFipe(String codigoFipe) {
        this.codigoFipe = codigoFipe;
    }

    public String getMesDeReferencia() {
        return mesDeReferencia;
    }

    public void setMesDeReferencia(String mesDeReferencia) {
        this.mesDeReferencia = mesDeReferencia;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "valor='" + valor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", combustivel='" + combustivel + '\'' +
                ", codigoFipe='" + codigoFipe + '\'' +
                ", mesDeReferencia='" + mesDeReferencia + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
