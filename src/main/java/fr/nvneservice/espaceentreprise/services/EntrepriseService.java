package fr.nvneservice.espaceentreprise.services;

import fr.nvneservice.espaceentreprise.entities.UserEntreprise;
public interface EntrepriseService {
	public UserEntreprise findByEmail(String email);
	public UserEntreprise registerEntreprise(UserEntreprise entreprise);
}
