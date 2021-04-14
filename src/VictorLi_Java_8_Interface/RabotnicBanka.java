package VictorLi_Java_8_Interface;

public class RabotnicBanka  extends  Chelovek{
    @Override
    public void AllInformation() {
        System.out.println("Для работника банка :  имя = + "+ name+
                "\n" + "фамилия = + " +surname+ "\n"+
                "название банка = " +  BankName);
    }
    private String BankName;
    public  RabotnicBanka(String name, String surname, String Bank){
        super(name,surname);
        this.BankName=Bank;
    }
}
