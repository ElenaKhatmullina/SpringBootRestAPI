package org.example.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private double area;

    @Column(name = "population")
    private int population;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private List<City> allCitiesInCountry;

    public Country() {

    }

    public Country(Integer id, String name, double area, int population) {
        this.id = id;
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
