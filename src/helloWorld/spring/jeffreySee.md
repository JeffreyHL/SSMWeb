#Spring jar包详解

*	核心基础包（必须）
	 
	spring-core.jar：	Spring最基本的核心工具类。其它组件要都要使用到这个包里的类，是其它组件的基本核心，当然你也可以在自己的应用系统中使用这些工具类。 
									外部依赖Commons Logging(Log4J)。
									
	spring-beans.jar：	所有应用都要用到，它包含访问配置文件、创建和管理bean以及进行IoC/DI（Inversion of Control / Dependency Injection）操作相关的所有类。
									外部依赖spring-core(CGLIB)。
									如果应用只需基本的IoC/DI支持，引入spring-core.jar及spring-beans.jar 文件就可以了。 
									
	spring-aop.jar：		AOP特性所需的类和源码级元数据支持。使用基于AOP的Spring特性，如声明型事务管理（Declarative Transaction Management），也要在应用里包含这个jar包。 
									外部依赖spring-core， (spring-beans，AOP Alliance， CGLIB，Commons Attributes)。 
									
	spring-context.jar：	提供在基础IOC功能上的扩展服务，此外还提供许多企业级服务的支持，有邮件服务、任务调度、JNDI定位，EJB集成、远程访问、缓存以及多种视图层框架的支持。
									外部依赖spring-beans, (spring-aop)。
									可以找到使用Spring ApplicationContext特性时所需的全部类，JDNI所需的全部类，instrumentation组件以及校验Validation方面的相关类。 
	
*	MVC相关包
	
	spring-web.jar：		Web应用开发时所需的核心类，包括自动载入Web Application Context特性的类、Struts与JSF集成类、文件上传的支持类、Filter 类和大量工具辅助类。 
									外部依赖spring-context, Servlet API, (JSP API, JSTL, Commons FileUpload, COS)。 
	
	spring-webmvc.jar：	Spring MVC框架相关的所有类。包含国际化、标签、Theme、视图展现的FreeMarker、JasperReports、Tiles、Velocity、XSLT相关类。以及Servlets，Web MVC框架，控制器和视图支持。
									外部依赖spring-web, (spring-support，Tiles，iText，POI)。 
									当然，如果你的应用使用了独立的MVC框架，则无需这个JAR文件里的任何类。 
	
	spring-context-support.jar：	Spring context的扩展支持，用于MVC方面。
	spring-webmvc-portlet.jar：	Spring MVC的增强

*	其他包

	基础功能
	spring-expression.jar：	Spring表达式语言。
	spring-oxm.jar：		Spring对于object/xml映射的支持，可以让JAVA与XML之间来回切换
	
	服务器
	spring-instrument.jar：	Spring对服务器的代理接口
	spring-instrument-tomcat.jar：	Spring对tomcat连接池的集成
	
	数据库
	spring-jdbc.jar：	对JDBC数据访问进行封装的所有类。 外部依赖spring-beans，spring-dao。 
	spring-orm.jar：		整合第三方的orm实现，如hibernate，ibatis，jdo以及spring 的jpa实现
	spring-tx.jar：		为JDBC、Hibernate、JDO、JPA等提供的一致的声明式和编程式事务管理。
	
	其他功能
	spring-aspects.jar：	提供对AspectJ的支持，以便可以方便的将面向方面的功能集成进IDE中，比如Eclipse AJDT。 
	spring-jms.jar：		为简化jms api的使用而做的简单封装。 外部依赖spring-beans，spring-dao，JMS API。 
	spring-messaging.jar：
	spring-test.jar：	对JUNIT等测试框架的简单封装
	spring-websocket.jar：
