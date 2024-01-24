package com.iesam.avilaEnTapas.features.tapas.domain;

public class Tapa {

    private String id;
    private String name;
    private String place;
    private String totalPoints;
    private String averagePoints;
    private String numberParticipants;
    private String totalVotes;
    private String ingredients;

    public Tapa(String name, String place, String totalPoints, String averagePoints, String numberParticipants, String totalVotes, String ingredients) {
        this.name = name;
        this.place = place;
        this.totalPoints = totalPoints;
        this.averagePoints = averagePoints;
        this.numberParticipants = numberParticipants;
        this.totalVotes = totalVotes;
        this.ingredients = ingredients;
    }

    public Tapa(String id, String name, String place, String totalPoints, String averagePoints, String numberParticipants, String totalVotes, String ingredients) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.totalPoints = totalPoints;
        this.averagePoints = averagePoints;
        this.numberParticipants = numberParticipants;
        this.totalVotes = totalVotes;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getAveragePoints() {
        return averagePoints;
    }

    public void setAveragePoints(String averagePoints) {
        this.averagePoints = averagePoints;
    }

    public String getNumberParticipants() {
        return numberParticipants;
    }

    public void setNumberParticipants(String numberParticipants) {
        this.numberParticipants = numberParticipants;
    }

    public String getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(String totalVotes) {
        this.totalVotes = totalVotes;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Tapa{" +
                "id='" + id + '\'' +
                ", Nombre='" + name + '\'' +
                ", Establecimiento='" + place + '\'' +
                ", Puntos totales='" + totalPoints + '\'' +
                ", Media de votos='" + averagePoints + '\'' +
                ", Numero de participantes='" + numberParticipants + '\'' +
                ", Total de votos='" + totalVotes + '\'' +
                ", Ingredientes='" + ingredients + '\'' +
                '}' + "\n";
    }
}
