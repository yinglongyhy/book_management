package cn.scau.db.bookmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinglongyhy
 * @since 2020-03-09
 */
@ApiModel(value="Admin对象", description="")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理员id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "帐号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createBy;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Admin{" +
            "id=" + id +
            ", account=" + account +
            ", password=" + password +
            ", name=" + name +
            ", createBy=" + createBy +
            ", modifyBy=" + modifyBy +
        "}";
    }
}
