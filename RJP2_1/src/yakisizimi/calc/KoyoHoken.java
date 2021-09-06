package yakisizimi.calc;

public class KoyoHoken {
	
	String gyomuType;
	long income;
	public static final long KOYOHOKEN_IPPAN = 3;
	public static final long KOYOHOKEN_NRSSS = 4;
	public static final long KOYOHOKEN_CONST = 4;
	
	public void setGyomuType(String s){
		gyomuType = s;
	}
	public void setIncome(long l) {
		income = l;
	}
	public long calcInsuranse(){
		long temp;
		temp = 0;
		switch(gyomuType) {
		case "const":
			temp = KOYOHOKEN_CONST;
			break;
		case "nrsss":
			temp = KOYOHOKEN_NRSSS;
			break;
		case "ippan":
			temp = KOYOHOKEN_IPPAN;
			break;
		}
		return Math.floorMod(income, temp)/100;
	}
}
