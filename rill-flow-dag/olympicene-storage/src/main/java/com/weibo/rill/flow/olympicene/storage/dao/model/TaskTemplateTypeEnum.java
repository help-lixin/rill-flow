/*
 *  Copyright 2021-2023 Weibo, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.weibo.rill.flow.olympicene.storage.dao.model;

import lombok.Getter;

/**
 * 模板类型，0. 函数模板，1. 插件模板，2. 逻辑模板
 */
@Getter
public enum TaskTemplateTypeEnum {
    FUNCTION(0, "函数模板"),
    PLUGIN(1, "插件模板"),
    LOGIC(2, "逻辑模板");

    private final int type;
    private final String desc;

    TaskTemplateTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static TaskTemplateTypeEnum getEnumByType(int type) {
        return switch (type) {
            case 0 -> FUNCTION;
            case 1 -> PLUGIN;
            case 2 -> LOGIC;
            default -> null;
        };
    }
}
