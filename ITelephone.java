public interface ITelephone {
    //INTERFACE exists to define the methods that must be implemented
    //so PRIVATE or PUBLIC is useless
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
