package com.example.user.aplifut.models;

public class Equipo {
    private int id;
    private String Equipo;
    private int PJ;
    private int G;
    private int E;
    private int P;
    private int GF;
    private int GC;
    private int DG;
    private int Pts;
    private String img;

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public int getPJ() {
        return PJ;
    }

    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getE() {
        return E;
    }

    public void setE(int e) {
        E = e;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public int getDG() {
        return DG;
    }

    public void setDG(int DG) {
        this.DG = DG;
    }

    public int getPts() {
        return Pts;
    }

    public void setPts(int pts) {
        Pts = pts;
    }
}
