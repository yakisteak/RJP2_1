package yakisizimi.calc;

public class KokuhoResult{
	private long iryou;
	private long shien;
	private long kaigo;
	public void setIryou(long l) {
		iryou = l;
	}
	public void setShien(long l) {
		shien = l;
	}
	public void setKaigo(long l) {
		kaigo = l;
	}
	public long getIryou() {
		return iryou;
	}
	public long getShien() {
		return shien;
	}
	public long getKaigo() {
		return kaigo;
	}
	public long getTotal() {
		return iryou+shien+kaigo;
	}
}