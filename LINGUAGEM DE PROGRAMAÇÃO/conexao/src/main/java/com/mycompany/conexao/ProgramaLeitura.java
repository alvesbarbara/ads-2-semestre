
package com.mycompany.conexao;

import org.springframework.jdbc.core.JdbcTemplate;
import java.time.LocalDateTime;

public class ProgramaLeitura {
    
    public static void main(String[] args) {
        ConexaoDados con = new ConexaoDados();
        
        JdbcTempalte tamplate = new JdbcTemplate(con.getDataSource());
        
                tamplate.update("INSET INTO LEITURA(ORIGEM, VALOR, DATA_HORA) VALUES (?,?,?)",
                "CPU", 50, LocalDateTime.now());
                  
                tamplate.update("INSET INTO LEITURA(ORIGEM, VALOR, DATA_HORA) VALUES (?,?,?)",
                "RAM", 10, LocalDateTime.now());
                
                tamplate.update("INSET INTO LEITURA(ORIGEM, VALOR, DATA_HORA) VALUES (?,?,?)",
                "DISK", 80, LocalDateTime.now());
            
                List todosResultados = template.queryForList("SELECT * FROM  LEITURA");
           
                
               
                
        System.out.println("Resultados obtidos");                          
        System.out.println("todosResultados");
    
    
    
    
    }
}
