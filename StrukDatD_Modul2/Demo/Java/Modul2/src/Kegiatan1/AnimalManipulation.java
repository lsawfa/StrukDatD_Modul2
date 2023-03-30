/**
 * @author Larynt Sawfa Kenanga
 */
package Kegiatan1;

import java.util.ArrayList;

public class AnimalManipulation {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Buat object kosong bertipe data String [Soal no 1]
        ArrayList<String> animalList = new ArrayList<String>();
        //Isi arraylist of String dengan nama-nama hewan sesuai ketentuan [Soal no 1]
        animalList.add("Angsa");
        animalList.add("Bebek");
        animalList.add("Cicak");
        animalList.add("Domba");
        animalList.add("Elang");
        animalList.add("Gajah");

        System.out.println("\nSTEP 2");
        //Menambahkan elemen Badak dan Bebek [Soal no 2]
        animalList.add("Badak");
        animalList.add("Bebek");
        //Hitung jumlah elemen bebek [Soal no 2]
        int countBebek = 0;
        for(String animal : animalList){
            if(animal.equals("Bebek")){
                countBebek++;
            }
        }
        printAnimals(animalList);
        System.out.println("Bebek = "+countBebek);
        //Tampilkan posisi Bebek di index mana saja [Soal no 2]
        System.out.print("Posisi index = ");
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).equals("Bebek")){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n\nSTEP 3");
        //Hapus posisi index yang pertama [Soal no 3]
        animalList.remove("Bebek");
        printAnimals(animalList);

        System.out.println("\nSTEP 4");
        //Tampilkan elemen pada index ke-0 dan ke-2 [Soal no 4]
        System.out.println("Index ke-0 : "+animalList.get(0));
        System.out.println("Index ke-2 : "+animalList.get(2));
        //Hapus index ke-0 [Soal no 4]
        animalList.remove(0);
        printAnimals(animalList);

        System.out.println("\nSTEP 5");
        //Ubahlah index ke-0 dari “Cicak” Menjadi “Ular”, selanjutnya tambahkan elemen baru pada index ke-2 dengan “Itik” [Soal no 5]
        animalList.set(0,"Ular");
        printAnimals(animalList);
        animalList.add(2,"Itik");
        printAnimals(animalList);

        System.out.println("\nSTEP 6");
        //Hapus elemen diantara index ke-1 dan ke-5 [Soal no 6]
        animalList.subList(2,5).clear();
        printAnimals(animalList);

        System.out.println("\nSTEP 7");
        //Tampilkan elemen pertama dan terakhir [Soal no 7]
        System.out.println("Elemen Pertama : "+animalList.get(0));
        System.out.println("Elemen Terakhir : "+animalList.get(animalList.size()-1));

        System.out.println("\nSTEP 8");
        //Tampilkan jumlah elemen pada ArrayList [Soal no 8]
        System.out.println("Jumlah Elemen : " + animalList.size());

        System.out.println("\nSTEP 9");
        //Carilah posisi index dari Badak [Soal no 9]
        System.out.println("Badak ada pada index: "+animalList.indexOf("Badak"));
    }

    /**
     * @param animalList
     */
    private static void printAnimals(ArrayList<String> animalList) {
        System.out.println(animalList);
    }
}