public class Person {
    private String nama;
    private String noHp;
    private String alamat;

    public Person(String nama, String noHp, String alamat){
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getnoHp(){
        return noHp;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNama(String nama){
        if(nama != null && !nama.trim().isEmpty()){
            this.nama = nama;
        }else{
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    public void setNoHp(String noHp){
        if(noHp != null && !noHp.trim().isEmpty()){
            this.noHp = noHp;
        }else{
            System.out.println("Nomor HP tidak boleh kosong!");
        }
    }

    public void setAlamat(String alamat){
        if(alamat != null && !alamat.trim().isEmpty()){
            this.alamat = alamat;
        }else{
            System.out.println("Alamat tidak boleh kosong");
        }
    }

    public void tampilkanIdentitas(){
        System.out.println("Nama        :" + nama);
        System.out.println("Nomor Hp    :" + noHp);
        System.out.println("Alamat      :" + alamat);
    }
}
