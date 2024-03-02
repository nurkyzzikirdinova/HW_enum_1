public enum TransportType {

    CAR(0.1), // public static   TransportType CAR =new TransportType();
    BUS(0.05),// public static   TransportType  BUS =new TransportType();
    TRUCK(0.02);// public static   TransportType  TRUCK =new TransportType();

    double price;
    private double distance;

    TransportType(double price) {
        this.price = price;
    }

    /**
     * (CAR)  Автоунаанын бир километринин баасы $0,1.
     * (BUS)  Автобустун бир километринин баасы $0,05
     * (TRUCK.) Трак үчүн бир километрдин баасы $0,02
     */


    public double calculateTravelCost(double distance) {
        return distance * price;
    }

//    @Override
//    public String toString() {
//        return "TransportType{" +
//                "price=" + price +
//                ", distance=" + distance +
//                "} " + super.toString();
//    }
}
