package com.iesam.avilaEnTapas.features.tapas.data;

import com.iesam.avilaEnTapas.features.tapas.domain.Tapa;
import com.iesam.avilaEnTapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private static TapaDataRepository instance = null;

    private ArrayList<Tapa> localTapas = new ArrayList<>();

    private TapaDataRepository(){
        initData();
    }

    @Override
    public ArrayList<Tapa> obtainTapas(){
        return localTapas;
    }

    @Override
    public Tapa obtainTapa(String tapaId){
        for (Tapa tapa: localTapas)
            if (tapa.getId().equals(tapaId))
                return tapa;
        return null;

    }

    @Override
    public void deleteTapa(String tapaId){
        for (int i = 0; i < localTapas.size(); i++)
            if (localTapas.get(i).getId().equals(tapaId))
                localTapas.remove(i);
    }

    @Override
    public void saveTapa(Tapa tapa){
        localTapas.add(tapa);
    }

    @Override
    public void updateTapa(Tapa tapa){
        deleteTapa(tapa.getId());
        saveTapa(tapa);
    }
    private void initData() {

    }

    public static TapaDataRepository newInstance(){
        if (instance == null){
            instance = new TapaDataRepository();
        }
        return instance;
    }
}