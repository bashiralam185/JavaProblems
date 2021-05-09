public class TestCylinder {
    public static void main(String[] args){
        Cylider cylinder1= new Cylider();
        Cylider cylider2 = new Cylider(1.4);
        Cylider cylinder3= new Cylider(2.5, 2.6);
        Cylider cylinder4= new Cylider(2,"red" ,2);


        System.out.println(cylinder1.getVolume());
        System.out.println(cylider2.getVolume());
        System.out.println(cylinder3.getVolume());
        System.out.println(cylinder4.getVolume());
    }
}
