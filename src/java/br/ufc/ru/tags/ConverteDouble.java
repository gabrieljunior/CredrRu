package br.ufc.ru.tags;

import java.io.IOException;
import java.io.StringWriter;
import java.text.NumberFormat;
import java.util.Locale;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ConverteDouble extends SimpleTagSupport{
    private String valor = "STANDARD";
    
    public void setValor(String valor){ 
        this.valor = valor.toUpperCase(); 
    }
    
    @Override
    public void doTag() throws JspException, IOException{
        
        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();
        StringWriter sw = new StringWriter();
        sw.append(valor);
        double valorFloat = Double.parseDouble(valor);
        
        Locale ptBr = new Locale("pt", "BR");
        String valorString = NumberFormat.getCurrencyInstance(ptBr).format(valor);
        
        getJspContext().getOut().print(valorString);
        
    }
}
