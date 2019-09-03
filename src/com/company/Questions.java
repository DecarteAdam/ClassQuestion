package com.company;



public class Questions {

    /**
     * Parametres de question
     */

    boolean questionPosee = false;

    String question;
    String[] reponses = new String[4];
    String couleur;
    String categorie;
    int bonneReponse;

    /**
     * Constructeur
     */
    public Questions(){

    }

    //Mon constructeur Questions où je declare les parametres de la question
    public Questions(String question,String[] reponses,String couleur, String categorie, int bonneReponse){
        this.question = question;
        this.reponses = reponses;
        this.categorie = categorie;
        this.bonneReponse = bonneReponse;
        this.couleur = couleur;
    }

    /**
     * methodes qui va verifier l'exactitude la réponse entrée
     */

    public boolean siLaReponseEstVraiOuNon(int tentativeReponse){

        if (tentativeReponse ==this.bonneReponse){
            return true;
        }
        return false;
    }
}
