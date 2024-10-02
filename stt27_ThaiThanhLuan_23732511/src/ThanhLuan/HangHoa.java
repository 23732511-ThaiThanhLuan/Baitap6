package ThanhLuan;

import java.text.DecimalFormat;

public abstract class HangHoa {
	protected final String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	public HangHoa(String maHang) throws Exception {
		this(maHang,"xxx",0.0,0);
		
	}

	

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		if (maHang==null || maHang.trim().length()==0)
			throw new IllegalArgumentException("Mã hàng không được để trống");
		this.maHang = maHang;
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	
	
	public String getTenHang() {
		return tenHang;
	}



	public void setTenHang(String tenHang) throws Exception {
		if (tenHang==null ||tenHang.trim().length()==0)
			throw new Exception("Tên hàng không được để trống");
		this.tenHang = tenHang;
	}
	



	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) throws Exception {
		if(donGia<0) 
			throw new Exception("Đơn giá phải >=0");
		this.donGia = donGia;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) throws Exception {
		if (soLuongTon<0)
			throw new Exception("Số lượng tồn phải >=0");
		this.soLuongTon = soLuongTon;
	}

	public String getMaHang() {
		return maHang;
	}
	public abstract double getTienVAT();
	public abstract String danhGia();
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.#");
		return String.format("%-10s %-20 %-10 %-10 %-10 %-10", maHang,tenHang,df.format(donGia),soLuongTon,df.format(getTienVAT(),danhGia()));
	}



}
