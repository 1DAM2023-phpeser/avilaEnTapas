package com.iesam.avilaEnTapas.features.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {
    ArrayList<Tapa> obtainTapas();

    Tapa obtainTapa(String tapaId);

    void deleteTapa(String tapaId);

    void saveTapa(Tapa tapa);

    void updateTapa(Tapa tapa);
}
