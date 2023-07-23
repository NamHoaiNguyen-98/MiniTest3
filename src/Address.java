public class Address {
    private String province;
    private String district;
    private String wards;
    private String number_home;

    public Address() {
    }

    public Address(String province, String district, String wards, String number_home) {
        this.province = province;
        this.district = district;
        this.wards = wards;
        this.number_home = number_home;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getNumber_home() {
        return number_home;
    }

    public void setNumber_home(String number_home) {
        this.number_home = number_home;
    }

    @Override
    public String toString() {
        return  "[ "+
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", wards='" + wards + '\'' +
                ", number_home='" + number_home + '\''+"]";
    }
}
