public class SphereVolume {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sunDiameter = 865000;
        double earthDiameter =7600;
        
        double sunR = sunDiameter / 2;
        double earthR = earthDiameter /2;
        
        // volume = 4.0/3 * PI * r^3
        double volEarth = 4.0/3 * PI * Math.pow(earthR,3);
        double volSun = 4.0/3 * PI * Math.pow(sunR,3);
        double ratio = volSun / volEarth;
        
        System.out.println("Earth volume(cubic miles): "+volEarth);
        System.out.println("Sun volume(cubic miles): "+volSun);
        System.out.println("Sun/Earth volume ratio: "+ratio);
    }
}
