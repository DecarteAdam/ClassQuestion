package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Mes reponses qui sont lié à la question
        String[] reponses = {"1.Ford","2.Nissan","3.Citroen","4.Toyota"};

        //mon objet de question qui contien les paramétres (question,reponses,couleur,categorie et la bonne reponse
        Questions question1 = new Questions("Parmi ces constructeurs automobiles, lesquels sont originaires d'Europe ?",reponses,"Rouge","Geography",3);

        //Dialog avec l'utilisateur
        System.out.println("La question est : "+question1.question);
        System.out.println("La categorie est : " +question1.categorie);
        System.out.println("La couleur est : " +question1.couleur);

        System.out.println("Les reponses: \n");

        //Je parcour mon tableau de "reponses" pour afficher à l'utilisateur les réponces lié à cette question
        for (String question :question1.reponses
                ) {
            System.out.println(question);
        }

        System.out.println("\nRepondez avec : (1,2,3,4)");

        Scanner sc = new Scanner(System.in);
        int reponseUtil = sc.nextInt();

        //J'apelle la methode "siLaReponseEstVraiOuNon" pour comparer la réponse utilisateur et la bonne réponse et lui afficher si il a repondu Correct ou Incorrect
        if (question1.siLaReponseEstVraiOuNon(reponseUtil)){
            System.out.println("Correct!");
        }else{
            System.out.println("Faux!");
        }
    }
}
