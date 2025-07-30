public class HairClipRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Hair Clip Data");

        HairClip clip1 = new HairClip("Fancy Butterfly Clip");
        clip1.getClipInfo();

        HairClip clip2 = new HairClip("Alligator Clip", "Goody");
        clip2.getClipInfo();

        HairClip clip3 = new HairClip(150.00, 6);
        clip3.getClipInfo();

        HairClip clip4 = new HairClip("Plastic", true, "Mumbai");
        clip4.getClipInfo();

        System.out.println("Main Ended - Hair Clip Data");
    }
}
