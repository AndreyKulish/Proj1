package test;

public class Main{

    public static void main(String[] args) {
        Object
        leftHandClass s;
        rightHandClass s1;
        tailClass s2;
        for (int b = 0; b < 2; b++){
            for (int i = 0; i < 3 ;i++){
                if(b == 0) {
                    s = new TeloOne();
                    s.leftHand();
                    s1 = new TeloOne();
                    s1.rightHand();
                    s2 = new TeloOne();
                    s2.tail();
                    TeloOne n = new TeloOne();
                    n.name();
                    n.leftHand();
                }else{
                    s = new TeloTwo();
                    s.leftHand();
                    s1 = new TeloTwo();
                    s1.rightHand();
                    s2 = new TeloTwo();
                    s2.tail();
                }
            }
        }
    }

}
