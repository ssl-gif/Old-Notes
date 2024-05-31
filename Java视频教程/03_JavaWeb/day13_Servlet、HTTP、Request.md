# day13_Servlet、HTTP、Request



## 一.Servlet

​	Servlet接口的体系结构：

​												Servlet			-- 接口

​												| implements

​												GenericServlet 	-- 抽象类，实现了Servlet接口

​												| extends

​												HttpServlet		-- 抽象类，继承了GenericServlet类

1.GenericServlet 抽象类

​	将Servlet接口中的其它方法做了默认空实现，只将 service() 抽象方法原封不动地继承过来了。所以在创建Servlet的时候，我们可以直接继承 GenericServlet 抽象类，此时只需要实现 service() 方法即可，需要重写 init()、destroy() 等方法时再重写即可。

2.HttpServlet 抽象类：对HTTP协议的一种封装

​	实现了 GenericServlet 抽象类中的 service() 抽象方法，将其他方法原封不动地继承过来了。HttpServlet在实现 service() 方法的时候，对浏览器发送过来的 "HTTP请求" 做了判断：如果是 GET 请求方式，就调用 doGet() 方法；如果是 POST 请求方式，就调用 doPost() 方法。所以在创建Servlet的时候，我们可以直接继承 HttpServlet 抽象类，此时只需要重写 doGet()、doPost() 方法即可，需要重写 init()、destroy() 等方法时再重写即可。当浏览器发送的是 GET 请求时，就会调用重写后的 doGet() 方法；当浏览器发送的是 POST 请求时，就会调用重写后的 doPost() 方法。

(1).重写 doGet()、doPost() 方法时，一定要删除掉IDEA自动生成的 super.doGet(req,resp); 、super.doPost(req,resp); 语句，不然会先调用父类中的  doGet()、doPost() 方法产生报错。（可以看下HttpServlet中这两个方法的源码，查看报错原因）

(2).HTML和Servlet的交互方式：

​	使用浏览器访问 http://localhost:8080/day13_code_war_exploded/demo02 时，浏览器默认发送的都是 GET 请求。所以我们可以创建一个 Demo02_HTTPServlet.html 文件，使用表单来构造 GET、POST 请求。当我们提交表单时，如何让请求转发到 Demo02_HTTPServlet 这一Servlet中呢？通过配置 \<form> 表单的action属性值为 "/day13_code_war_exploded/demo02" 即可。

​	如果要把提交表单数据的请求转发到相应的Servlet，action属性配置方式为："/虚拟目录/Servlet资源路径"

#.注意：一定要阅读 Servlet、GenericServlet、HttpServlet 这三个类的源码，体会 "抽象类实现接口中的部分方法" 这一思想。



## 二.HTTP
