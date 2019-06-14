/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracoes;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author rafael
 */
public class Configuracao {
    
    private boolean exibirCorpoVazio;
    private boolean maxNumItensCorpo;
    private int numItensCorpo;

    private boolean removerItens;
    private HashSet<String> itensRemocao;
    
    private boolean confianca;
    private boolean lift;
    private boolean ri;
    private boolean conviccao;
    private boolean addedValue;
    private boolean oddsRatio;

    private double confMin;
    private double supMin;
    private double liftMin;
    private double riMin;
    private double conviccaoMin;
    private double addedValueMin;
    private double oddsRatioMin;
    
    public Configuracao(){
        setConfianca(false);
        setLift(false);
        setRi(false);
        setConviccao(false);
        
        
        setConfMin(0.0);       
        setSupMin(0.0);
        setLiftMin(0.0);
        setRiMin(0.0);
        setConviccaoMin(0.0);
        setAddedValueMin(0.0);
        setOddsRatioMin(0.0);
        
        setExibirCorpoVazio(false);
        setMaxNumItensCorpo(false);
        setNumItensCorpo(1);
        
        setRemoverItens(false);
        setItensRemocao(new HashSet<String>());
    }

    public HashSet<String> getItensRemocao() {
        return itensRemocao;
    }

    public void setItensRemocao(HashSet<String> itensRemocao) {
        this.itensRemocao = itensRemocao;
    }
    
    public boolean isRemoverItens() {
        return removerItens;
    }

    public void setRemoverItens(boolean removerItens) {
        this.removerItens = removerItens;
    }
    
    public int getNumItensCorpo() {
        return numItensCorpo;
    }

    public void setNumItensCorpo(int numItensCorpo) {
        this.numItensCorpo = numItensCorpo;
    }
    
    public boolean isMaxNumItensCorpo() {
        return maxNumItensCorpo;
    }

    public void setMaxNumItensCorpo(boolean maxNumItensCorpo) {
        this.maxNumItensCorpo = maxNumItensCorpo;
    }
    
    public boolean isExibirCorpoVazio() {
        return exibirCorpoVazio;
    }

    public void setExibirCorpoVazio(boolean exibirCorpoVazio) {
        this.exibirCorpoVazio = exibirCorpoVazio;
    }
    
    public boolean isRi() {
        return ri;
    }

    public void setRi(boolean ri) {
        this.ri = ri;
    }

    public boolean isConviccao() {
        return conviccao;
    }

    public void setConviccao(boolean conviccao) {
        this.conviccao = conviccao;
    }

    public double getRiMin() {
        return riMin;
    }

    public void setRiMin(double riMin) {
        this.riMin = riMin;
    }

    public double getConviccaoMin() {
        return conviccaoMin;
    }

    public void setConviccaoMin(double conviccaoMin) {
        this.conviccaoMin = conviccaoMin;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }
    
    public double getLiftMin() {
        return liftMin;
    }

    public void setLiftMin(double liftMin) {
        this.liftMin = liftMin;
    }
    
    public boolean isConfianca() {
        return confianca;
    }

    public void setConfianca(boolean confianca) {
        this.confianca = confianca;
    }

    public double getConfMin() {
        return confMin;
    }

    public void setConfMin(double confMin) {
        this.confMin = confMin;
    }

    public double getSupMin() {
        return supMin;
    }

    public void setSupMin(double supMin) {
        this.supMin = supMin;
    }

    public boolean isAddedValue() {
        return addedValue;
    }

    public void setAddedValue(boolean addedValue) {
        this.addedValue = addedValue;
    }

    public boolean isOddsRatio() {
        return oddsRatio;
    }

    public void setOddsRatio(boolean oddsRatio) {
        this.oddsRatio = oddsRatio;
    }

    public double getAddedValueMin() {
        return addedValueMin;
    }

    public void setAddedValueMin(double addedValueMin) {
        this.addedValueMin = addedValueMin;
    }

    public double getOddsRatioMin() {
        return oddsRatioMin;
    }

    public void setOddsRatioMin(double oddsRatioMin) {
        this.oddsRatioMin = oddsRatioMin;
    }
    
    
    
    
}
