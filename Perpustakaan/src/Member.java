import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private String idMember;
    private List<Buku> daftarBuku;

    public Member(String idMember, String nama, String noHp, String alamat){
        super(nama, noHp, alamat);

        this.idMember = idMember;
        this.daftarBuku = new ArrayList<>();
    }

    public String getIdMember(){
        return idMember;
    }

    public void tambahBuku(Buku Judul){
        if(!daftarBuku.contains(Judul)){
            daftarBuku.add(Judul);
            Judul.tambahMember(this);
        }
    }

    public void tampilkanBuku(){
        int i = 1;

        System.out.println("Daftar Buku yang Dipinjam " + getNama() + ":");
        for (Buku Judul : daftarBuku){
            System.out.println(i + ". " + Judul.getkodeBuku() + " - " + Judul.getJudul());
            i = i+1;
        }
    }
}