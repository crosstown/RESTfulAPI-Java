package com.crosstown.wisdompets.domain.Response;

/**
 * @author developer
 * @date 2019-06-25
 * @time 02:23
 */
public class PetResponse {

    private Long id;
    private String name;
    private String species;
    private String sex;
    private Integer age;

    public PetResponse(Long id, String name, String species, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
    }

    public PetResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
