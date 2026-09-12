import java.util.ArrayList;
import java.util.List;

public class Buku {
    private String kodeBuku;
    private String Judul;
    private genreBuku Genre;
    private List<Member> daftarMember;


    public Buku(String kodeBuku, String Judul, genreBuku Genre){
        this.kodeBuku = kodeBuku;
        this.Judul = Judul;
        this.Genre = Genre;
        this.daftarMember = new ArrayList<>();
        Genre.tambahGenreBuku(this);
    }

    public String getkodeBuku(){
        return kodeBuku;
    }

    public String getJudul(){
        return Judul;
    }

    public genreBuku getGenre(){
        return Genre;
    }

    public void tambahMember(Member nm){
        if(!daftarMember.contains(nm)){
            daftarMember.add(nm);
            nm.tambahBuku(this);
        }
    }

    public void tampilkanMember(){
        int i = 1;

        System.out.println("Daftar Member yang Meminjam "+Judul+":");
        for (Member Nama : daftarMember){
            System.out.println(i+". "+ Nama.getIdMember() + " - " + Nama.getNama());
            i = i+1;
        }
    }
}
