package com.iesam.avilaEnTapas.features.tapas.domain;

public class GetTapaUseCase {

    private TapaRepository tapaRepository;

    public GetTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public Tapa execute(String tapId){
        return this.tapaRepository.obtainTapa(tapId);
    }
}
