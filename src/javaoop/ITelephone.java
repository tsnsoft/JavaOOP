package javaoop;

public interface ITelephone {
    boolean sendSMS(String number, String sms);
    void call(String number);
}
