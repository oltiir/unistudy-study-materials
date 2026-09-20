
package Grupi5;

import java.util.Objects;

public abstract class KafshaGaruese extends Thread {
    public int mosha;
    public String emri;
    public int pozitaStartuese;

    public KafshaGaruese(int mosha, String emri, int pozitaStartuese) {
        this.mosha = mosha;
        this.emri = emri;
        this.pozitaStartuese = pozitaStartuese;
    }

    public int getMosha() {
        return mosha;
    }

    public String getEmri() {
        return emri;
    }

    public int getPozitaStartuese() {
        return pozitaStartuese;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setPozitaStartuese(int pozitaStartuese) {
        this.pozitaStartuese = pozitaStartuese;
    }

    @Override
    public String toString() {
        return "KafshaGaruese{" + "mosha=" + mosha + ", emri=" + emri + ", pozitaStartuese=" + pozitaStartuese + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KafshaGaruese other = (KafshaGaruese) obj;
        return true;
    }
    
        
}
