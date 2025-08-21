class Agents{
	static String docType;
	static boolean status;
    public static void asi(String name,String agency) {
        System.out.println("Agent Name: " + name);
        System.out.println("Agency: " + agency);
        Verification.verifyDocuments("ID Proof", true);
    }
}
