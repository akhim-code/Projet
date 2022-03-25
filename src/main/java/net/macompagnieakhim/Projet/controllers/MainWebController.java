package net.macompagnieakhim.Projet.controllers;

import net.macompagnieakhim.Projet.beans.Animal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class MainWebController {

    @GetMapping("/bonjour")
    public String coucou(){
        return "bonjour";
    }

    @GetMapping("/bonjour/{nom}")
    public String attrapeText(@PathVariable("nom") String nom){
        return "Bonjour " + nom + " !";
    }

    // Créez la page API/Transmission/{donnee} qui récupère la valeur de donnée et affiche
    // « J’ai bien reçu donnée : elle contient *afficher ici la donnée reçue*

    @GetMapping("/Transmission/{donnee}")
    public String transmission(@PathVariable("donnee") int donnee){
        return "J’ai bien reçu donnée : elle contient " + donnee + ".";
    }

    // Créez la page API/pairImpair/{nombre} qui récupère un nombre et affiche
    // « *nombre reçu* est pair » ou « *nombre reçu* est impair »

    @GetMapping("/pairImpair/{nombre}")
    public String pairImpair(@PathVariable("nombre") int nombre){
        if(nombre % 2 == 0){
            return "Le nombre " + nombre + " est pair.";
        }else{
            return "Le nombre " + nombre + " est impair.";
        }
    }

    // Créez la page API/recupAnimal/{nom}/{espece}/{age} qui récupère deux Strings et un int et qui affiche
    // « Mon animal s’appelle *nom* c’est un.e *espece* de *age* ans ».
    // Pour info, ce n’est pas comme ça que l’on récupère plusieurs informations en Spring,
    // mais cet exercice vous permet de vérifier que vous pouvez bien récupérer plusieurs informations par l’adresse

    @GetMapping("/recupAnimal/{nom}/{espece}/{age}")
    public String recupAnimal(@PathVariable("nom") String nom,
                              @PathVariable("espece") String espece,
                              @PathVariable("age") int age){
        return "Mon animal s'appelle " +  nom + " c'est un(e) " + espece + " de " +  age + " ans.";
    }

    //Créez dans le contrôleur une méthode d’API @GetMapping("/mesTestsHTTP") qui retourne le texte « j’ai été invoqué en GET ».
    // Vérifiez dans votre navigateur en allant à l’adresse localhost:8080/API/mesTestsHTTP que vous recevez bien ce texte

    @GetMapping("/mesTestsHTTP")
    public String testHTTPGet(){
        return "J'ai été récupéré en get";
    }

    // Dans le contrôleur, créez une méthode d’API @PostMapping("/mesTestsHTTP") qui retourne le texte « j’ai été invoqué en POST ».
    // On ne peut malheureusement pas vérifier que cette méthode marche aisément avec un navigateur

    @PostMapping("/mesTestsHTTP")
    public String testHTTPPost(){
        return "J'ai été récupéré en post";
    }

    // Rajoutez dans votre contrôleur la méthode d’API @PatchMapping("/mesTestsHTTP") qui affiche « j’ai été invoqué en PATCH ».
    @PatchMapping("/mesTestsHTTP")
    public String testHTTPPatch(){
        return "J'ai été récupéré en patch";
    }

    @PutMapping("/mesTestsHTTP")
    public String testHTTPPut(){
        return "J'ai été récupéré en put";
    }

    @DeleteMapping("/mesTestsHTTP")
    public String testHTTPDelete(){
        return "J'ai été récupéré en delete";
    }

    // Dans le contrôleur, créez la méthode Animal exempleAnimal() qui instancie un animal et le retourne.
    // N’oubliez pas de lui associer une adresse. Lancez votre serveur, allez sur la page de cette méthode et
    // constatez que vous récupérez l’instance en JSON

    @GetMapping("/animal")
    public Animal exempleAnimal(){
        Animal animal1 = new Animal("Clifford", "chien", 5);
        return animal1;
    }

    // Dans le contrôleur, créez la méthode String recuperationAnimal(@RequestBody Animal anim) qui
    // affiche juste anim et qui retourne la String « OK ». N’oubliez pas de la mapper avec un @PostMapping.
    // On ne peut malheureusement pas directement tester cette méthode en navigateur

    @PostMapping("/animal")
    public String recuperationAnimal(@RequestBody Animal anim){
        System.out.println(anim);
        return "Ok";
    }

    @PostMapping("/testPost")
    public String testPost(){
        return "ok";
    }
    // Plusieurs erreur : aucuns button ne fonctionneent, erreur dans récupération animal

}
