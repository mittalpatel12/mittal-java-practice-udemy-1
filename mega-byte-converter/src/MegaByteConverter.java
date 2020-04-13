public class MegaByteConverter {

    public static void printMegaBytesAndKiloBytes(int KiloBytes)
    {
        if(KiloBytes < 0)
        {
            return;
        }
        int KiloByteFromKB = KiloBytes % 1024;
        int megaByteFromKB = KiloBytes / 1024;
        System.out.println(+ megaByteFromKB + " MB " + KiloByteFromKB + " KB ");
    }
}
