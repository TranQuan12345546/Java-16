package QuanLyNhanVien.Constance;

public enum GroupContance {
    ELECTRONIC("Điện tử"),
    REFRIGERATION("Điện lạnh"),
    COMPUTER("Máy tính"),
    OFFICESUPPLY("Thiết bị văn phòng");

    public String value;

    GroupContance(String value) {
        this.value = value;
    }

}
