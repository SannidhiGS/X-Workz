class CourtCase {
    String caseId;
    String caseType; 
    String courtName;
    String petitionerPlaintiff;
    String respondentDefendant;
    String currentStatus; 
    String presidingJudge; 
	
	public void getCourtInfo(){
		System.out.println("Case ID: " + caseId);
        System.out.println("Case Type: " + caseType);
        System.out.println("Court Name: " + courtName);
        System.out.println("Petitioner/Plaintiff: " + petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + respondentDefendant);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("Presiding Judge: " + presidingJudge);
        System.out.println();

	}
}