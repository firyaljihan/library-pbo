/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import java.util.ArrayList;
/**
 *
 * @author FAM COMPUTINDO
 */
public class siswa {
    private ArrayList<String>namaSiswa = new ArrayList<String>();
    private ArrayList<String>alamat = new ArrayList<String>();
    private ArrayList<String>telepon = new ArrayList<String>();
    private ArrayList<Boolean>status = new ArrayList<Boolean>();
    //berfungsi
    public siswa(){
        this.namaSiswa.add("Jihan");
        this.alamat.add("Jl.Danau Ranau IV");
        this.telepon.add("085903121725");
        this.status.add(true);
//indeks ke-1
      this.namaSiswa.add("Putri");
      this.alamat.add("Jl.Danau Tambingan");
      this.telepon.add("083125679572");
      this.status.add(true);
    }
}
