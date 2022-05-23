public class Main {

    public static void main(String[] args) {
        ITelephone TCsPhone;
        TCsPhone = new DeskPhone(123456);
        TCsPhone.powerOn();
        TCsPhone.callPhone(123456);
        TCsPhone.answer();

        TCsPhone = new MobilePhone(654321);
        TCsPhone.powerOn();
        TCsPhone.callPhone(654321);
        TCsPhone.answer();
    }
}
