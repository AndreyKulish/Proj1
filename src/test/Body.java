package test;

/**
 * Created by Andrey on 17.03.2017.
 */
abstract class Body implements leftHandClass,tailClass,rightHandClass{
    public void leftHand(){
        System.out.println("левая нога Версия №1");
    }
    public void tail(){
        System.out.println("хвост Версия №1");
    }
    public void rightHand(){
        System.out.println("правая нога Версия №1");
    }
    abstract void name();
}
