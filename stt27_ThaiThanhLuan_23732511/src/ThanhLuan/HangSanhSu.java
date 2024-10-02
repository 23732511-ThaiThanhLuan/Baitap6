package ThanhLuan;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu(String maHang) {
		super(maHang);
		this.nhaSanXuat="";
		this.ngayNhapKho= LocalDate.now()
	} 

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTienVAT() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		return null;
	}

}
