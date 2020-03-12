package cn.scau.db.bookmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinglongyhy
 * @since 2020-03-09
 */
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "身份证号")
    @TableId(value = "id_card", type = IdType.INPUT)
    private String idCard;

    @ApiModelProperty(value = "帐号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createBy;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyBy;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getCreateBy() {
        return createBy;
    }

    public void setCreateBy(LocalDateTime createBy) {
        this.createBy = createBy;
    }
    public LocalDateTime getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(LocalDateTime modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public String toString() {
        return "User{" +
            "idCard=" + idCard +
            ", account=" + account +
            ", password=" + password +
            ", name=" + name +
            ", phoneNumber=" + phoneNumber +
            ", email=" + email +
            ", createBy=" + createBy +
            ", modifyBy=" + modifyBy +
        "}";
    }
}
