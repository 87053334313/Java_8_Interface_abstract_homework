package VictorLi_Java_8_Interface;

public class Main {

    public static void main(String[] args) {
	Client cl1 = new Client("Vitya","Li","Sberbank");
	cl1.setAge(18);
	cl1.AllInformation();
	RabotnicBanka rb_1 = new RabotnicBanka("Aleksander","Alekseevich","ALFA");
	rb_1.AllInformation();
    }
}
