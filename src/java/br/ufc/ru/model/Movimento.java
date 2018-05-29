package br.ufc.ru.model;

import br.ufc.ru.dao.HistoricoDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Movimento {
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
        
        HistoricoDAO.gravar(this);
    }
    
    public boolean JaRealizouRefeicao(int codigo){
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
    
        DateTimeFormatter  dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter  horaFormatada = DateTimeFormatter.ofPattern("HH");
        
        ArrayList<Movimento> historico = HistoricoDAO.getHistorico(codigo);
        if(historico != null){
            for(int i = 0; i < historico.size(); i++){
                if(historico.get(i).getData().equals(data.format(dataFormatada)) && historico.get(i).getDescricao().equals("REFEIÇÃO")){
                    String hora2 = historico.get(i).getHora().substring(0, 2);
                    if(Integer.parseInt(hora.format(horaFormatada)) > 14 && Integer.parseInt(hora2) > 14){
                        return true;
                    }
                    if(Integer.parseInt(hora.format(horaFormatada)) < 14 && Integer.parseInt(hora2) < 14){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
