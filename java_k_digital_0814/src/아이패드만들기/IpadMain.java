package 아이패드만들기;

public class IpadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IpadPro ipadPro = new IpadPro("iPad Pro");
            if(!ipadPro.coutinueOrder()) break;
            ipadPro.setScreen();
            ipadPro.setColor();
            ipadPro.setMemory();
            ipadPro.setNetwork();
            ipadPro.setName();
            ipadPro.setSerialNum();
            ipadPro.progressPad();
            ipadPro.productPad();
        }
    }
}
