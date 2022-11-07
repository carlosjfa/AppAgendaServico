package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.model.domain.Procedimento;
import br.edu.infinet.appagendaservico.model.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

		@Autowired
		private ProcedimentoRepository procedimentoRepository;
		
		
		public void incluir(Procedimento procedimento) {
			procedimentoRepository.save(procedimento);
		}
		
		public void excluir(Integer id) {
			procedimentoRepository.deleteById(id);
		}
		
		public Collection<Procedimento> obterLista(){
			return (Collection<Procedimento>) procedimentoRepository.findAll();
		}
		
}
