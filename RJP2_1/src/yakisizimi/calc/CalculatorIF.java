package yakisizimi.calc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorIF extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		String name;
		String sal,saltype,olds,nenkintype,bonus1_a,bonus2_a,bonus1,bonus2,jobtype,lyearincome,hoken_type,hoken_other;
		
		KokuhoResult kokuhor = new KokuhoResult();
		
		name = req.getParameter("name");
		sal = req.getParameter("sal");
		saltype = req.getParameter("sal_type");
		olds = req.getParameter("old");
		nenkintype = req.getParameter("nenkin_type");
		bonus1_a = req.getParameter("bonus1a");
		bonus2_a = req.getParameter("bonus2a");
		bonus1 = req.getParameter("bonus1");
		bonus2 = req.getParameter("bonus2");
		jobtype = req.getParameter("job_type");
		lyearincome = req.getParameter("lyear_income");
		hoken_type = req.getParameter("hoken_type");
		hoken_other =req.getParameter("hoken_kin");
		
		long saltemp;
		long year_sal;
		long month_sal = 0;
		saltemp = Long.parseLong(sal);
		if(saltype.equals("month")){
			month_sal = saltemp;
			year_sal = month_sal*12;
		}
		else  if(saltype.equals("year")) {
			month_sal = saltemp/12;
			year_sal = saltemp;
		}else {
			
		}
		int old = Integer.parseInt(olds);
		long other_insure = 0;
		
		if(hoken_type.equals("kokumin"))
		kokuhor = KokuhoCalc.calcKokuho(Long.parseLong(lyearincome),old);
		else
		other_insure = Long.parseLong(hoken_other);
		
		NenkinCalc nenkinc = new NenkinCalc();
		nenkinc.setType(nenkintype);
		nenkinc.setIncome(Long.parseLong(lyearincome));
		long nenkin = nenkinc.calcNenkin();
		KoyoHoken kyh = new KoyoHoken();
		kyh.setGyomuType(jobtype);
		kyh.setIncome(month_sal);
		long kyhinspay =kyh.calcInsuranse();
		long totalpay = kokuhor.getTotal() + other_insure + nenkin+ kyhinspay;
		long juminzei = 4000;
		
		
		
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
