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
public class Collaborateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String noms;
	private String prenoms;
	private String dateNaiss;
//	private String niveauEtude;
	private String email;
	private String cv;
	private String tel;
	private Date dateInscription;
	private boolean contacte;
	private String infosSupp;
	private String notes;
	private Date dateContact;
	@Transient
	private String dateFormContact;
	@Transient
	private String heureFormContact;
}
