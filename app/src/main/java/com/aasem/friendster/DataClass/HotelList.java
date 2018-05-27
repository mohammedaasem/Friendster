package com.aasem.friendster.DataClass;

/**
 * Created by inspire_info_soft on 5/27/2018.
 */

public class HotelList {

    String hotelName, hotelContactNumber, hotelAddress, hotelType, hotelImage;
    int image;

    public HotelList(String hotelName, String hotelContactNumber, String hotelAddress, String hotelType,int image) {
        this.hotelName = hotelName;
        this.hotelContactNumber = hotelContactNumber;
        this.hotelAddress = hotelAddress;
        this.hotelType = hotelType;
        this.image=image;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelContactNumber() {
        return hotelContactNumber;
    }

    public void setHotelContactNumber(String hotelContactNumber) {
        this.hotelContactNumber = hotelContactNumber;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getHotelImage() {
        return hotelImage;
    }

    public void setHotelImage(String hotelImage) {
        this.hotelImage = hotelImage;
    }
}
