package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.pojo.Ebook;
import com.jiawa.wiki.pojo.EbookExample;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.util.CopyUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper ebookMapper;
    public List<EbookResp> list(EbookReq req){
        // 设置检索条件22-24行
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%"+req.getName()+"%");
        }

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

       /* List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
             EbookResp ebookResp = new EbookResp();
             BeanUtils.copyProperties(ebook, ebookResp);
             // 对象复制
            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);

            respList.add(ebookResp);
        }*/

        // 列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
