package org.pettyfox.devguides.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.pettyfox.devguides.config.BaseEnum;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class Dependency implements Serializable {

    private static final long serialVersionUID = 1L;



    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 注释说明
     */
    private String remarks;

    private LocalDateTime careteTime;

    private LocalDateTime updateTime;

    private String groudId;

    private String artifactId;

    private String scope;

    private String exclusions;

    private String version;

    /**
     * 注释[success(0):成功, fail(1):失败]
     */
    private License license;

    public enum License implements BaseEnum<License,Integer>{
        SUCCESS(0,"成功"),
        FAIL(1,"失败");

        private final int value;
        private final String name;

        License(int value, String name) {
            this.value = value;
            this.name = name;
        }
        @Override
        public String getName() {
            return this.name;
        }
        @Override
        public Integer getValue() {
            return value;
        }
    }


}
