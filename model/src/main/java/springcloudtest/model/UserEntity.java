package springcloudtest.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class UserEntity implements Serializable {
    private static final long serialVersionUID = 4802877064737620030L;
    @Id
    private Long userId;
    @Column
    private String userName;
    @Column
    private String nickName;
    @Column
    private String emailSys;
    @Column
    private String defLang;
    @Column
    private String defSkin;
    @Column
    private Boolean inUse;
    @Column
    private Long opId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmailSys() {
        return emailSys;
    }

    public void setEmailSys(String emailSys) {
        this.emailSys = emailSys;
    }

    public String getDefLang() {
        return defLang;
    }

    public void setDefLang(String defLang) {
        this.defLang = defLang;
    }

    public String getDefSkin() {
        return defSkin;
    }

    public void setDefSkin(String defSkin) {
        this.defSkin = defSkin;
    }

    public Boolean getInUse() {
        return inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    public Long getOpId() {
        return opId;
    }

    public void setOpId(Long opId) {
        this.opId = opId;
    }
}
