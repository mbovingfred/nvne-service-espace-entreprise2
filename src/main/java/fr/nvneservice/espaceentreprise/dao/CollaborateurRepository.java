package fr.nvneservice.espaceentreprise.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.nvneservice.espaceentreprise.entities.Collaborateur;
@CrossOrigin("*")
@RepositoryRestResource
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {
	public Collaborateur findByEmail(String email);
}
