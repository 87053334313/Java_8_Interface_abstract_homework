package VictorLi_Java_8_Interface;

abstract public class Chelovek   {
protected  String name;
protected String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    abstract public void AllInformation();


    public Chelovek(String Name, String surname){
        name=Name;
        this.surname=surname;
    }
}
