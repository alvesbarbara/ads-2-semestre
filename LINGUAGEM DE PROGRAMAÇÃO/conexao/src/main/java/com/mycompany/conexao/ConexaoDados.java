
package com.mycompany.conexao;

import org.apache.commons.dbcp2.BasicDataSource;


public class ConexaoDados {
    
    private BasicDataSource dataSource;//
    
    public ConexaoDados(){
        this.dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("org.h2.Driver");
        dataSource​.setUrl("jdbc:h2:file:~/testdb");
        dataSource​.setUsername("Babr");
        dataSource​.setPassword("");

    }
    
    public BasicDataSource getDataSource(){
    return dataSource;}
}
