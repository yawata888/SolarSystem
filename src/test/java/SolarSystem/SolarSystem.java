package SolarSystem;

public class SolarSystem {
    public static void main(String[] args) {
        solarSystemBase solar=new solarSystemBase();
        solar.sun="1";
        solar.planet="2";
        solar.star="2";
        System.out.println("The solar system is ready ");
        featureSun xros=new featureSun();
        xros.color="pink";
        xros.temp="23424Kv";
        xros.size="OKm";

        planet2 perox =new planet2();
        perox.color="green";
        perox.size="1m";
        perox.radius="3m";

    }
}
