package br.ufc.ru.model;

import br.ufc.ru.dao.HistoricoDAO;
import br.ufc.ru.dao.HistoricoDAOImpl;
import java.io.Serializable;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Movimento implements Serializable{
   private int codigo;
   private String data;
   private String hora;
   private String descricao;
   private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void registrar(int codigo, String descricao, double valor){
        this.setCodigo(codigo);
        
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
    
        DateTimeFormatter  dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter  horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        this.setData(dataFormatada.format(data));
        this.setHora(horaFormatada.format(hora));
        this.setDescricao(descricao);
        this.setValor(valor);
        
        
        HistoricoDAO historicoDao = new HistoricoDAOImpl();
        historicoDao.adicionarMovimento(this);
    }
    
    public boolean JaRealizouRefeicao(int codigo){
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
    
        DateTimeFormatter  dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter  horaFormatada = DateTimeFormatter.ofPattern("HH");
        
        HistoricoDAO historicoDao = new HistoricoDAOImpl();
        
        return false;
    }

    @Override
    public String toString() {
        Locale ptBr = new Locale("pt", "BR");
        String valorString = NumberFormat.getCurrencyInstance(ptBr).format(valor);
        
        return valorString;
    }
    
    
}
