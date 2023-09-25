package org.example.entity.reportemedico;

public class ProblemaSalud {
    private int numOrden;
    private int IDEFam;
    private boolean hta;
    private boolean dbt;

    public ProblemaSalud(int numOrden, int IDEFam, boolean hta, boolean dbt) {
        this.numOrden = numOrden;
        this.IDEFam = IDEFam;
        this.hta = hta;
        this.dbt = dbt;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getIDEFam() {
        return IDEFam;
    }

    public void setIDEFam(int IDEFam) {
        this.IDEFam = IDEFam;
    }

    public boolean isHta() {
        return hta;
    }

    public void setHta(boolean hta) {
        this.hta = hta;
    }

    public boolean isDbt() {
        return dbt;
    }

    public void setDbt(boolean dbt) {
        this.dbt = dbt;
    }
}
