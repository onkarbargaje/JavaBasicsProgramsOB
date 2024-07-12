package OOP_Interface;

public class JupitarHospital implements USMedical, UKMedical, IndiaMedical{

	
	
     //US
	@Override
	public void physioService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardioioService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalService() {
		// TODO Auto-generated method stub
		
	}

	
	//UK
	@Override
	public void neuroService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ENTService() {
		// TODO Auto-generated method stub
		
	}
  
	//India 
	@Override
	public void oncologyService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orthoService() {
		// TODO Auto-generated method stub
		
	}

	//common method
	@Override
	public void emergencyService() {
		// TODO Auto-generated method stub
		
	}
	
	//individual
	public void medicalTrainingService()
	{
		
	}
	
	public void medicalClaimService()
	{
		
	}

	//WHO
	@Override
	public void covidRegulation() {
		// TODO Auto-generated method stub
		
	}

}
