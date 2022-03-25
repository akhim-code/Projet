package net.macompagnieakhim.Projet.beans;

//tout le monde aime les animals
public class Animal {
    private String nom = "";
    private String espece  = "";
    private int age = 0;
    //helloworld
    public Animal(String nom, String espece, int age) {
        this.nom = nom;
        this.espece = espece;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAgeZero(int age) {
        this.age = 10000;
    }
    @Override
    public String toString() {
        return "Animal{nom='" + nom + "', espece='" + espece + "', age=" + age + "}";
    }
}