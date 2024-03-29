package com.pms.payrollapi.entity;

import java.util.Objects;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Double priceHour;

    public User() {
    }

    public User(Long id, String name, String email, String password, Double priceHour) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.priceHour = priceHour;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(Double hourPrice) {
        this.priceHour = hourPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
