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
@ApiModel(value="BookCategory对象", description="")
public class BookCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "书籍类型id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "书籍类型名")
    private String name;

    @ApiModelProperty(value = "该类型下isbn数量")
    private Integer isbnCount;

    @ApiModelProperty(value = "该类型下书籍数量")
    private Integer bookCount;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getIsbnCount() {
        return isbnCount;
    }

    public void setIsbnCount(Integer isbnCount) {
        this.isbnCount = isbnCount;
    }
    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
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
        return "BookCategory{" +
            "id=" + id +
            ", name=" + name +
            ", isbnCount=" + isbnCount +
            ", bookCount=" + bookCount +
            ", createBy=" + createBy +
            ", modifyBy=" + modifyBy +
        "}";
    }
}
