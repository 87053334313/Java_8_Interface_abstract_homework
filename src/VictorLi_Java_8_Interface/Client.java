package VictorLi_Java_8_Interface;

public class Client extends Chelovek  implements  Interface,Iage{
    public void setAge(int val){
        age=val;
    }
    protected  int age;
    @Override public void AllInformation(){
        System.out.println("Информация по клиену: \n"+"name = "+name+"\n"+
                "surname = " +surname + "\t"+"BANK="+bankName + "\t" + "AGE="+age);
    }
    protected  String bankName;
    public Client (String name, String surname, String bankName ){
        super(name,surname);
        this.bankName=bankName;
    }

}
