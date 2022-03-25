package com.generation.blogpessoal.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long> {
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
		//metódo para buscar por título que contenha a palavra de indicação ignorando maiuscula ou minúscula
	
		// SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%";
	
	public Object existsById(@Valid Postagem postagem);
	

}
