package fr.nvneservice.espaceentreprise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.nvneservice.espaceentreprise.dao.EntrepriseRepository;
import fr.nvneservice.espaceentreprise.entities.UserEntreprise;
@Service
public class EntrepriseServiceImpl implements EntrepriseService {

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	
	@Override
	public UserEntreprise registerEntreprise(UserEntreprise entreprise) {
		return this.entrepriseRepository.save(entreprise);
	}

	@Override
	public UserEntreprise findByEmail(String email) {
		return entrepriseRepository.findByEmail(email);
	}
}
