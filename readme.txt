
b站    编程不良人   
快速入门Spring,          https://www.bilibili.com/video/BV12k4y167jK
Spring 从入门到精通   https://www.bilibili.com/video/BV15E411p7vk

ssm 注解式开发


目录结构
/
---- src
---- ----main
---- ---- ---- java
---- ---- ---- ---- com.tz.leo.spring 
---- ---- ---- ---- -----------------action
---- ---- ---- ---- -----------------service
---- ---- ---- ---- -----------------dao
---- ---- ---- ---- -----------------entity
---- ---- ---- ---- -----------------test

---- ---- ---- resources
---- ---- ---- ---- com.tz.leo.spring
---- ---- ---- ---- -----------------mapper
---- ---- ---- ---- ------------------------userDaoMapper.xml 
---- ---- ---- ---- spring-back.xml 
---- ---- ---- ---- struts.xml 
---- ---- ---- webapp
---- ---- ---- ---- WEB-INF
---- ---- ---- ---- ---- web.xml
---- ---- ---- ---- index.jsp
---- ---- ---- ---- showAll.jsp 


一、导入jar包 
1. 导入spring相关jar包
        spring-core
        spring-web
        spring-context
        spring-context-support 
        spring-aspect
		spring-aop
        spring-jdbc
        spring-expression
		spring-beans
2.导入mybatis
3.导入struts2(包含servlet)		
4.导入mybatis-spring握手jar
5.导入struts2-spring-plugin握手jar 
6.导入mysql
7.导入druid
8.导入log4j-core(slf4j-log4j12)
9.导入jstl

二、src/main/resources目录下新建 spring-basic.xml 这个（Spring Config）类型的文件
1.开启注解扫描
2.创建数据源对象dataSource
3.创建SqlSessionFactory对象（org.mybatis.spring.SqlSessionFactoryBean）
4.创建dao对象(org.mybatis.spring.mapper.MapperScannerConfigurer)
5.创建事务管理器对象(org.springframework.jdbc.datasource.DataSourceTransactionManager)
6.开启注解事务驱动  

三、测试spring mybatis 是否通畅
1. 在各个包中新增对应文件
2. com.tz.leo.spring.test.testSpring.java 中启动spring 代码如下
public class testSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-basic.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

四、配置 spring mybatis struts 
1. 配置struts 与spring 连接  详见web.xml 
   1. 配置struts核心控制器  (org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter)
   2. 配置spring启动工厂含配置文件   (org.springframework.web.context.ContextLoaderListener)
      目录 src/main/webapp/WEB-INF/web.xml 文件如下
<web-app>
  <display-name>Archetype Created Web Application</display-name>
  <!--配置struts核心控制器-->
  <filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
  <filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>

  <!--配置spring启动工厂含配置文件 如下配置替代 new ClasspathXmlApplicationContext(**) 方式启动spring -->
  <listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>
  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:spring-basic.xml</param-value>
  </context-param>
</web-app>	  

五、 启动tomcat容器启动ssm项目 
1. 配置tomcat 容器，启动项目 
1.1 状态栏点击 edit Configuration （启动按钮旁边）,弹出Run/Debug Configurations
1.2 点击 + ，新增 tomcat 容器  （本地测试用的是 jdk 1.7/ Tomcat8.0.35 ）
1.3  配置名称如  spring_ssm_annotaion
1.4 shift+F10 启动此项目 http://localhost:8080/spring_ssm_annotaion/
    默认显示webapp/index.jsp 下面的目录 
1.5 测试struts路由是否正确
    按照struts.xml配置文件的配置，更改url参数 为 http://localhost:8080/spring_ssm_annotaion/user/findAll
    resources/struts.xml 中的内容如下所示
<struts>
    <package name="user"  extends="struts-default" namespace="/user">
        <action name="findAll" class="userAction" method="findAll">
            <result name="success">/showAll.jsp</result>
        </action>
    </package>
</struts>


 六、 相关sql
CREATE DATABASE ssm;

use ssm;

CREATE TABLE user
(
Id int,
name varchar(255),
age int,
bir date
);

use ssm;
insert INTO USER VALUES (1,'zhangsan',11,'2020/11/11');
insert INTO USER VALUES (2,'lisi',22,'2020/12/12');

