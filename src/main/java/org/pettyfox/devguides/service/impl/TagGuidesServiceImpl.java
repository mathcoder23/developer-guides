package org.pettyfox.devguides.service.impl;

import org.pettyfox.devguides.entity.TagGuides;
import org.pettyfox.devguides.mapper.TagGuidesMapper;
import org.pettyfox.devguides.service.TagGuidesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pettyfox
 * @since 2019-12-24
 */
@Service
public class TagGuidesServiceImpl extends ServiceImpl<TagGuidesMapper, TagGuides> implements TagGuidesService {

}
