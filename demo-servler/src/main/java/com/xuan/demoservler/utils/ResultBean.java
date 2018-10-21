package com.xuan.demoservler.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2018/10/21
 * @Time: 14:29
 */
@Getter
@Setter
@ToString
public class ResultBean {
    private String data;

    public ResultBean(String data) {
        this.data = data;
    }
}
