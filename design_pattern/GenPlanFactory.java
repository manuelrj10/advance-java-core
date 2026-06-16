package design_pattern;

public class GenPlanFactory {
	public Plan getPlan(String gplan) {

		if (gplan.equals("null")) {
			return null;
		}
		if (gplan.equalsIgnoreCase("domesticplan")) {
			return new DomesticPlan();
		} else if (gplan.equalsIgnoreCase("institutionalplan")) {
			return new InstitutionalPlan();
		} else if (gplan.equalsIgnoreCase("CommerialPlan")) {
			return new CommerialPlan();
		} else {
			return null;
		}
	}

}
