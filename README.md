在线学堂-分布式开发框架敏捷开发：

后台管理系统 前台展示系统 搜索系统 单点登录系统

架构设计

hxshow-parent(父工程，pom)

hxshow-common（公共工程，jar包）

hxshow-manager（后台管理系统，聚合工程pom,包含以下4部分）

hxshow-manager-pojo (逆向工程生成,jar) hxshow-manager-mapper（mybatis持久层,jar） hxshow-manager-service(服务层，jar) hxshow-manager-controller （web层，war）
技术选型：

（1）spring ，springMVC ，mybatis

（2）JSP , jquery ,bootstrap , kindEditor(富文本编辑器) ，css+div

（3）redis 缓存服务器

（4）solr 搜索

（5）mysql数据库

（6）httplclient 调用系统服务

（7）Nginx(web服务器)