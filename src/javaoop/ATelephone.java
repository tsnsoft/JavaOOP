package javaoop;

public abstract class ATelephone implements ITelephone {

    @Override
    public boolean sendSMS(String number, String sms) {
        System.out.println("Отправили смс \"" + sms + "\" по номеру " + number);
        return true;
    }

    @Override
    public void call(String number) {
        System.out.println("Звоним по номеру: " + number);
    }

    public abstract void takePhoto();

}
