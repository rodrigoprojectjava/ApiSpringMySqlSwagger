package br.com.treinaweb.springbootapi.DemoApplication.repository;

import br.com.treinaweb.springbootapi.DemoApplication.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> { }
