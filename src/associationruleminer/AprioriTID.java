/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associationruleminer;

import configuracoes.Configuracao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author rafael
 */
public class AprioriTID {
    
    public HashMap<String,Double> minerar(HashMap<String,HashSet<Integer>> map, double supMin, int numTransacoes, Configuracao config){
        
        HashMap<String,HashSet<Integer>> itemsetsFrequentes = new HashMap<String,HashSet<Integer>>();
        HashMap<String,Double> itemsetsSuporte = new HashMap<String,Double>();
        
        
        
        //Separando os 1-Itemset Frequentes
        if(config.isRemoverItens()){
            HashSet<String> itensRemocao = config.getItensRemocao();
            for (String key : map.keySet()) {
                if(!itensRemocao.contains(key)){
                    double suporte = (double)map.get(key).size() / numTransacoes;
                    if(suporte >= supMin){
                        itemsetsFrequentes.put(key,map.get(key));
                    }    
                }
            }
        }else{
            for (String key : map.keySet()) {
                double suporte = (double)map.get(key).size() / numTransacoes;
                if(suporte >= supMin){
                    itemsetsFrequentes.put(key,map.get(key));
                }
            }
        }
        
        
        
        HashMap<String,HashSet<Integer>> itemsetsFrequentesAtuais = new HashMap<String,HashSet<Integer>>();
        //Copiando os 1-Itemset Frequentes para os itemsetFrequentesAtuais
        for (String key : itemsetsFrequentes.keySet()) {
            itemsetsFrequentesAtuais.put(key, itemsetsFrequentes.get(key));
        }
        
        //Encontrando os L-X itemsets Frequentes
        boolean sair = false;
        int contador = 0;
        while(sair == false){
            
            ArrayList<String> itemsets = new ArrayList<String>();
            for (String key : itemsetsFrequentesAtuais.keySet()) {
                itemsets.add(key);
            }
            Collections.sort(itemsets);
            
            HashMap<String,HashSet<Integer>> novosItemsetsFrequentes = new HashMap<String,HashSet<Integer>>();
            
            for(int i1=0;i1<itemsets.size();i1++){
                String item1 = itemsets.get(i1);
                for(int i2=i1+1;i2<itemsets.size();i2++){
                    String item2 = itemsets.get(i2);
                    //Comparando o começo das regras k-2 itens em comum
                    String novoItemset = "";
                    if(contador > 0){
                        String parteItem1 = item1.substring(0,item1.lastIndexOf(","));
                        String parteItem2 = item2.substring(0,item2.lastIndexOf(","));
                        //Vendo se o começo é igual para combinar as regras
                        if(parteItem1.equals(parteItem2)){
                            String restoItem1 = item1.substring(item1.lastIndexOf(","),item1.length());
                            String restoItem2 = item2.substring(item2.lastIndexOf(","),item2.length());
                            novoItemset = parteItem1 + restoItem1 + restoItem2;
                        }else{
                            if(parteItem2.compareTo(parteItem1) > 0){
                                break;
                            }else{
                                continue;
                            }
                        }
                    }else{
                        novoItemset = item1 + "," + item2;
                    }
                    
                    HashSet<Integer> ids = calculaOverlap(item1,item2,itemsetsFrequentesAtuais,numTransacoes);
                    double suporte = (double)ids.size()/numTransacoes;
                    if(suporte >= supMin){
                        novosItemsetsFrequentes.put(novoItemset, ids);
                    }
                }
                double suporte = (double)itemsetsFrequentesAtuais.get(item1).size()/numTransacoes;
                itemsetsSuporte.put(item1, suporte);
                itemsetsFrequentesAtuais.remove(item1);
            }
            contador++;
            itemsetsFrequentesAtuais = novosItemsetsFrequentes;
            if(itemsetsFrequentesAtuais.keySet().size() == 0){
                sair = true;
            }
            
            if(config.isMaxNumItensCorpo()){
                if(contador == config.getNumItensCorpo() + 1){
                    sair = true;
                }
            }
        }
        
        return itemsetsSuporte;
    }
            
    private HashSet<Integer> calculaOverlap(String item1, String item2, HashMap<String,HashSet<Integer>> itemsetsFrequentes, int numTransacoes){

        HashSet<Integer> ids = new HashSet<Integer>();
        int contador = 0;
        Iterator<Integer> iterator = itemsetsFrequentes.get(item1).iterator();
        while(iterator.hasNext()){
            int id = iterator.next();
            if(itemsetsFrequentes.get(item2).contains(id)){
                ids.add(id);
            }
        }
        
        return ids;
    }        
    
}
