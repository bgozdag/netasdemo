package com.example.demo.model;


import org.primefaces.model.UploadedFile;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int phone;
    private String city;
    private String district;
    private String description;
    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public Student() {
    }

    public Student(int id, String name, String surname, int phone, String city, String district, String description){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.phone=phone;
        this.city=city;
        this.district=district;
        this.description=description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}