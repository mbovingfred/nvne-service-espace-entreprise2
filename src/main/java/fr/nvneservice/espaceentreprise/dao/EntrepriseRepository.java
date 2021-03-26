package fr.nvneservice.espaceentreprise.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.nvneservice.espaceentreprise.entities.UserEntreprise;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@CrossOrigin("*")
@RepositoryRestResource
public interface EntrepriseRepository extends JpaRepository<UserEntreprise, Long> {
    @RestResource(path = "/findByEmail")
    public UserEntreprise findByEmail(@Param("email") String email);
//        @RestResource(path = "/byNom")
//        public List<Entreprise> FindByNomContains(@Param("n") String nom);
//        @RestResource(path = "/byNomPage")
//        public Page<Entreprise> FindByNomContains(@Param("n") String nom, Pageable pageable);
        
}