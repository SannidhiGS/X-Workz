class CourtCase {
    String caseId;
    String caseType; // e.g., "Civil", "Criminal", "Family", "PIL"
    String courtName; // e.g., "High Court of Karnataka, Bengaluru Bench", "City Civil and Sessions Court, Bengaluru"
    String petitionerPlaintiff;
    String respondentDefendant;
    LocalDate filingDate;
    LocalDate lastHearingDate;
    LocalDate nextHearingDate;
    String currentStatus; // e.g., "Hearing Adjourned", "Arguments Concluded", "Judgment Reserved", "Disposed"
    String presidingJudge; // Optional, but useful
}