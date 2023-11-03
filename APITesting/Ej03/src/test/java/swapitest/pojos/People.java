package swapitest.pojos;

import java.util.List;

public class People {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;

    // Constructor vacío
    public People() {
    }

    // Getters y setters para cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hair_color;
    }

    public void setHairColor(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkinColor() {
        return skin_color;
    }

    public void setSkinColor(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEyeColor() {
        return eye_color;
    }

    public void setEyeColor(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirthYear() {
        return birth_year;
    }

    public void setBirthYear(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getStarships() {
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\n' +
                ", height='" + height + '\n'  +
                ", mass='" + mass + '\n'  +
                ", hair_color='" + hair_color + '\n'  +
                ", skin_color='" + skin_color + '\n' +
                ", eye_color='" + eye_color + '\n'  +
                ", birth_year='" + birth_year + '\n'  +
                ", gender='" + gender + '\n'  +
                ", homeworld='" + homeworld + '\n' +
                ", films=" + films +'\n' +
                ", species=" + species +'\n' +
                ", vehicles=" + vehicles +'\n' +
                ", starships=" + starships +
                ", created='" + created +'\n' +
                ", edited='" + edited +'\n' +
                ", url='" + url;
    }
}

