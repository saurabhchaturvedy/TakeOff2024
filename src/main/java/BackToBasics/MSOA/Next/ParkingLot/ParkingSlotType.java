package BackToBasics.MSOA.Next.ParkingLot;

public enum ParkingSlotType {





    SMALL {

        @Override
        public double getPriceForParking(long duration){
            return 50.0;
        }
    },COMPACT {

        @Override
        public double getPriceForParking(long duration){
            return 50.0;
        }
    },
    MEDIUM {

        @Override
        public double getPriceForParking(long duration){
            return 50.0;
        }
    },
    LARGE {

        @Override
        public double getPriceForParking(long duration){
            return 50.0;
        }
    };








    public abstract double getPriceForParking(long duration);
}
