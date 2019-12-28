package cat.emprul.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "races")
public class Race implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_race")
    private Long id;
     
    private String nom;
    
    private java.math.BigDecimal distancia;
    
    private boolean circular;
    
    @Column(name="desnivell_pos")
    private int desnivellPos;
    
    @Column(name="desnivell_neg")
    private int desnivellNeg;
    
    @Column(name="hora_inici")
    private Date horaInici;
    
    @Column(name="temps_total")
    private String tempsTotal;

    private byte tipus;
    
    @Column(name="event")
    private Long eventId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public java.math.BigDecimal getDistancia() {
		return distancia;
	}

	public void setDistancia(java.math.BigDecimal distancia) {
		this.distancia = distancia;
	}

	public boolean isCircular() {
		return circular;
	}

	public void setCircular(boolean circular) {
		this.circular = circular;
	}

	public int getDesnivellPos() {
		return desnivellPos;
	}

	public void setDesnivellPos(int desnivellPos) {
		this.desnivellPos = desnivellPos;
	}

	public int getDesnivellNeg() {
		return desnivellNeg;
	}

	public void setDesnivellNeg(int desnivellNeg) {
		this.desnivellNeg = desnivellNeg;
	}

	public Date getHoraInici() {
		return horaInici;
	}

	public void setHoraInici(Date horaInici) {
		this.horaInici = horaInici;
	}

	public String getTempsTotal() {
		return tempsTotal;
	}

	public void setTempsTotal(String tempsTotal) {
		this.tempsTotal = tempsTotal;
	}

	public byte getTipus() {
		return tipus;
	}

	public void setTipus(byte tipus) {
		this.tipus = tipus;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

}