abstract class XeMay {
     public abstract void brake();

     public void Action() {
         System.out.println("Hay phanh xe!");
     }
}

class XeMayTheThao extends XeMay {
    public void brake() {
        System.out.println("Da phanh xe");
        }
}

class XeMayLeoNui extends XeMay {
public void brake() {
        System.out.println("Da phanh xe");
    }
}

class Main {
    public static void main(String[] args) {
        XeMayTheThao xe1 = new XeMayTheThao();
        xe1.Action();
        xe1.brake();

        XeMayLeoNui xe2 = new XeMayLeoNui();
        xe2.Action();
        xe2.brake();
    }
}


