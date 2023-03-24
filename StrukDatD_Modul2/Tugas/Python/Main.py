hewan = ["Sapi", "Kelinci", "Kambing", "Unta", "Domba"]
deleteHewan = ["Kelinci", "Kambing", "Unta"]

print("Hewan : ", hewan)
print("Hewan yang dihapus : ", deleteHewan)

for warna in deleteHewan:
    i = 0
    while i < len(hewan):
        if hewan[i] == warna:
            hewan.pop(i)
        else:
            i += 1

print("Output hewan : ", hewan)