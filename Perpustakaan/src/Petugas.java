public class Petugas extends Person {
    private String idPetugas;
    private String shift;

    public Petugas(String idPetugas, String nama, String noHp, String alamat, String shift){
        super(nama, noHp, alamat);

        this.idPetugas = idPetugas;
        this.shift = shift;
    }

    public String getIdPetugas(){
        return idPetugas;
    }

    public String getShift(){
        return shift;
    }
}
