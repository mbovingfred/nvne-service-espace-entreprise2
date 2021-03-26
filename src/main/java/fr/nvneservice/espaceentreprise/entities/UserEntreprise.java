package fr.nvneservice.espaceentreprise.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntreprise {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
        private String uid;
	private String nomEntreprise;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private Date dateInscription;
	private Date birthdate;
	private String birthplace;
	private String adresse;
	private String postal;
	private String activite;
	private String kbis;
	private String pceId;
	private String rib;
	@Transient
	private String formkbis;
	@Transient
	private String formpceId;
	@Transient
	private String formrib;
	private String description;
	@Transient
	private String birthdateForm;
	@Transient
	private String heureFormContact;
}