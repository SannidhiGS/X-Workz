
class CourtCaseRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Court Case Information Display");

        
        CourtCase case1 = new CourtCase();
        case1.caseId = "OS/123/2023"; 
        case1.caseType = "Civil - Property Dispute";
        case1.courtName = "City Civil and Sessions Court, Bengaluru";
        case1.petitionerPlaintiff = "Mr. Raghavendra Rao";
        case1.respondentDefendant = "Mrs. Lakshmi Devi";
        case1.currentStatus = "Arguments in progress";
        case1.presidingJudge = "Hon'ble Judge Shri. K. S. Murthy";

        case1.getCourtInfo();

        // Case 2: Divorce Petition (Family)
        CourtCase case2 = new CourtCase();
        case2.caseId = "MCD/45/2024"; // Matrimonial Case (Divorce)
        case2.caseType = "Family - Divorce";
        case2.courtName = "Family Court, Bengaluru";
        case2.petitionerPlaintiff = "Mrs. Anjali Sharma";
        case2.respondentDefendant = "Mr. Vikram Sharma";
        case2.currentStatus = "Mediation recommended, awaiting report";
        case2.presidingJudge = "Hon'ble Judge Smt. P. L. Gowda";

        case2.getCourtInfo();

        // Case 3: Criminal Case (Theft)
        CourtCase case3 = new CourtCase();
        case3.caseId = "CC/789/2022"; // Criminal Case
        case3.caseType = "Criminal - Theft";
        case3.courtName = "Magistrate Court, Bengaluru North";
        case3.petitionerPlaintiff = "State of Karnataka";
        case3.respondentDefendant = "Mr. Ravi Kumar";
        case3.currentStatus = "Cross-examination of prosecution witness";
        case3.presidingJudge = "Chief Judicial Magistrate Smt. D. N. Reddy";

        case3.getCourtInfo();

        
        CourtCase case4 = new CourtCase();
        case4.caseId = "WP(PIL)/50/2024"; 
        case4.caseType = "PIL - Environmental Protection";
        case4.courtName = "High Court of Karnataka, Principal Bench, Bengaluru";
        case4.petitionerPlaintiff = "Citizens for Clean Air Trust";
        case4.respondentDefendant = "State of Karnataka & BBMP";
        case4.currentStatus = "Notices issued, replies awaited";
        case4.presidingJudge = "Hon'ble Chief Justice & Division Bench";

        case4.getCourtInfo();

        // Case 5: Motor Accident Claims Tribunal (MACT)
        CourtCase case5 = new CourtCase();
        case5.caseId = "MACT/15/2023";
        case5.caseType = "MACT - Compensation Claim";
        case5.courtName = "MACT, Mysuru";
        case5.petitionerPlaintiff = "Mr. Suresh K.";
        case5.respondentDefendant = "ABC Insurance Co. & Mr. Anil Reddy";
        case5.currentStatus = "Evidence led by claimant";
        case5.presidingJudge = "Member, MACT";

        case5.getCourtInfo();

        // Case 6: Consumer Dispute
        CourtCase case6 = new CourtCase();
        case6.caseId = "CC/210/2023";
        case6.caseType = "Consumer - Service Deficiency";
        case6.courtName = "District Consumer Disputes Redressal Commission, Bengaluru Urban";
        case6.petitionerPlaintiff = "Mrs. Geetha Rao";
        case6.respondentDefendant = "XYZ Electronics";
        case6.currentStatus = "Disposed - Order for compensation issued";
        case6.presidingJudge = "President & Members";

        case6.getCourtInfo();

        // Case 7: Land Acquisition Reference
        CourtCase case7 = new CourtCase();
        case7.caseId = "LAR/33/2022";
        case7.caseType = "Civil - Land Acquisition";
        case7.courtName = "Senior Civil Judge Court, Doddaballapur";
        case7.petitionerPlaintiff = "Mr. Shivaprakash B.";
        case7.respondentDefendant = "Special Land Acquisition Officer";
        case7.currentStatus = "Valuation report submitted";
        case7.presidingJudge = "Senior Civil Judge Smt. A. M. Prasad";

        case7.getCourtInfo();
        // Case 8: Writ Petition (Service Matter)
        CourtCase case8 = new CourtCase();
        case8.caseId = "WP/112/2024";
        case8.caseType = "Writ - Service Matter";
        case8.courtName = "High Court of Karnataka, Kalaburagi Bench";
        case8.petitionerPlaintiff = "Mr. Raghavendra Prasad";
        case8.respondentDefendant = "Karnataka Power Transmission Corporation Ltd.";
        case8.currentStatus = "Reply statement filed by respondent";
        case8.presidingJudge = "Hon'ble Justice Shri. B. S. Patil";

        case8.getCourtInfo();

        // Case 9: Criminal Appeal
        CourtCase case9 = new CourtCase();
        case9.caseId = "CRL.A./40/2023"; // Criminal Appeal
        case9.caseType = "Criminal - Appeal against Conviction";
        case9.courtName = "Sessions Court, Mangaluru";
        case9.petitionerPlaintiff = "Mr. Deepak Rai (Appellant)";
        case9.respondentDefendant = "State of Karnataka";
        case9.currentStatus = "Arguments scheduled";
        case9.presidingJudge = "Hon'ble Principal Sessions Judge";

        case9.getCourtInfo();

        // Case 10: Commercial Dispute
        CourtCase case10 = new CourtCase();
        case10.caseId = "COMM.OS/5/2024";
        case10.caseType = "Commercial - Contract Breach";
        case10.courtName = "Commercial Court, Bengaluru";
        case10.petitionerPlaintiff = "Tech Solutions Pvt Ltd";
        case10.respondentDefendant = "Global Enterprises";
        case10.currentStatus = "Document discovery in progress";
        case10.presidingJudge = "Hon'ble Commercial Court Judge";

        case10.getCourtInfo();

        // Case 11: Bail Application
        CourtCase case11 = new CourtCase();
        case11.caseId = "CRL.P./99/2025";
        case11.caseType = "Criminal - Bail Application";
        case11.courtName = "High Court of Karnataka, Dharwad Bench";
        case11.petitionerPlaintiff = "Mr. Kiran Gowda";
        case11.respondentDefendant = "State by Police Inspector, Hubballi";
        case11.currentStatus = "Arguments partially heard";
        case11.presidingJudge = "Hon'ble Justice Shri. S. G. Hegde";

        case11.getCourtInfo();

        // Case 12: Consumer Appeal
        CourtCase case12 = new CourtCase();
        case12.caseId = "FA/7/2025"; // First Appeal
        case12.caseType = "Consumer - Appeal against District Forum Order";
        case12.courtName = "Karnataka State Consumer Disputes Redressal Commission";
        case12.petitionerPlaintiff = "XYZ Telecom (Appellant)";
        case12.respondentDefendant = "Mr. Nagesh Bhat";
        case12.currentStatus = "Written arguments filed";
        case12.presidingJudge = "President & Members";

        case12.getCourtInfo();

        // Case 13: Labour Dispute
        CourtCase case13 = new CourtCase();
        case13.caseId = "ID/5/2024"; // Industrial Dispute
        case13.caseType = "Labour - Unfair Termination";
        case13.courtName = "Labour Court, Bengaluru";
        case13.petitionerPlaintiff = "Mr. Govindappa (Workman)";
        case13.respondentDefendant = "Garment Factory Ltd.";
        case13.currentStatus = "Conciliation failed, matter referred for adjudication";
        case13.presidingJudge = "Presiding Officer, Labour Court";

        case13.getCourtInfo();

        // Case 14: Contempt of Court
        CourtCase case14 = new CourtCase();
        case14.caseId = "CCC/20/2025"; // Contempt of Court Case
        case14.caseType = "Contempt - Non-compliance of Order";
        case14.courtName = "High Court of Karnataka, Bengaluru Bench";
        case14.petitionerPlaintiff = "High Court (Suo Motu)";
        case14.respondentDefendant = "District Commissioner, Mandya";
        case14.currentStatus = "Explanation submitted, awaiting review";
        case14.presidingJudge = "Hon'ble Division Bench";

        case14.getCourtInfo();

        // Case 15: Election Petition
        CourtCase case15 = new CourtCase();
        case15.caseId = "EP/1/2024";
        case15.caseType = "Election Petition - Disputed Election Result";
        case15.courtName = "High Court of Karnataka, Bengaluru Bench";
        case15.petitionerPlaintiff = "Mr. Chandrappa (Candidate)";
        case15.respondentDefendant = "Mr. Venkatesh & Election Commission of India";
        case15.currentStatus = "Witness examination ongoing";
        case15.presidingJudge = "Hon'ble Justice Shri. S. V. Narayan";

        case15.getCourtInfo();

        System.out.println("Main Ended - Court Case Information Display Complete");
    }
}