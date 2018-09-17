package cn.llyong.module.domain;

import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/17
 * @time: 09:41
 * @version: 1.0
 */
@Data
public class Dept {
    private Long id;

    private String deptId;

    private String deptName;

    private String parentId;

    private Integer level;

    private Integer seq;

    private String remark;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

//    private static final long serialVersionUID = 1L;
}
