applicationContext-dao任务：
1.配置数据源
2.需要让spring容器管理SqlSessionFactory，单利存在
3.把mapper代理对象放到spring容器。使用扫描包的方式

applicationContext-service任务：
1.配置事物
2.需要将service实现类对象放到spring容器中管理

springmvc表现层任务：
附：springmvc三大组件：处理器映射器、处理器适配器、视图解析器
1.配置注解驱动——annotation-driven（处理器映射器、处理器适配器）
2.配置视图解析器，视图解析器需要自己配置
3.需要扫描controller

Web.xml:
1.spring容器配置
2.springmvc前端控制器配置
3.Post乱码过滤器
4.拦截URL

框架整合思路：
因为只有manage-web是一个war包，其他工程只是一个jar包。Tomcat无法从jar包读取配置文件
，这些配置文件最终是由Tomcat来读取的。
