package com.study.spring.service;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.spring.entity.NovelEntity;

import java.util.List;
import java.util.Map;

/**
 * @author liuyzh
 * @description
 * @date 2019-10-16
 */
public interface MpNovelService extends IService<NovelEntity> {

    List<NovelEntity> getNovelInfo(String d);

    Integer findMaxId();

    List<NovelEntity> getDownloadList(Map<String,String> map);
}
