package org.pettyfox.devguides.service.impl;

import org.pettyfox.devguides.entity.Dependency;
import org.pettyfox.devguides.mapper.DependencyMapper;
import org.pettyfox.devguides.service.DependencyService;
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
public class DependencyServiceImpl extends ServiceImpl<DependencyMapper, Dependency> implements DependencyService {

}
