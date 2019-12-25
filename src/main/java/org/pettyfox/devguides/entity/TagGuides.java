package org.pettyfox.devguides.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.Builder;

/**
 * <p>
 * 
 * </p>
 *
 * @author pettyfox
 * @since 2019-12-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("tag_guides")
public class TagGuides implements Serializable {

    private static final long serialVersionUID = 1L;



    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * tag标签
     */
    private String name;

    private Integer dependencyId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String remarks;


}
