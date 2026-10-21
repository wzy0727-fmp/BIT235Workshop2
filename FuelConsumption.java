public class FuelConsumption {
    public static void main(String[] args) {
        double tank = 40;
        double normalPer100km = 8;
        double roughPer100km = normalPer100km * 1.15; //+15%
        
        // 能跑距离：(总油量 / 每百公里油耗 ) *100
        double distanceNormal = (tank / normalPer100km) *100;
        double distanceRough = (tank / roughPer100km) *100;
        
        System.out.println("Normal road distance(km): "+distanceNormal);
        System.out.println("Rough road distance(km): "+distanceRough);
    }
}
