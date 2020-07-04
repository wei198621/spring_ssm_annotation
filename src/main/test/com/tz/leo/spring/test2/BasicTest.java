package com.tz.leo.spring.test2;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author: tz_wl
 * Date: 2020/7/4 18:26
 * Content:
 *
 * spring + junit 提供快速测试   需要引入 spring_test  引入jar 包 4.12 or high
 *
 <dependency>
 <groupId>junit</groupId>
 <artifactId>junit</artifactId>
 <version>4.12</version>
 <scope>test</scope>
 </dependency>
 * @RunWith 用在类上  测试时候创建指定类的实例
 * SpringJUnit4ClassRunner 相当于 ContextLoaderListener (服务器启动的时候创建工厂)
 * @ConTextConfiguration 指定配置文件所在位置
 * 以上两个参数指令完成后  spring工厂会自动完成bean 创建 ，时候的时候直接用就可以了
 *                     userService 已经创建好，直接使用@Autowired 引入就可以使用了，
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-basic.xml")
public class BasicTest {
}
