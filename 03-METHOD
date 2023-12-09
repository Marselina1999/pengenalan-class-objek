package com.tutorial;


class Mahasiswa {
    //Data Member
    String nama;
    String nim;
    String prodi;

   //kontruktor dengan parameter


    Mahasiswa(String nama, String nim,
    String prodi){
    this.nama =  nama;
    this.nim = nim;
    this.prodi = prodi;
}
// method tanpa parameter dan tanpa return

void show(){
    System.out.println("Nama: " + this.nama);
    System.out.println("NIM: " + this.nim);
    System.out.println("Prodi: " + this.prodi);
}
// method tanpa parameter dan tanpa return dengan parameter
void setNama(String nama){
    this.nama = nama;
}


void Show(){
    System.out.println("Nama: " + this.nama);
    System.out.println("NIM: " + this.nim);
    System.out.println("Prodi: " + this.prodi);
}
// method tanpa return dan parameter
void setnama(String nama){
    this.nama = nama;

}

 // method dengan return tanpa parameter
String getNama(){
    return this.nama;
}

   // method dengan return dan parameter
    String sayhi(String pesan){
        return pesan + "Aku adalah"+ this. nama;
}


public class Main{
public static void main(String[] args) {
        // isntansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("Marselina Bulu","22241019","PTI");

        mhs1.show();
        mhs1.setNama("Marselina Bulu");
        mhs1.show();
        System.out.println(mhs1.getNama());

        String pesan = mhs1.sayhi("Annyonggg");
        System.out.println(pesan);

}
}
}
