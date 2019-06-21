package com.teste.apiteste2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teste.apiteste2.domain.Empresa;
import com.teste.apiteste2.repository.EmpresaRepository;

@RestController
@RequestMapping("/livros")
public class EmpresaResources {
	
	@Autowired
	private EmpresaRepository livrosRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Empresa> listar() {
		return livrosRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Empresa livro) {
		livrosRepository.save(livro);
	}


}
