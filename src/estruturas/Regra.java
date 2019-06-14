/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

/**
 *
 * @author rafael
 */
public class Regra {
    
    String cabeca;
    String corpo;
    
    double suporte;
    double confianca;
    double lift;
    double ri;
    double conviccao;
    double addedValue;
    double oddsRatio;
    
    public Regra(){
        cabeca = "";
        corpo = "";
        suporte = 0;
        confianca = 0;
        lift = 0;
        ri = 0;
        conviccao = 0;
    }

    public Regra(String corpo, String cabeca, double suporte, double confianca, double lift, double ri, double conviccao, double addedValue, double oddsRatio){
        this.corpo = corpo;
        this.cabeca = cabeca;
        this.suporte = suporte;
        this.confianca = confianca;
        this.lift = lift;
        this.ri = ri;
        this.conviccao = conviccao;
        this.addedValue = addedValue;
        this.oddsRatio = oddsRatio;
    }

    public double getRi() {
        return ri;
    }

    public void setRi(double ri) {
        this.ri = ri;
    }

    public double getConviccao() {
        return conviccao;
    }

    public void setConviccao(double conviccao) {
        this.conviccao = conviccao;
    }

    public double getLift() {
        return lift;
    }

    public void setLift(double lift) {
        this.lift = lift;
    }
    
    public String getCabeca() {
        return cabeca;
    }

    public void setCabeca(String cabeca) {
        this.cabeca = cabeca;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public double getSuporte() {
        return suporte;
    }

    public void setSuporte(double suporte) {
        this.suporte = suporte;
    }

    public double getConfianca() {
        return confianca;
    }

    public void setConfianca(double confianca) {
        this.confianca = confianca;
    }

    public double getAddedValue() {
        return addedValue;
    }

    public void setAddedValue(double addedValue) {
        this.addedValue = addedValue;
    }

    public double getOddsRatio() {
        return oddsRatio;
    }

    public void setOddsRatio(double oddsRatio) {
        this.oddsRatio = oddsRatio;
    }
    
    
}
