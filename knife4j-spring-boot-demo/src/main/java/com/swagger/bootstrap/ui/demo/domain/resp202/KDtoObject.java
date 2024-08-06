/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.swagger.bootstrap.ui.demo.domain.resp202;


import java.util.List;

/***
 *
 * @since:knife4j-spring-boot-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2020/03/04 8:58
 */
public class KDtoObject {

    private String key;
    private String value;
    private List<GetArray> nodes;
    private GetArray obj;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public GetArray getObj() {
        return obj;
    }

    public void setObj(GetArray obj) {
        this.obj = obj;
    }

    public List<GetArray> getNodes() {
        return nodes;
    }

    public void setNodes(List<GetArray> nodes) {
        this.nodes = nodes;
    }
}
