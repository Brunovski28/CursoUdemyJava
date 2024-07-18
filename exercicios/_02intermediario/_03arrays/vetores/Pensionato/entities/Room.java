package exercicios._02intermediario._03arrays.vetores.Pensionato.entities;

public class Room {

    private String name;
    private String mail;
    private int numberRoom;

    public Room(String name, String mail, int numberRoom) {
        this.name = name;
        this.mail = mail;
        this.numberRoom = numberRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String toString(){
        return "Nome: " + this.name +
             "\nE-mail: " + this.mail +
             "\nQuarto: " + this.numberRoom;
    }

}
