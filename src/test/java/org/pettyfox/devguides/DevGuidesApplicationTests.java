package org.pettyfox.devguides;

import com.baomidou.mybatisplus.extension.api.Assert;
import org.junit.jupiter.api.Test;
import org.pettyfox.devguides.entity.Dependency;
import org.pettyfox.devguides.service.DependencyService;
import org.pettyfox.devguides.service.TagGuidesService;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DevGuidesApplicationTests {

    @Test
    void contextLoads() {
    }
    @Resource
    TagGuidesService tagGuidesService;
    @Resource
    DependencyService dependencyService;
    @Test
    void projectMysqlInitTest(){
        Dependency dependency = Dependency.builder()
                .id(1)
                .license(Dependency.License.FAIL).build();
        dependencyService.updateById(dependency);

        Dependency dependency1 = dependencyService.getById(1);
        Assert.eq(dependency1.getLicense(),dependency.getLicense(),null);
    }

}
