package com.example.demo.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "entity_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private double area;

    @Column(name = "population")
    private int population;
    @OneToMany(mappedBy = "country")
    private List<City> allCitiesInCountry;

    public Country() {

    }

    public Country(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<City> getAllCitiesInCountry() {
        return allCitiesInCountry;
    }

    public void setAllCitiesInCountry(List<City> allCitiesInCountry) {
        this.allCitiesInCountry = allCitiesInCountry;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
