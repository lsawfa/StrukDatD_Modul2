/**
 * @author Larynt Sawfa Kenanga
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        ArrayList<String> deleteHewan = new ArrayList<String>();

        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("Hewan : "+hewan);
        System.out.println("Hewan yang dihapus : "+deleteHewan);

        for (String warna: deleteHewan){
            for (int i=0; i<hewan.size(); i++){
                if(hewan.get(i).equals(warna)){
                    hewan.remove(i);
                }
            }
        }

        System.out.println("Output hewan : "+hewan);
    }
}
