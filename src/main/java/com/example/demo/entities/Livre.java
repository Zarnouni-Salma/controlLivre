package com.example.demo.entities;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Livre {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(length = 50,nullable = false)
private String titre ;
@Column(updatable = false,nullable = false)
private String maisonEdition;
@Column(nullable = false)
@Temporal(TemporalType.DATE)
private Date dateSortie;
@Column(nullable = false)
private String auteur;
@Column(nullable = false)
private int nbrPage;
@Column(nullable = false,updatable = false,unique = true)
private String isbn;
@Temporal(TemporalType.DATE)
@Column(nullable = false)
private Date derniereConsultation;
@Column(nullable = false)
private boolean isDisponible;
}
