package classes;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Ruta {
    private int numR;
    private String nomR;
    private Integer desnivell;
    private Integer desnivellAcumulat;
    private Collection<Punt> punts;

    @Id
    @Column(name = "num_r")
    public int getNumR() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    @Basic
    @Column(name = "nom_r")
    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    @Basic
    @Column(name = "desnivell")
    public Integer getDesnivell() {
        return desnivell;
    }

    public void setDesnivell(Integer desnivell) {
        this.desnivell = desnivell;
    }

    @Basic
    @Column(name = "desnivell_acumulat")
    public Integer getDesnivellAcumulat() {
        return desnivellAcumulat;
    }

    public void setDesnivellAcumulat(Integer desnivellAcumulat) {
        this.desnivellAcumulat = desnivellAcumulat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruta ruta = (Ruta) o;
        return numR == ruta.numR && Objects.equals(nomR, ruta.nomR) && Objects.equals(desnivell, ruta.desnivell) && Objects.equals(desnivellAcumulat, ruta.desnivellAcumulat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numR, nomR, desnivell, desnivellAcumulat);
    }

    @OneToMany(mappedBy = "rutaByNumR")
    public Collection<Punt> getPunts() {
        return punts;
    }

    public void setPunts(Collection<Punt> punts) {
        this.punts = punts;
    }
}
