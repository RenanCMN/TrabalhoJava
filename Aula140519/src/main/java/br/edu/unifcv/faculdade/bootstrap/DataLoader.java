package br.edu.unifcv.faculdade.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.unifcv.faculdade.model.Autor;
import br.edu.unifcv.faculdade.model.Livro;
import br.edu.unifcv.faculdade.repository.AutorRepository;
import br.edu.unifcv.faculdade.repository.LivroRepository;


//@Component
public class DataLoader implements CommandLineRunner  {

	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private AutorRepository autorRepository;

	@Override
	public void run(String... args) throws Exception {
		Autor a = new Autor();

		a.setNome("Andre");
		a.setNacionalidade("Brasileiro");
		a = autorRepository.save(a);

		List<Autor> t = autorRepository.findAll();

			

		autorRepository.save(a);
		
		Livro l1 = new Livro();
		l1.setAutor(a);
		l1.setNome("OlaMundo");
		l1.setResumo("Resumo Ola");
		l1.setEditora("Brasileira");
		List<Livro> lista = new ArrayList<>();
	    lista.add(l1);
	    
	    l1 = livroRepository.save(l1);
	    livroRepository.save(l1);
		
		//autorRepository.deleteById(a.getId());

	}

}
