"""
Nama File: AnimalManipulation.py
Deskripsi: Beberapa operasi manipulasi pada arraylist animal

Author: Larynt Sawfa Kenanga
Tanggal dibuat: 29 Maret 2023
"""

class AnimalManipulation:
    #Buat object kosong bertipe data String [Soal no 1]
    animalList = []
    #Isi arraylist of String dengan nama-nama hewan sesuai ketentuan [Soal no 1]
    animalList.append("Angsa")
    animalList.append("Bebek")
    animalList.append("Cicak")
    animalList.append("Domba")
    animalList.append("Elang")
    animalList.append("Gajah")

    print("STEP 2")
    #Menambahkan elemen Badak dan Bebek [Soal no 2]
    animalList.append("Badak")
    animalList.append("Bebek")
    #Hitung jumlah elemen bebek [Soal no 2]
    countBebek = 0
    for animal in animalList:
        if animal == "Bebek":
            countBebek+=1
    print(animalList)
    print("Bebek = ", countBebek)
    #Tampilkan posisi Bebek di index mana saja [Soal no 2]
    print("Posisi index = ", end=" ")
    for i in range(len(animalList)):
        if animalList[i] == "Bebek":
            print(i, end=" ")

    print("\n\nSTEP 3")
    #Hapus posisi index yang pertama [Soal no 3]
    animalList.remove("Bebek")
    print(animalList)

    print("\nSTEP 4")
    #Tampilkan elemen pada index ke-0 dan ke-2 [Soal no 4]
    print("Index ke-0 : ", animalList[0])
    print("Index ke-2 : ",animalList[2])
    #Hapus index ke-0 [Soal no 4]
    del animalList[0]
    print(animalList)

    print("\nSTEP 5")
    #Ubahlah index ke-0 dari “Cicak” Menjadi “Ular”, selanjutnya tambahkan elemen baru pada index ke-2 dengan “Itik” [Soal no 5]
    animalList[0]="Ular"
    print(animalList)
    animalList.insert(2,"Itik")
    print(animalList)

    print("\nSTEP 6")
    #Hapus elemen diantara index ke-1 dan ke-5 [Soal no 6]
    del animalList[2:5]
    print(animalList)

    print("\nSTEP 7")
    #Tampilkan elemen pertama dan terakhir [Soal no 7]
    print("Elemen pertama : ", animalList[0])
    print("Elemen terakhir : ", animalList[-1])

    print("\nSTEP 8")
    #Tampilkan jumlah elemen pada ArrayList [Soal no 8]
    print("Jumlah Elemen : ", len(animalList))

    print("\nSTEP 9")
    #Carilah posisi index dari Badak [Soal no 9]
    print("Posisi Badak : ", animalList.index("Badak"))