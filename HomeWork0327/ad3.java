package HomeWork0327;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ad3 {
    private int no;
    private String id;
    private String name;
    private Date lastLoginDate;
    private String Status;

    public ad3(int no, String id, String name, Date lastLoginDate, String status) {
        this.no = no;
        this.id = id;
        this.name = name;
        this.lastLoginDate = lastLoginDate;
        Status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
    public long getDiffDate() {
        LocalDate lastLogin = new java.sql.Date(lastLoginDate.getTime()).toLocalDate();
        LocalDate today = LocalDate.now();
        return ChronoUnit.DAYS.between(lastLogin, today);
    }
    public static void main(String[] args) {

    }
}
