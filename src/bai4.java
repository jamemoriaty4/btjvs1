import java.util.ArrayList;
import java.util.List;

public class bai4 {

    public static void main(String[] args) {

        List<SinhVien> danhSachSinhVien = new ArrayList<>();
        danhSachSinhVien.add(new SinhVien("Nguyễn Văn A", 20, "0904488481", "anv@rikkeiacademy.com"));
        danhSachSinhVien.add(new SinhVien("Nguyễn Văn B", 21, "0904488482", "bnv@rikkeiacademy.com"));
        danhSachSinhVien.add(new SinhVien("Nguyễn Văn C", 18, "0904488483", "cnv@rikkeiacademy.com"));
        danhSachSinhVien.add(new SinhVien("Nguyễn Văn D", 19, "0904488484", "dnv@rikkeiacademy.com"));
        danhSachSinhVien.add(new SinhVien("Nguyễn Văn E", 22, "0904488485", "env@rikkeiacademy.com"));

        System.out.println("                            DANH SACH SINH VIEN                  ");
        System.out.println("| STT | Ho va ten | Tuoi | So dien thoai | Email |");
        System.out.println("|---|---|---|---|---|");
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            SinhVien sinhVien = danhSachSinhVien.get(i);
            System.out.printf("| %2d | %-20s | %2d | %-15s | %-20s |\n", i + 1, sinhVien.getHoVaTen(), sinhVien.getTuoi(), sinhVien.getSoDienThoai(), sinhVien.getEmail());
        }
    }
}

class SinhVien {

    private String hoVaTen;
    private int tuoi;
    private String soDienThoai;
    private String email;

    public SinhVien(String hoVaTen, int tuoi, String soDienThoai, String email) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
