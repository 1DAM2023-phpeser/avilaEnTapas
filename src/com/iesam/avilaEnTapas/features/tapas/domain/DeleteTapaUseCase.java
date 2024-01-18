package com.iesam.avilaEnTapas.features.tapas.domain;

public class DeleteTapaUseCase {

    private TapaRepository tapaRepository;

    public DeleteTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public void execute(String tapId){
        tapaRepository.deleteTapa(tapId);
    }
}
