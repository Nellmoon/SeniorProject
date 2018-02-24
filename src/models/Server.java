/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Luis
 */
public class Server {
    private String name;
    private String address;
    private String username;

    public Server(String name, String address, String username) {
        this.name = name;
        this.address = address;
        this.username = username;
    }

    public Server(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public boolean testConnection(char[] password){
        // TO BE FILLED
        // ...
        return true;
    }     
}
