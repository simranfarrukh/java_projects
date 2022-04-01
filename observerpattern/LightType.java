package com.fdmgroup.observer;

public class LightType {

	private boolean greenLightCommercial;

	private boolean greenLightDomestic;

	

	public boolean isGreenLightCommercial() {
		return greenLightCommercial;
	}

	public boolean isGreenLightDomestic() {
		return greenLightDomestic;
	}

	public void setGreenLightCommercial(boolean greenLightCommercial) {
		this.greenLightCommercial = greenLightCommercial;
	}

	public void setGreenLightDomestic(boolean greenLightDomestic) {
		this.greenLightDomestic = greenLightDomestic;
	}

	public LightType( boolean greenLightCommercial,
			boolean greenLightDomestic) {
		super();
		this.greenLightCommercial = greenLightCommercial;
		this.greenLightDomestic = greenLightDomestic;
	}



	@Override
	public String toString() {
		return "LightType [greenLightCommercial=" + greenLightCommercial + ", greenLightDomestic=" + greenLightDomestic
				+ "]";
	}

	

}
