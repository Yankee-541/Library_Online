/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tebellum
 */
public class account {

       private int user_id;
       private String user_name, password, display_name, phone, email, img;
       private ArrayList<feedback> feedback;
       private favorite favorite;
       private ArrayList<permission> permistion = new ArrayList<>();
       private ArrayList<group> group = new ArrayList<>();

       public ArrayList<group> getGroup() {
              return group;
       }

       public void setGroup(ArrayList<group> group) {
              this.group = group;
       }

       public ArrayList<permission> getPermistion() {
              return permistion;
       }

       public void setPermistion(ArrayList<permission> permistion) {
              this.permistion = permistion;
       }

       public String getImg() {
              return img;
       }

       public void setImg(String img) {
              this.img = img;
       }

       public ArrayList<feedback> getFeedback() {
              return feedback;
       }

       public void setFeedback(ArrayList<feedback> feedback) {
              this.feedback = feedback;
       }

       public favorite getFavorite() {
              return favorite;
       }

       public void setFavorite(favorite favorite) {
              this.favorite = favorite;
       }

       public int getUser_id() {
              return user_id;
       }

       public void setUser_id(int user_id) {
              this.user_id = user_id;
       }

       public String getUser_name() {
              return user_name;
       }

       public void setUser_name(String user_name) {
              this.user_name = user_name;
       }

       public String getPassword() {
              return password;
       }

       public void setPassword(String password) {
              this.password = password;
       }

       public String getDisplay_name() {
              return display_name;
       }

       public void setDisplay_name(String display_name) {
              this.display_name = display_name;
       }

       public String getPhone() {
              return phone;
       }

       public void setPhone(String phone) {
              this.phone = phone;
       }

       public String getEmail() {
              return email;
       }

       public void setEmail(String email) {
              this.email = email;
       }

}
