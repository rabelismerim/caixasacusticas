/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class ModeloProjetar {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alunos
 */
public class Projetar {
     private float Qts;
     private float Qes;
     private float Vas;
     private float Fs;
     private float Sd;
     private float Xmax;
     private float Wrms;
     private float Qtc;
     private float VolumeIntSelado;
     private float FreqRessonanSelado;
     private float FreqCorteIntSelado;
     private float VolumeIntGraves;
     private float FreqRessonanGraves;
     private float FreqCorteInfGraves;
     private float DiamDuctos;
     private float CompDuctos;
     private float NumDuctos;
     public Projetar()
    
     {}
     // Construtor
     public Projetar(Projetar CaixaAcusticaRecebido)
     {
        this.Qts=CaixaAcusticaRecebido.Qts;
        this.Qes=CaixaAcusticaRecebido.Qes;
        this.Vas=CaixaAcusticaRecebido.Vas;
        this.Fs=CaixaAcusticaRecebido.Fs;
        this.Sd=CaixaAcusticaRecebido.Sd;
        this.Xmax=CaixaAcusticaRecebido.Xmax;
        this.Wrms=CaixaAcusticaRecebido.Wrms;
        this.Qtc=CaixaAcusticaRecebido.Qtc;
        this.VolumeIntSelado=CaixaAcusticaRecebido.VolumeIntSelado;
        this.FreqRessonanSelado=CaixaAcusticaRecebido.FreqRessonanSelado;
        this.FreqCorteIntSelado=CaixaAcusticaRecebido.FreqCorteIntSelado;
        this.VolumeIntGraves=CaixaAcusticaRecebido.VolumeIntGraves;
        this.FreqRessonanGraves=CaixaAcusticaRecebido.FreqRessonanGraves;
        this.FreqCorteInfGraves=CaixaAcusticaRecebido.FreqCorteInfGraves;
        this.DiamDuctos=CaixaAcusticaRecebido.DiamDuctos;
        this.CompDuctos=CaixaAcusticaRecebido.CompDuctos;
        this.NumDuctos=CaixaAcusticaRecebido.NumDuctos;
        
     }
     
    // Construtor CADASTRO   
public Projetar (float Qts, float Qes, float Vas, float Fs, float Sd,float Xmax,float Wrms,float Qtc,float VolumeIntSelado,float FreqRessonanSelado,float FreqCorteIntSelado,
     float  VolumeIntGraves,float FreqRessonanGraves,float FreqCorteInfGraves,float DiamDuctos,float CompDuctos,float NumDuctos, float Mach)
    {   
        this.Qts=Qts;
        this.Qes=Qes;
        this.Vas=Vas;
        this.Fs=Fs;
        this.Sd=Sd;
        this.Xmax=Xmax;
        this.Wrms=Wrms;
        this.Qtc=Qtc;
        this.VolumeIntSelado=VolumeIntSelado;
        this.FreqRessonanSelado=FreqRessonanSelado;
        this.FreqCorteIntSelado=FreqCorteIntSelado;
        this.VolumeIntGraves=VolumeIntGraves;
        this.FreqRessonanGraves=FreqRessonanGraves;
        this.FreqCorteInfGraves=FreqCorteInfGraves;
        this.DiamDuctos=DiamDuctos;
        this.CompDuctos=CompDuctos;
        this.NumDuctos=NumDuctos;
        
        
        
        
        
    
    }

    /**
     * @return the Qts
     */
    public float getQts() {
        return Qts;
    }

    /**
     * @param Qts the Qts to set
     */
    public void setQts(int Qts) {
        this.Qts = Qts;
    }

    /**
     * @return the Qes
     */
    public float getQes() {
        return Qes;
    }

    /**
     * @param Qes the Qes to set
     */
    public void setQes(float Qes) {
        this.Qes = Qes;
    }

    /**
     * @return the Vas
     */
    public float getVas() {
        return Vas;
    }

    /**
     * @param Vas the Vas to set
     */
    public void setVas(int Vas) {
        this.Vas = Vas;
    }

    /**
     * @return the Fs
     */
    public float getFs() {
        return Fs;
    }

    /**
     * @param Fs the Fs to set
     */
    public void setFs(float Fs) {
        this.Fs = Fs;
    }

    /**
     * @return the Sd
     */
    public float getSd() {
        return Sd;
    }

    /**
     * @param Sd the Sd to set
     */
    public void setSd(int Sd) {
        this.Sd = Sd;
    }

    /**
     * @return the Xmax
     */
    public float getXmax() {
        return Xmax;
    }

    /**
     * @param Xmax the Xmax to set
     */
    public void setXmax(float Xmax) {
        this.Xmax = Xmax;
    }

    /**
     * @return the Wrms
     */
    public float getWrms() {
        return Wrms;
    }

    /**
     * @param Wrms the Wrms to set
     */
    public void setWrms(float Wrms) {
        this.Wrms = Wrms;
    }

    /**
     * @return the Qtc
     */
    public float getQtc() {
        return Qtc;
    }

    /**
     * @param Qtc the Qtc to set
     */
    public void setQtc(float Qtc) {
        this.Qtc = Qtc;
    }

    /**
     * @return the VolumeIntSelado
     */
    public float getVolumeIntSelado() {
        return VolumeIntSelado;
    }

    /**
     * @param VolumeIntSelado the VolumeIntSelado to set
     */
    public void setVolumeIntSelado(float VolumeIntSelado) {
        this.VolumeIntSelado = VolumeIntSelado;
    }

    /**
     * @return the FreqRessonanSelado
     */
    public float getFreqRessonanSelado() {
        return FreqRessonanSelado;
    }

    /**
     * @param FreqRessonanSelado the FreqRessonanSelado to set
     */
    public void setFreqRessonanSelado(float FreqRessonanSelado) {
        this.FreqRessonanSelado = FreqRessonanSelado;
    }

    /**
     * @return the FreqCorteIntSelado
     */
    public float getFreqCorteIntSelado() {
        return FreqCorteIntSelado;
    }

    /**
     * @param FreqCorteIntSelado the FreqCorteIntSelado to set
     */
    public void setFreqCorteIntSelado(float FreqCorteIntSelado) {
        this.FreqCorteIntSelado = FreqCorteIntSelado;
    }

    /**
     * @return the VolumeIntGraves
     */
    public float getVolumeIntGraves() {
        return VolumeIntGraves;
    }

    /**
     * @param VolumeIntGraves the VolumeIntGraves to set
     */
    public void setVolumeIntGraves(float VolumeIntGraves) {
        this.VolumeIntGraves = VolumeIntGraves;
    }

    /**
     * @return the FreqRessonanGraves
     */
    public float getFreqRessonanGraves() {
        return FreqRessonanGraves;
    }

    /**
     * @param FreqRessonanGraves the FreqRessonanGraves to set
     */
    public void setFreqRessonanGraves(float FreqRessonanGraves) {
        this.FreqRessonanGraves = FreqRessonanGraves;
    }

    /**
     * @return the FreqCorteInfGraves
     */
    public float getFreqCorteInfGraves() {
        return FreqCorteInfGraves;
    }

    /**
     * @param FreqCorteInfGraves the FreqCorteInfGraves to set
     */
    public void setFreqCorteInfGraves(float FreqCorteInfGraves) {
        this.FreqCorteInfGraves = FreqCorteInfGraves;
    }

    /**
     * @return the DiamDuctos
     */
    public float getDiamDuctos() {
        return DiamDuctos;
    }

    /**
     * @param DiamDuctos the DiamDuctos to set
     */
    public void setDiamDuctos(float DiamDuctos) {
        this.DiamDuctos = DiamDuctos;
    }

    /**
     * @return the CompDuctos
     */
    public float getCompDuctos() {
        return CompDuctos;
    }

    /**
     * @param CompDuctos the CompDuctos to set
     */
    public void setCompDuctos(float CompDuctos) {
        this.CompDuctos = CompDuctos;
    }

    /**
     * @return the NumDuctos
     */
    public float getNumDuctos() {
        return NumDuctos;
    }

    /**
     * @param NumDuctos the NumDuctos to set
     */
    public void setNumDuctos(float NumDuctos) {
        this.NumDuctos = NumDuctos;
    }

    
 
     


    
}

    
}
