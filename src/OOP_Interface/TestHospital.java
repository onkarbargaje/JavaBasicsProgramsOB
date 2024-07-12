package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) 
	{
		JupitarHospital jh= new JupitarHospital();
		jh.cardioioService();
		jh.dentalService();
		jh.emergencyService();
		jh.ENTService();
		jh.medicalClaimService();
		
		USMedical us= new JupitarHospital();
		us.cardioioService();
	}

}
