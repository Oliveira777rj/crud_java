package com.crud_java.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_java.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}
