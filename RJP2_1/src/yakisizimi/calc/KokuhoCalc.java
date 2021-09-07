package yakisizimi.calc;

public class KokuhoCalc {
	public final static long MAX_IRYOU=630000;
	public final static long MAX_SHIEN=190000;
	public final static long MAX_KAIGO=170000;
	public static KokuhoResult calcKokuho(long last_sal,int old) {
		
		KokuhoResult ret = new KokuhoResult();
		int kisokojo;// 基礎控除額が決まる
		if(last_sal <= 24000000) {
			kisokojo = 430000;
		}else if(last_sal <= 24500000) {
			kisokojo = 290000;
		}else if (last_sal <= 25000000) {
			kisokojo = 150000;
		}else {
			kisokojo = 0;
		}
		long fixTunedIncome = last_sal - kisokojo;
		
		ret.setIryou((long) (((fixTunedIncome*0.0767)+42000)>MAX_IRYOU?MAX_IRYOU:(fixTunedIncome*0.0767)+42000));
		ret.setShien((long) (((fixTunedIncome*0.0243)+13500)>MAX_SHIEN?MAX_SHIEN:(fixTunedIncome*0.0243)+13500));
		ret.setKaigo((long) (((fixTunedIncome*0.0243)+17400)>MAX_KAIGO?MAX_KAIGO:(fixTunedIncome*0.0243)+17400));
		return ret;
	}
}
