package classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PuntPK implements Serializable {
    private int numR;
    private int numP;

    @Column(name = "num_r")
    @Id
    public int getNumR() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    @Column(name = "num_p")
    @Id
    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PuntPK puntPK = (PuntPK) o;
        return numR == puntPK.numR && numP == puntPK.numP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numR, numP);
    }
}
