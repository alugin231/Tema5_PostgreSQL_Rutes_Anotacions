package classes;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PuntPK.class)
public class Punt {
    private int numR;
    private int numP;
    private String nomP;
    private Float latitud;
    private Float longitud;
    private Ruta rutaByNumR;

    @Id
    @Column(name = "num_r")
    public int getNumR() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    @Id
    @Column(name = "num_p")
    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    @Basic
    @Column(name = "nom_p")
    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    @Basic
    @Column(name = "latitud")
    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    @Basic
    @Column(name = "longitud")
    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punt punt = (Punt) o;
        return numR == punt.numR && numP == punt.numP && Objects.equals(nomP, punt.nomP) && Objects.equals(latitud, punt.latitud) && Objects.equals(longitud, punt.longitud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numR, numP, nomP, latitud, longitud);
    }

    //@ManyToOne
    //@JoinColumn(name = "num_r", referencedColumnName = "num_r", nullable = false)
    @ManyToOne
    @JoinColumn(name = "num_r", referencedColumnName = "num_r", nullable = false, insertable = false, updatable = false)
    public Ruta getRutaByNumR() {
        return rutaByNumR;
    }

    public void setRutaByNumR(Ruta rutaByNumR) {
        this.rutaByNumR = rutaByNumR;
    }
}
