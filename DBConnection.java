/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRC;
import UTILS.SimplifyConnection;
import UTILS.SimplifyStatement;

public class DBConnection {
    public static String resultatTable = "resultat";
    public static String consultationTable = "consultation";
    public static String avisTable = "avis";
    public static String employeTable = "employe";
    public static String clientTable = "client";
    public static String adminTable = "admin";
    public static String responsableTable = "responsable";
    public static String prereservationTable = "prereservation";
    public static String visiteConfirmeTable = "visiteConfirme";
    public static String visiteAnnuleTable = "visiteAnnule";
    public static String visiteFaitTable = "visiteFait";

    public static String adminNom = "nom";
    public static String adminPrenom = "prenom";
    public static String adminCode = "code_";
    public static String adminPassword = "password_";

    public static String employeNom = "nom";
    public static String employePrenom = "prenom";
    public static String employeCode = "code_";
    public static String employePassword = "password_";
    public static String employeSecteur = "secteur";
    public static String employeExperience = "experience";
    public static String employeSpecialite = "specialite";

    public static String clientNSS = "nss";
    public static String clientNom = "nom";
    public static String clientPrenom = "prenom";
    public static String clientNaissance = "naissance";
    public static String clientAdresse = "adresse";
    public static String clientTelephone = "telephone";
    public static String clientMail = "mail";
    public static String clientPassword = "password_";

    public static String resultatNumero = "numero";
    public static String resultatEtat = "etat";
    public static String resultatRecommendation = "recommandation";
    public static String resultatTraitement = "traitement";

    public static String avisNumero = "numero";
    public static String avisQualiteCon = "qualiteCon";
    public static String avisQualiteMed = "qualiteMed";
    public static String avisCommentaire = "commentaire";

    public static String consultationNumero = "numero_";
    public static String consultationNSS = "nss";
    public static String consultationCode = "code_";
    public static String consultationDate = "date_";
    public static String consultationType = "type_";
    public static String consultationService = "service_";
    public static String consultationEtat = "etat_";

    public static String responsableCode = "code_";
    

    
    
    
    public static SimplifyConnection connection;
    public static SimplifyStatement statement;
    
    
}
