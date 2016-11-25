package helloWorld.mybatis;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import helloWorld.mybatis.bean.User;
import helloWorld.mybatis.bean.UserMapper;

public class HelloWorld {
	private final Logger log = Logger.getLogger(HelloWorld.class);

	private SqlSession session = null;
	private UserMapper userMapper = null;
	
	public static void main(String[] args) {
	    new HelloWorld();
	    System.out.println("Hello, MyBatis!");
	}
	
	public HelloWorld(){
		log.debug("HAHA");
		session = initSession();
		userMapper = session.getMapper(UserMapper.class);
		testInsert();
		testUpdate();
		testSelect();
		testDelete();
		if(null != session){
			session.commit();
			session.close();
		}
	}
	
	private void testDelete(){
		System.out.println(userMapper.deleteUser(11));
	}
	
	private void testUpdate(){
		User user = new User();
		user.setUserID(11);
		user.setName("修改");
		System.out.println(userMapper.updateUser(user));
	}
	
	private void testInsert(){
		User user = new User();
		user.setUserID(11);
		user.setName("修改");
		System.out.println(user.toString());
		System.out.println(userMapper.insertUser2(user));
		//批量插入
		User u1 = new User();
		u1.setName("修改");
		User u2 = new User();
		u2.setName("修改");
		List<User> l = new ArrayList<User>();
		l.add(u1);
		l.add(u2);
		userMapper.insertBatch(l);
	}
	
	
	private void testSelect(){
		User user = userMapper.selectUser("10003");
		System.out.println(user.toString());
		user = userMapper.selectUser2("10000");
		System.out.println(user.toString());
		List<User> list = userMapper.selectAll();
		for(User u : list){
			System.out.println(u.toString());
		}
		
		List<User> list2 = userMapper.fuzzyQuery("展");
		for(User u : list2){
			System.out.println(u.toString());
		}
	}
	
	private SqlSession initSession(){
		//获取配置文件的输入流  
	    InputStream is;
		try {
			is = Resources.getResourceAsStream("helloWorld/mybatis/config.xml");
			//获取我们的SqlSessionFactory（相当于Hibernate的SessionFactory）；SqlSessionFactoryBuilder有点类似于Hibernate的Configuration。  
		    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);  
		    //获取一个Session  
		    return sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}



	