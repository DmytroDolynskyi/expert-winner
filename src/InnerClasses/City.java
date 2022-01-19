package InnerClasses;

public class City {
    private String country;
    private String city;
    private CityDetail cityDetail;

    private class CityDetail {

        private String avenue;
        private String street;
        private String square;

        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setSquare(String square) {
            this.square = square;
        }
    }
}
