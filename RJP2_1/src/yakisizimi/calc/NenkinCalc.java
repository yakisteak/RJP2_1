package yakisizimi.calc;

public class NenkinCalc {
	public long[][] table = {{93000},{}};
	private long income;
	private String type;
	public static final long KOKUMIN_NENKIN=16610;
	public long getIncome() {
		return income;
	}
	public String getType() {
		return type;
	}
	public void setIncome(long l) {
		income = l;
	}
	public void setType(String s) {
		type = s;
	}
	public long calcNenkin() {
		if(type.equals("kokumin")) {
			return KOKUMIN_NENKIN;
		}else if(type.equals("kousei")) {
			return (long)(income *0.183);
		}
		return 0l;
	}
}
