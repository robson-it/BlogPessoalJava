package com.robsonrocha.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.robsonrocha.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}
