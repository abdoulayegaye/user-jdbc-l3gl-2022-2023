package presentation;

import sn.exo.controller.IUser;
import sn.exo.controller.UserImpl;
import sn.exo.entities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IUser iUser = new UserImpl();
       /**User user = new User();

        user.setNom("GAYE");
        user.setPrenom("Djibo");
        user.setEmail("djibo@groupeisi.com");
        user.setPassword("passer@1234");

        if(iUser.add(user) == 1){
            System.out.println("Utilisateur créé avec Succés !");
        }else{
            System.out.println("Insertion échouée !");
        }*/
        /*List<User> listeUsers = iUser.list();
        System.out.println("Liste des utilisateurs");
        for (User u : listeUsers) {
            System.out.println(u.getPrenom() + " - " + u.getNom() + " [ " + u.getEmail() + " ] ");
        }*/
        /*User user = new User();

        user.setId(2);
        user.setNom("FAYE");
        user.setPrenom("Babs");
        user.setEmail("babacar@groupeisi.com");
        user.setPassword("toto@1234");

        if(iUser.update(user) == 1){
            System.out.println("Utilisateur modifié avec Succés !");
        }else{
            System.out.println("Modification échouée !");
        }*/

        /*if(iUser.delete(7) == 1){
            System.out.println("Utilisateur supprimé avec Succés !");
        }else{
            System.out.println("Suppression échouée !");
        }*/

        User u = iUser.get(1);
        System.out.println("L'utilisateur dont son id=1 est : " +
                u.getPrenom() + " " + u.getNom() + " ["+u.getEmail()+"]");
    }
}