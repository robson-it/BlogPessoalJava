package com.robsonrocha.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.robsonrocha.blogpessoal.model.Postagem;
import java.util.List;


public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
}
