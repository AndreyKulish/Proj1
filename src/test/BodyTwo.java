package test;

/**
 * Created by Andrey on 17.03.2017.
 */
abstract class BodyTwo implements leftHandClass,tailClass,rightHandClass{
    public void leftHand(){
        System.out.println("левая нога Версия №2");
    }
    public void tail(){
        System.out.println("хвост Версия №2");
    }
    public void rightHand(){
        System.out.println("правая нога Версия №2");
    }
    abstract void test();
}