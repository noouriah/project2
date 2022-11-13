public class Clinic {
    private int floorNumber,roomNumber;
    private String roomType;
    private double priceroom;
    private boolean isFree;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPriceroom() {
        return priceroom;
    }

    public void setPriceroom(double priceroom) {
        this.priceroom = priceroom;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isFree() {
        return isFree;
    }



}
