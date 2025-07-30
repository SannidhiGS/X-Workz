class BlazzerRunner {
    public static void main(String args[]) {

        Blazzer b1 = new Blazzer(1);
       b1.getBlazzerInfo();

        Blazzer b2 = new Blazzer("livis","M");
      
		b2.getBlazzerInfo();


        Blazzer b3 = new Blazzer("Pink",7999.0);
        b3.getBlazzerInfo();


        Blazzer b4 = new Blazzer(true);
       b4.getBlazzerInfo();


        Blazzer b5 = new Blazzer("Cotton");
        b5.getBlazzerInfo();



    }
}
