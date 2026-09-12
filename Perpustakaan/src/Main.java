// Kelompok 4 - PBO
// Adrian Hermawan - J0403251044
// Diaz Ramaananta Harahap - J0403251048
// Firly Ramadhani Tubagus - J0403251115
// Mohammad Azmi Zaelani - J0403251020
// Midori Harahap - J0403251018

public class Main {
    public static void main(String[] args) {
        //add genre buku
        genreBuku novel = new genreBuku("G01", "Novel");
        genreBuku pendidikan = new genreBuku("G02", "Pendidikan");

        //add buku
        Buku buku1 = new Buku("B01", "Laskar Pelangi", novel);
        Buku buku2 = new Buku("B02", "Bumi", novel);
        Buku buku3 = new Buku("B03", "Matematika", pendidikan);

        //add member
        Member member1 = new Member("MO1", "Asep", "081234567890", "Jl Malabar, Bogor");
        Member member2 = new Member("M02", "Budi", "081234567891", "Jl Lodaya I, Bogor");

        //add petugas
        Petugas petugas1 = new Petugas("PGS01", "Syahnan", "081234567892", "Jl Pancoran, Bogor", "2");
        Petugas petugas2 = new Petugas("PGS02", "Liam", "081234567893", "Jl Lodaya I, Bogor", "1");

        // menampilkan daftar buku
        System.out.println("========================================");
        System.out.println("           DAFTAR BUKU");
        System.out.println("========================================");
        System.out.println("B01 - " + buku1.getJudul() + " (" + buku1.getGenre().getnamaGenre() + ")");
        System.out.println("B02 - " + buku2.getJudul() + " (" + buku2.getGenre().getnamaGenre() + ")");
        System.out.println("B03 - " + buku3.getJudul() + " (" + buku3.getGenre().getnamaGenre() + ")");

        // menampilkan daftar petugas
        System.out.println("\n========================================");
        System.out.println("          DAFTAR PETUGAS");
        System.out.println("========================================");

        System.out.println(petugas1.getIdPetugas() + " - " + petugas1.getNama() + " - Shift " + petugas1.getShift());
        System.out.println(petugas2.getIdPetugas() + " - " + petugas2.getNama() + " - Shift " + petugas2.getShift());

        // menampilkan daftar member
        System.out.println("\n========================================");
        System.out.println("           DAFTAR MEMBER");
        System.out.println("========================================");
        System.out.println(member1.getIdMember() + " - " + member1.getNama());
        System.out.println(member2.getIdMember() + " - " + member2.getNama());

        //member meminjambuku buku
        member1.tambahBuku(buku1);
        member1.tambahBuku(buku2);
        member2.tambahBuku(buku3);

        //tampilkan buku yang dipinjam member
        System.out.println("\n========================================");
        System.out.println("        DAFTAR BUKU PINJAMAN");
        System.out.println("========================================");
        member1.tampilkanBuku();
        System.out.println("");
        member2.tampilkanBuku();

        //tampilkan member yang meminjam buku
        System.out.println("\n========================================");
        System.out.println("       MEMBER YANG MEMINJAM BUKU");
        System.out.println("========================================");
        buku1.tampilkanMember();
        System.out.println("");
        buku2.tampilkanMember();
        System.out.println("");
        buku3.tampilkanMember();
    }
}
