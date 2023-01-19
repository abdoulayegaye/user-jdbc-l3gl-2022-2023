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
        List<User> listeUsers = iUser.list();
        System.out.println("Liste des utilisateurs");
        for (User u : listeUsers) {
            System.out.println(u.getPrenom() + " - " + u.getNom() + " [ " + u.getEmail() + " ] ");
        }
    }
}