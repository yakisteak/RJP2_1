package yakisizimi.calc;

public class NenkinCalc {
	public long[][] table = {{93000,8052},{101000,8967},{107000,9516},{114000,10065},{122000,10797},{130000,11529},{138000,12261},{146000,12993},{155000,13725},//1等級～10等級
			{165000,14640},{175000,15555},{185000,16470},{195000,17385},{210000,18300},{230000,20130},{250000,21960},{270000,23790},{290000,25620},{310000,27450},//11等級～20等級
			{330000,29280},{350000,31110},{370000,32940},{395000,34770},{425000,37515},{455000,40260},{485000,43005},{515000,45750},{545000,48495},{575000,51240},{605000,53985},{635000,56730}//21等級～32等級
			
	};
	public static final long MAX_KOUSEI_PAY = 59475;
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
			int i=0;
			try {
			for(; income>table[i][0];i++) {}
			return table[i][1];
			}
			catch (Exception e){
			return MAX_KOUSEI_PAY;
			}
		}
		return 0l;
	}
}
