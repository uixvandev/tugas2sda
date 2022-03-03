import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
       
        //karakter nama "IRFAN WAHENDRA"
        saya.add("I");
        saya.add("R");
        saya.add("F");
        saya.add("A");
        saya.add("N");
        saya.add("");
        saya.add("W");
        saya.add("A");
        saya.add("H");
        saya.add("E");
        saya.add("N");
        saya.add("D");
        saya.add("R");
        saya.add("A");
        System.out.println("=====================================");
        System.out.println(saya);
        System.out.println("\n");

        saya.add("B");
        saya.add("O");
        saya.add("Y");
        System.out.println("List sebelum di tambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi menyisipkan karakter
        saya.set(0,"C");
        saya.set(5,"O");
        saya.set(2,"O");
        saya.set(10,"L");
        System.out.println("List setelah ditambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi Remove
        saya.remove(5);
        saya.remove(3);
        saya.remove(7);
        saya.remove(3);
        saya.remove(2);
        saya.remove(8);
        saya.remove(1);
        saya.remove(4);
        System.out.println("List setalah di remove: " + saya);
        System.out.println(" \n");

        //Fungsi push
        saya.push("GANTENG");
        saya.push("BAIK");
        saya.push("RAJIN");
        System.out.println("Setelah elemen p " + saya);
        System.out.println("\n");

        //Fungsi POP
        saya.pop();
        System.out.println("setelah pop: " + saya);
        //System.out.println(saya.pop());

    }
}
