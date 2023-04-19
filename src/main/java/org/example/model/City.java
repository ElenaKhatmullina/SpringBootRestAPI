package org.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

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
    @Column(name = "age")
    private short age;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "country")
    private Country country;


    public City() {

    }

    public City(String name, double area, int population, short age, Country country) {

        this.name = name;
        this.area = area;
        this.population = population;
        this.age = age;
        this.country = country;
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

}
