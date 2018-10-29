package com.baidu.disconf.client.core.filetype.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.baidu.disconf.client.config.DisClientConfig;
import com.baidu.disconf.client.core.filetype.DisconfFileTypeProcessor;
import com.baidu.disconf.client.support.utils.ConfigLoaderUtils;

/**
 * Properties 处理器
 *
 * @author knightliao
 */
public class DisconfPropertiesProcessorImpl implements DisconfFileTypeProcessor {

    @Override
    public Map<String, Object> getKvMap(String fileName) throws Exception {

        Properties properties;

        // 读取配置
        properties = ConfigLoaderUtils.loadConfig(fileName);
        if (properties == null) {
            return null;
        }

        String keys = DisClientConfig.getInstance().EXCLOUD_PROPERTIES_KEYS;
        List<String> excloud_properties=new ArrayList<>();
        if(keys!= null && !keys.isEmpty()){
             String[] split =  keys.split(",");
            Arrays.stream(split).forEach(item->excloud_properties.add(item));
        }

        Map<String, Object> map = new HashMap<String, Object>();
        for (Object object : properties.keySet()) {
            String key = String.valueOf(object);
            Object value = properties.get(object);
            if(excloud_properties.isEmpty()){
                map.put(key, value);
            }
            else if(!excloud_properties.stream().anyMatch(item->(key.contains(item)))){
                map.put(key, value);
            }

        }

        return map;
    }
}
